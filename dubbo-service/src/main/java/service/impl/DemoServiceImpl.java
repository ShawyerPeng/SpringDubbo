package service.impl;

import org.springframework.stereotype.Service;
import service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayDubbo() {
        return "Hello, Dubbo!";
    }

    @Override
    public String say(String name) {
        return "Hello, " + name;
    }
}