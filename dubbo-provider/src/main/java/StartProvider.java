import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 启动服务提供者
 */
public class StartProvider {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        ac.start();
        System.out.println("DemoService服务已经注册成功");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}