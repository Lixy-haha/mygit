package test.zjtest;

import com.zj.Profile;
import com.zj.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ZjTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconf.xml");
        /*Student stu = (Student) context.getBean("student");

        System.out.println("name:"+stu.getName());
        System.out.println("age:"+stu.getAge());*/
        Profile profile = (Profile) context.getBean("profile");
        profile.printName();
        profile.printAge();
    }

}
