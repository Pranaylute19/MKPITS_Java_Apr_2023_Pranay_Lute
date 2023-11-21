/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud;

import java.util.List;
import static java.util.Spliterators.iterator;
import java.util.Iterator;

/**
 *
 * @author user
 */
public class Student {
    private String Question;
    private List<String> QList;
    private int que;
    
    public Student(){
        
    }
    public Student(int que,String Question,List<String>Qlist){
        this.QList=Qlist;
        this.que=que;
        this.Question=Question;
    }
    public void display(){
        System.out.println(que+" "+Question);
            Iterator i=QList.iterator();
            while(i.hasNext()){
                System.out.println(i.next());
               }
    }
    
    
}
