
package Emp;

public class FamilyDetails {
    private String wifeName;
    private int noOfChild;
    private Employee employee;

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }

    public int getNoOfChild() {
        return noOfChild;
    }

    public void setNoOfChild(int noOfChild) {
        this.noOfChild = noOfChild;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

        
    public void display(){
        System.out.println("name = " + wifeName + "\n" + "No of child = " + noOfChild);
        System.out.println("Employee details = " + employee);
    }
    
}
