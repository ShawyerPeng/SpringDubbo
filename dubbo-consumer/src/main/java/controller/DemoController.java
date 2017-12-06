package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.DemoService;

@Controller
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/sayDubbo")
    @ResponseBody
    public String sayDubbo() {
        return demoService.sayDubbo();
    }

    @RequestMapping("/say")
    @ResponseBody
    public String say(String name) {
        return demoService.say(name);
    }
}