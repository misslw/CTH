package com.driver.mapper;

import com.driver.entity.Product;
import com.driver.entity.Shop;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopMapper {
    /**
    * @Author:wx
    * @Description:添加商家信息
    * @Date:10:02 2018\12\28 0028
    */
    @Insert("inSert into shop(shop_name,province,city,county,adrress,longitude,latitude,businessHour,type,shop_id) values(#{shop_name},#{province},#{city},#{county},#{adrress},#{longitude},#{latitude},#{businessHour},#{type},#{shop_id})")
    int createLBSParams(@Param("shop_name") String shop_name,@Param("province") String province,@Param("city") String city,@Param("county") String county,@Param("adrress") String adrress,@Param("longitude") String longitude,@Param("latitude") String latitude,@Param("businessHour") String businessHour,@Param("type") String type,@Param("shop_id") String shop_id);
    /**
    * @Author:wx
    * @Description:商家详情产品列表
    * @Date:15:28 2018\12\29 0029
    */
    @Select("SELECT\n" +
            "\tpro.*\n" +
            "FROM\n" +
            "\tproduct pro\n" +
            "LEFT JOIN shop sh ON pro.shop_id = sh.shop_id\n" +
            "WHERE\n" +
            "\tpro.shop_id = #{shop_id}")
    List<Product> getShopDetais(@Param("shop_id") String id );
}
