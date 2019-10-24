package test;

import com.dao.bean.Teacher;
import com.dao.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void testSpring(){
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("springconf.xml");
        /*
        * 用于测试Spring IoC容器
        * 包括bean的定义、作用域、生命周期、后置处理器以及定义继承
        */
        User user = (User) ac.getBean("User");
        user.getName();
        user.getSex();

        System.out.println("=================================");

        Teacher teacher = (Teacher) ac.getBean("Teacher");
        teacher.getName();
        teacher.getSex();
        teacher.getAge();
        //注册一个在 AbstractApplicationContext 类中声明的关闭 hook 的 registerShutdownHook() 方法。它将确保正常关闭，并且调用相关的 destroy 方法。
        ac.registerShutdownHook();
    }

    public static void main(String[] args) {

        testSpring();
    }
}
