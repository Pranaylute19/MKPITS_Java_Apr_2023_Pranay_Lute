/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setterinjection_spring;

import Emp.FamilyDetails;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 *
 * @author user
 */
public class SetterInjection_Spring {

    public static void main(String[] args) {
        
//        Resource resource= new ClassPathResource("newXMLDocument.xml");
//        BeanFactory bean=new XmlBeanFactory(resource);

    ApplicationContext context=new ClassPathXmlApplicationContext("newXMLDocument.xml");
        
         FamilyDetails fm=(FamilyDetails)context.getBean("fam");
         fm.display();
    }
    
}
