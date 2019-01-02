package com.driver.mapper;

import com.driver.entity.Consultation;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsultationMapper {
    /**
    * @Author:wx
    * @Description:资讯列表
    * @Date:10:01 2018\12\28 0028
    */
    List<Consultation> getconsultation();
    /**
    * @Author:wx
    * @Description:资讯详情
    * @Date:13:42 2019\1\2 0002
    */
    @Select("select * from consultation where id=#{id} ")
    Consultation getConDateils(@Param("id")String id );
}
