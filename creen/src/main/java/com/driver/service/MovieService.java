package com.driver.service;

import com.driver.entity.Movie;
import com.driver.mapper.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieMapper MovieMapper;

    /**
    * @Author:wx
    * @Description:插入
    * @Date:10:03 2018\12\28 0028
    */
    public int insertUrl(String name,String photo,String url,String uploadTime,String type,String size,String lujing){
        System.out.print("开始插入=name=="+name+"\n");
        System.out.print("开始插入=lujing=="+lujing+"\n");
        System.out.print("开始插入=url=="+url+"\n");
        int jieguo=MovieMapper.insertUrl(name,photo,url,uploadTime,type,size,lujing);
        System.out.print("插入结果==="+jieguo+"\n");
        return jieguo;
    }
    /**
    * @Author:wx
    * @Description:查询
    * @Date:10:04 2018\12\28 0028
    */
    public List<Movie> selectShipin(){
        List<Movie> shipins=MovieMapper.selectShipin();
        return  shipins;
    }
    /**
    * @Author:wx
    * @Description:电影详情
    * @Date:10:52 2019\1\2 0002
     *
    */
    public Movie getMovieDetails(String id ){
        Movie movieDetails = MovieMapper.getMovieDetails(id);
        return  movieDetails;

    }
}
