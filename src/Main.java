import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner reader = new Scanner(System.in);  
    do{
    System.out.println("Please enter an expression using only parentheses'(){}[]' or enter'exit' to exit':");
    String expression = reader.nextLine();  
    BalancedParentheses balance = new BalancedParentheses();
    balance.balancedParentheses(expression);
    
    if(expression.equals("exit")){
        break;
    }
    if(balance.balancedParentheses(expression)){
        System.out.println("balance");
       }else{
        System.out.println("no balance ");
       }
    }while(true);
    reader.close(); 
} 
}