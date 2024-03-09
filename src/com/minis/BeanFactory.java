package com.minis;

public interface BeanFactory {
        Object getBean(String bean) throws BeansException, ClassNotFoundException, InstantiationException, IllegalAccessException;
//        void registerBeanDefinition(BeanDefinition beanDefinition);
        void registerBean(String beanName, Object obj);

}
