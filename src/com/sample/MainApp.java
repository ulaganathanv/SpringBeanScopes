package com.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      Bean1 object1 = (Bean1) context.getBean("bean1");
      object1.setMessage("Message from Bean1");
      Bean1 object2 = (Bean1) context.getBean("bean1");
      object1.getMessage();
      object2.getMessage();
      
      Bean2 object3 = (Bean2) context.getBean("bean2");
      object3.setMessage("Message from Bean2");
      Bean2 object4 = (Bean2) context.getBean("bean2");
      object3.getMessage();
      object4.getMessage();
   }
}