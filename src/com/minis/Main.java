package com.minis;
import com.minis.test.AService;
import org.dom4j.DocumentException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, DocumentException, BeansException, InstantiationException, IllegalAccessException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/minis/resources/beans.xml");
        AService service = (AService) context.getBean("aservice");
        service.sayHello();
    }
}