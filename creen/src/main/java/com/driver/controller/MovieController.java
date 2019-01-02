package com.driver.controller;
import com.driver.entity.Movie;
import com.driver.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
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
* @Description:影视（后台管理上传name,上传视屏文件保存路径，以及封面图片）
 * 前端：获取封面图片路径，获取图片名称列表，读取文件内容
* @Date:9:58 2018\12\28 0028
*/
@Controller
@RequestMapping("/movie")
@EnableAutoConfiguration(exclude = {MultipartAutoConfiguration.class})
public class MovieController {
    @Autowired
    private MovieService MovieService;
    private String url;

    @RequestMapping("/file")
    public String file() {
        System.out.print("================请求路径===跳转file页面=====" + "\n");
        return "/file";
    }
    /**
     * @Author:wx
     * @Description:上传视频
     * @Date:14:42 2018\12\27 0027
     */
    @RequestMapping(value = "/uploadFile", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String uploadFile(@RequestParam("fileName") MultipartFile file) {
        upload(file);
        String fileName = file.getOriginalFilename();
        fileName = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_" + fileName;
        String path = "E:/fileUpload/" + fileName;
        url = "http://localhost:8080/creen/showResources/" + fileName;//本地运行项目
        Timestamp now = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String uploadTime = df.format(now);//当前日期
        int jieguo = MovieService.insertUrl(fileName, "", url, uploadTime, "test", "120m", path);
        System.out.print("保存的完整url====" + url + "\n");
        return "上传成功,文件url=="+url;
    }
 /**
 * @Author:wx
 * @Description:查询视频列表
 * @Date:9:58 2018\12\28 0028
 */
 @RequestMapping("/chaxun")
    @ResponseBody
    public List<Movie> huizhiDuanxin(/*Model model*/) {
        System.out.print("查询视频" + "\n");
        List<Movie> shipins = MovieService.selectShipin();
        System.out.print("查询到的视频数量==" + shipins.size() + "\n");
        /*  model.addAttribute("Shipins", shipins);*/
        return shipins;
    }
    /**
    * @Author:wx
    * @Description:电影详情
    * @Date:10:51 2019\1\2 0002
    */
    @RequestMapping("/getMovieDatis")
    @ResponseBody
    public Movie getMovieDetis(@PathParam("id")String id ){
        Movie movieDetails = MovieService.getMovieDetails(id);
        return  movieDetails;
    }
}
