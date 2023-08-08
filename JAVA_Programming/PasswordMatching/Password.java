package PasswordMatching;

public class Password {
    public void checkPassword(String num1 ,String num2){
        if(num1.equals(num2)){
            System.out.println("Valid password");
        }
        else{
            System.out.println("invalid");
        }
    }
}
