package test.ylzrtest;

import com.ylzr.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class YlzrTest {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springconf.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
        context.registerShutdownHook();
    }
}
