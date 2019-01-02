package com.driver.controller;
import com.driver.entity.Music;
import com.driver.service.MusicService;
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
@Controller
@RequestMapping("/music")
public class MusicController {
    @Autowired
    MusicService MusicService;
    private String url;
    /**
    * @Author:wx
    * @Description:上传音乐
    * @Date:15:31 2018\12\27 0027
    */
    @RequestMapping(value = "/uploadMusic", produces = "application/json;charset=UTF-8")
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
        int jieguo = MusicService.inSertMuisc(fileName,"tese1","test2",url);
        System.out.print("保存的完整url====" + url + "\n");
        return "上传成功,文件url=="+url;
    }
    /**
     * @Author:wx
     * @Description:查询音乐列表
     * @Date:14:17 2018\12\27 0027
     */
    @RequestMapping("/selectMusic")
    @ResponseBody
    public List<Music> selectMusic() {
        List<Music> musics = MusicService.getMusics();
        return musics;
    }
/**
* @Author:wx
* @Description:音乐详情
* @Date:11:18 2019\1\2 0002
*/
@RequestMapping("/getMusicDetails")
    @ResponseBody
    public Music getMusicDetails(@PathParam("id")String id){
    Music musicDetails = MusicService.getMusicDetails(id);
      return  musicDetails;
}
}

