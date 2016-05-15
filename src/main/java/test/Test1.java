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

        /**
         * 编程式加载配置文件 详细查看xmlBeanFactory
         * 1)创建ioc配置文件的抽象资源，这个抽象资源包含BeanDefinition的定义信息
         * 2）创建一个BeanFactory ,这里使用DefaultListableBeanFactory.
         * 3)创建一个加载BeanDefinition的读取器，这里使用XmlBeanDefinitionReader
         * 4）从定义好的资源位置读取配置信息。完成整个载入和注册Bean定义之后，需要的ioc容器就建立起来了
         */
//        ClassPathResource res = new ClassPathResource("applicationContext.xml");
//        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//        reader.loadBeanDefinitions(res);
    }
}
