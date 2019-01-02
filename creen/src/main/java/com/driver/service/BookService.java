package com.driver.service;
import com.driver.entity.Book;
import com.driver.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
* @Author:wx
* @Description:电子书
* @Date:14:14 2018\12\27 0027
*/
@Service
@Transactional
public class BookService {
    @Autowired
    BookMapper BookMapper;
    /**
    * @Author:wx
    * @Description:查询电子书列表
    * @Date:14:50 2018\12\27 0027
    */
    public List<Book> getBooks(){
       return BookMapper.getBooks();
    }
   /**
   * @Author:wx
   * @Description:上传电子书
   * @Date:14:50 2018\12\27 0027
   */
   public int inSertBook(String name ,String details,String photo){
       int result=0;
       result=BookMapper.inSertBook(name,details,photo);
       return  result;
   }
   /**
   * @Author:wx
   * @Description:电子书详情
   * @Date:11:03 2019\1\2 0002
   */
   public  Book getBookDetails(String id ){
       Book bookDetails = BookMapper.getBookDetails(id);
       return  bookDetails;
   }
}
