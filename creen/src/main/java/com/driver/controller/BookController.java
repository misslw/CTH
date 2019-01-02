package com.driver.controller;
import com.driver.entity.Book;
import com.driver.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.websocket.server.PathParam;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import static com.driver.tool.FileUtil.upload;

/**
* @Author:wx
* @Description:电子书
* @Date:14:07 2018\12\27 0027
*/
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService BookService;
    private String url;

    /**
     * @Author:wx
     * @Description:查询电子书列表
     * @Date:14:17 2018\12\27 0027
     */
    @RequestMapping("/selectBook")
    @ResponseBody
    public List<Book> getBook() {
        List<Book> books = BookService.getBooks();
        return books;
    }
    /**
     * @Author:wx
     * @Description:上传电子书
     * @Date:14:31 2018\12\27 0027
     */
    @RequestMapping(value = "/uploadBook", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String uploadFile(@RequestParam("fileName") MultipartFile file) {
        upload(file);//保存文件
        String fileName = file.getOriginalFilename();
        fileName = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_" + fileName;
        String path = "E:/fileUpload/" + fileName;
        url = "http://localhost:8080/creen/showResources/" + fileName;//本地运行项目
        Timestamp now = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String uploadTime = df.format(now);//当前日期
        int jieguo = BookService.inSertBook(fileName, url, "TEST.JPG");
        System.out.print("保存的完整url====" + url + "\n");
        return "上传成功,文件url==" + url;
    }
    /**
    * @Author:wx
    * @Description:电子书详情
    * @Date:11:01 2019\1\2 0002
    */
    @RequestMapping("/getBookDetails")
    @ResponseBody
    public Book getBookDetails(@PathParam("id")String id ){
        Book bookDetails = BookService.getBookDetails(id);
        return  bookDetails;
    }
}