package com.driver.mapper;
import com.driver.entity.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {
    /**
    * @Author:wx
    * @Description:查询电子书列表
    * @Date:14:11 2018\12\27 0027
    */
    @Select("SELECT *FROM book")
    List<Book> getBooks();
    /**
    * @Author:wx
    * @Description:添加电子书
    * @Date:14:47 2018\12\27 0027
    */
    @Insert("insert into book(name,details,photo) values(#{name},#{details},#{photo})")
    int inSertBook(@Param("name") String name,@Param("details")String details,@Param("photo") String photo);
/**
* @Author:wx
* @Description:电子书详情
* @Date:11:01 2019\1\2 0002
*/
@Select("select *from book where id=#{id}")
 Book getBookDetails(@Param("id")String id );
}
