package test;

import entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dell on 2016/5/12.
 */
public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("userBean");
        System.out.println(user);
    }
}
