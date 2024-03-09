package com.minis.core;

import com.minis.BeanDefinition;
import com.minis.BeanFactory;
import com.minis.context.SimpleBeanFactory;
import org.dom4j.Element;

public class XmlBeanDefinitionReader {
    SimpleBeanFactory beanFactory;
    public XmlBeanDefinitionReader(SimpleBeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }
    public void loadBeanDefinitions(Resource resource) {
        while (resource.hasNext()) {
            Element element = (Element) resource.next();
            String beanID = element.attributeValue("id");
            String beanClassName = element.attributeValue("class");
            BeanDefinition beanDefinition = new BeanDefinition(beanID, beanClassName);
            this.beanFactory.registerBeanDefinition(beanDefinition);
        }
    }
}
