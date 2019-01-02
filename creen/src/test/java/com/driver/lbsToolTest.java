package com.driver;
import com.driver.tool.HttpClien;
import com.driver.tool.Variables;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
public class lbsToolTest {
    /*
    云儲存（v4接口）
     */
    public static String LbsAddShop() throws IOException {
        PrintWriter out = null;
        BufferedReader in = null;
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("title", "test2");
        params.put("address", "四川成都");
        params.put("tags", "景點");
        params.put("latitude", "30.6652553277");
        params.put("longitude", "104.0669106007");
        params.put("coord_type", "3");
        params.put("geotable_id", Variables.baidu_map_table_id);
        params.put("ak", Variables.baidu_map_key);
        params.put("shopID", "18");
        String result = "";
        try {
            URL realUrl = new URL("http://api.map.baidu.com/geodata/v4/poi/create");
            // 打开和URL之间的连接
            HttpURLConnection conn = (HttpURLConnection) realUrl.openConnection();
            // 设置请求头参数
            conn.setRequestProperty("Content-Type", "multipart/form-data; charset=UTF-8;");
            conn.setRequestMethod("POST");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setUseCaches(false);//Post 请求不能使用缓存
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            System.out.println(params.toString());
            out.write(params.toString());
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }

    /*
 云存储TEST
  */
    public static String test1() {
        String result="";
        Map<String, String> params = new HashMap<String, String>();
        params.put("title", "test2");
        params.put("address", "四川遂宁");
        params.put("tags", "酒店");
        params.put("latitude", "31.6652553277");
        params.put("longitude", "104.0669106007");
        params.put("coord_type", "3");
        params.put("geotable_id", String.valueOf(Variables.baidu_map_table_id));
        params.put("ak", Variables.baidu_map_key);
        params.put("shopID", "18");
        try {
             result = HttpClien.sendPost("http://api.map.baidu.com/geodata/v3/poi/create", params, "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }


    /**
     * 云检索TEST
     */
    public static  String test2(){

        StringBuilder sb = new StringBuilder(Variables.baidu_retrieval);
        sb.append(String.format("?geotable_id=%s",Variables.baidu_map_table_id));
        sb.append(String.format("&ak=%s",Variables.baidu_map_key));
        sb.append(String.format("&location=%s","104.0669106008,31.6652553278"));
        sb.append(String.format("&radius=%s","10000000"));
        sb.append(String.format("&tags=%s","娱乐"));
        String result = HttpClien.sendGet(sb.toString());
         return  result;

    }

    public static void main(String[] args) {
        test2();
    }


}

