package com.driver.controller;
import com.driver.entity.Psychological;
import com.driver.service.PsychologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.websocket.server.PathParam;
import java.util.List;
/**
* @Author:wx
* @Description:处理心理测试
* @Date:17:25 2018\12\27 0027
*/
@Controller
@RequestMapping("/Psychology")
public class PsychologyController {
    @Autowired
    PsychologyService PsychologyService;
    /**
    * @Author:wx
    * @Description:获取测试列表
    * @Date:17:36 2018\12\27 0027
    */
    @RequestMapping("/getPsy")
    @ResponseBody
    public List<Psychological> getOptions(){
        List<Psychological> psychologicals = PsychologyService.getPsychological();
        return  psychologicals;

    }
    /**
     * @Author:wx
     * @Description:获取选项值
     * @Date:17:36 2018\12\27 0027
     */
    @RequestMapping("/getOption")
    @ResponseBody
    public Psychological getOptions(@PathParam("id") int id ){
        Psychological psychologicals = PsychologyService.getOptions(id);
        return  psychologicals;

    }
}
