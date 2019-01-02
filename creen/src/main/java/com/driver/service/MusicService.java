package com.driver.service;

import com.driver.entity.Music;
import com.driver.mapper.MusicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {
    @Autowired
    MusicMapper MusicMapper;
    /**
    * @Author:wx
    * @Description:上传音乐添加到数据库
    * @Date:15:27 2018\12\27 0027
    */
    public int inSertMuisc(String name ,String author,String coverUrl,String content){
        int  result=0;
        result=MusicMapper.inSertMusic(name,author,coverUrl,content);
      return  result;
    }
/**
* @Author:wx
* @Description:查询音乐列表
* @Date:15:33 2018\12\27 0027
*/
    public  List<Music> getMusics(){
        List<Music> musics = MusicMapper.getMusics();
        return  musics;
    }
    /**
    * @Author:wx
    * @Description:音乐详情
    * @Date:11:15 2019\1\2 0002
    */
    public Music getMusicDetails(String id ){
        Music musicDetails = MusicMapper.getMusicDetails(id);
        return  musicDetails;

    }
}
