/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudRollNumber;

import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author user
 */
public class StuRollnumber {
    private String name;
    private Set<Integer> rollNumber;

    public StuRollnumber() {
    }

    public StuRollnumber(String name, Set<Integer>rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
        
    public void display(){
        System.out.println(name);
        
        Iterator it=rollNumber.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
