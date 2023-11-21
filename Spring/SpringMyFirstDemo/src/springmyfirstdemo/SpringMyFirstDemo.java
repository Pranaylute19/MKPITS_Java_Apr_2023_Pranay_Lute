/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springmyfirstdemo;

import StudRollNumber.StuRollnumber;
import emp.Employee;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import stud.Student;

/**
 *
 * @author user
 */
public class SpringMyFirstDemo {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Resource resource= new ClassPathResource("newXMLDocument.xml");
        BeanFactory bean=new XmlBeanFactory(resource);
        
          Employee em=(Employee)bean.getBean("emp");
        em.display();
        
        
        Student st=(Student)bean.getBean("std");
        st.display();
        
        StuRollnumber rn=(StuRollnumber) bean.getBean("rno");
        rn.display();
    }
    
}
