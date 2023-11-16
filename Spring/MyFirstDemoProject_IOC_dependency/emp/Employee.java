/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;

import static java.lang.System.out;

public class Employee {
    private int id;
    private String name;
    private Address add;
    
     public Employee(){
         
     }
     public Employee(int id,String name,Address add){
//         super();
         this.id=id;
         this.name=name;
         this.add=add;
     }
     public void display(){
         System.out.println("id"+id + " " + "name = " + name);
         System.out.println(add.toString());
     }
    
}
