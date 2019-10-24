package com.dao.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.net.SocketTimeoutException;

public class InitUser implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException{
        System.out.println("BeforeInitialization:"+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException{
        System.out.println("AfterInitialization:"+beanName);
        return bean;
    }
}
