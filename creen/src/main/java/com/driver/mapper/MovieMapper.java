package com.driver.mapper;

import com.driver.entity.Movie;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @Author:wx
* @Description:影视接口
* @Date:10:02 2018\12\28 0028
*/
@Repository
public interface MovieMapper {
    /**
    * @Author:wx
    * @Description:插入
    * @Date:10:02 2018\12\28 0028
    */
    @Insert({"insert into movies (name,photo,url,uploadTime,type,size,lujing) values (#{name},#{photo},#{url},#{uploadTime},#{type},#{size},#{lujing})"})
    public int insertUrl(@Param("name")String name, @Param("photo")String photo, @Param("url")String url,@Param("uploadTime")String uploadTime,@Param("type")String type,@Param("size")String size,@Param("lujing")String lujing);
    /**
    * @Author:wx
    * @Description:查询
    * @Date:10:02 2018\12\28 0028
    */
    @Select("select * from movies")
    public List<Movie> selectShipin();
    /**
    * @Author:wx
    * @Description:影视详情
    * @Date:10:51 2019\1\2 0002
    */
   @Select("select * from movies where id=#{id}")
    public Movie getMovieDetails(@Param("id")String id );
}
