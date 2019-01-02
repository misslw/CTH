package com.driver.mapper;

import com.driver.entity.Psychological;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @Author:wx
* @Description:心理测试获取
* @Date:16:20 2018\12\27 0027
*/
@Repository
public interface PsychologyMapper {
    @Select("SELECT\n" +
            " re.result,\n" +
            "\top.option_a,\n" +
            "\top.option_b,\n" +
            "\top.option_c,\n" +
            "\top.option_d,\n" +
            "\top.option_title,\n" +
            "\top.QuestionNum\n" +
            "FROM\n" +
            "\tpsychological psy\n" +
            "LEFT JOIN result re ON psy.id = re.psy_id\n" +
            "LEFT JOIN `option` op ON psy.id = op.psy_id WHERE psy.id=#{id}")
    Psychological getOptions( @Param( "id") int id );
    /**
    * @Author:wx
    * @Description:心里测试列表
    * @Date:17:47 2018\12\27 0027
    */
    @Select("select *from psychological")
    List<Psychological> getPsychological();
}
