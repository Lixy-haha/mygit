package test.eventtest;

import com.dao.eventhandle.HelloWorld;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventTest {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("springconf.xml");

        context.start();
        HelloWorld hw = (HelloWorld) context.getBean("helloWorld");
        hw.getMessage();
        context.stop();
    }
}
