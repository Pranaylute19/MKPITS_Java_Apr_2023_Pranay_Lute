/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;

/**
 *
 * @author user
 */
public class Address {
    private String City;
    private String state;
    private String Country;
    public Address(){
    
    }
    public Address(String City,String state,String Country){
        this.City=City;
        this.Country=Country;
        this.state=state;
    }

    @Override
    public String toString() {
        return "Address{" + "City=" + City + ", state=" + state + ", Country=" + Country + '}';
    }
    
}
