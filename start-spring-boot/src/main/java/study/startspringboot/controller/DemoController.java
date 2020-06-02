package study.startspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.startspringboot.service.DemoService;

/**
 * @author only you
 */
@RestController
public class DemoController {
    @Autowired
    public DemoService demoService;

    @RequestMapping("/demo")
    String getStringAll() {
        return demoService.getQueryAll().toString()+"\n"+demoService.getQueryAllTwo();
    }
}
