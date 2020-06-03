package study.startspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import study.startspringboot.aop.AopDao;
import study.startspringboot.aop.AopNote;


/**
 * @author only you
 */
@Controller
public class AopController {
    @Autowired
    AopDao aopDao;

    @RequestMapping("/aop")
    @ResponseBody
    String aopDemo() {
        System.out.println("=========================");
        aopDao.getBefore();
        return "success";
    }
    @RequestMapping("/aopNote")
    @ResponseBody
    String aopNoteDemo() {
        System.out.println("=========================");
        aopDao.getBeforeTWO();
        return "success";
    }


}
