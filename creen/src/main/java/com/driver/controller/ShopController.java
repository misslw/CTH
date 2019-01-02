package com.driver.controller;
import com.alibaba.fastjson.JSON;
import com.driver.entity.Product;
import com.driver.service.ShopService;
import com.driver.tool.FastJsonUtil;
import com.driver.tool.HttpClien;
import com.driver.tool.Variables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import javax.websocket.server.PathParam;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @Author:wx
 * @Description:商家控制类
 * @Date:13:15 2018\12\26 0026
 */
@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    ShopService shopService;
/**
* @Author:wx
* @Description: 百度云lbs云存储商家信息（adress,point,shopID,name）
* @Date:9:57 2018\12\28 0028
*/
    @RequestMapping("/addshop")
    @ResponseBody
        public String  addShop(String title,String adress,String tags,String latitude,String longitude,String province,String city,String country,String businessHour) {
        if(latitude==null||longitude==null){
            return "请传递必要参数";
        }
        Map<String ,String > params=new HashMap<String ,String>();
        String result="";
        params.put("title",title);
        params.put("address",adress);
        params.put("tags",tags);//标签类型（酒店，景点，餐饮）
        params.put("latitude",latitude);
        params.put("longitude",longitude);
        params.put("coord_type","3");
        params.put("geotable_id", String.valueOf(Variables.baidu_map_table_id));
        params.put("ak",Variables.baidu_map_key);
        params.put("businessHour",businessHour);
        try {
            result = HttpClien.sendPost(Variables.baidu_storage,params,"utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
         String shopId=  String.valueOf(FastJsonUtil.json2Map(result).get("id"));
       if(tags.equals("餐饮")){
            shopService.createLBSParams(title,province,city,country,adress,longitude,latitude,businessHour,"1",shopId);
        }else if(tags.equals("景点")){
            shopService.createLBSParams(title,province,city,country,adress,longitude,latitude,businessHour,"2",shopId);
        }else if(tags.equals("酒店")){
            shopService.createLBSParams(title,province,city,country,adress,longitude,latitude,businessHour,"3",shopId);
        }else if(tags.equals("娱乐")){
            shopService.createLBSParams(title,province,city,country,adress,longitude,latitude,businessHour,"4",shopId);
        }else{
        }
        return result;
}
/**
* @Author:wx
* @Description:商家产品列表.=-
* @Date:15:28 2018\12\29 0029
*/
@RequestMapping("/getShopToProduct")
@ResponseBody
public List<Product> getShopDetais(@PathParam("id")String  id ){
    List<Product> shopDetais = shopService.getShopDetais(id);
return shopDetais;
}
/**
* @Author:wx
* @Description:location：LBS云检索
 * location:地点（经度，纬度）
 * radius：检索半径
 * type:类型(1.餐饮2.景点3.酒店4.娱乐)
* @Date:9:56 2018\12\28 0028
*/
@RequestMapping("/selectShop")
        public Object selectShop(String location, String radius,String type) {
    String result = "";
    if (location == null || radius == null || type == null) {
        return "请传递必要参数";
    }
    StringBuilder sb = new StringBuilder(Variables.baidu_retrieval);
    sb.append(String.format("?geotable_id=%s", Variables.baidu_map_table_id));
    sb.append(String.format("&ak=%s", Variables.baidu_map_key));
    sb.append(String.format("&location=%s", location));
    sb.append(String.format("&radius=%s", radius));
    if (Integer.parseInt(type) == 1) {
        sb.append(String.format("&tags=%s", "餐饮"));
        result = HttpClien.sendGet(sb.toString());
    } else if (Integer.parseInt(type) == 2) {
        sb.append(String.format("&tags=%s", "景点"));
        result = HttpClien.sendGet(sb.toString());
    } else if (Integer.parseInt(type) == 3) {
        sb.append(String.format("&tags=%s", "酒店"));
        result = HttpClien.sendGet(sb.toString());
    } else if (Integer.parseInt(type) == 4) {
        sb.append(String.format("&tags=%s", "娱乐"));
        result = HttpClien.sendGet(sb.toString());
    } else {
        result = "请求失败，请稍后再试";
    }
    return JSON.parse(result);
}}