package com.driver.mapper;

import com.driver.entity.Music;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @Author:wx
* @Description:音乐接口
* @Date:15:21 2018\12\27 0027
*/
@Repository
public interface MusicMapper {
    /**
    * @Author:wx
    * @Description:查询音乐列表
    * @Date:15:22 2018\12\27 0027
    */
    @Select("select *from music")
    List<Music> getMusics();
    /**
    * @Author:wx
    * @Description:上传音乐
    * @Date:15:23 2018\12\27 0027
    */
    @Insert("insert into music(name,author,coverUrl,content) values (#{name},#{author},#{coverUrl},#{content})")
    int inSertMusic(@Param("name")String name,@Param("author")String author,@Param("coverUrl")String coverUrl,@Param("content")String content);
    @Select("select *from music where id=#{id}")
    Music getMusicDetails(@Param("id")String id );
}
