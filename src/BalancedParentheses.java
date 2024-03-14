import java.util.*;

public class BalancedParentheses {
    public boolean balancedParentheses(String expression){
        Stack<Character> stack = new Stack<>();
        boolean allOpen = true;
        int length = expression.length();
        boolean isEmpty = (length ==0);
        if(isEmpty){
            return true;
        }
        for(char bracket:expression.toCharArray()){
            if(bracket == '{' || bracket == '(' || bracket == '['){  
                stack.push(bracket);
            }else if(bracket =='}' || bracket == ')' || bracket == ']'){
                allOpen = false;
                if(stack.isEmpty() ||!isItBalanced(stack.pop(), bracket)){
                    return false;
                }
            }
        }
        if(allOpen){
            return false;
        }     
        return true; 
    }

    public boolean isItBalanced(char open,char close){
        if(open == '{' && close == '}'){
            return true;
        }else if(open == '(' && close == ')'){
            return true;
        }else if(open =='[' && close == ']'){
            return true;
        }
        return false;
    }
}






/*
先push open {([   这时候have to check the top element 也就是[，  然后push ])}
{([])}}




String expression = (({{}}))
toCharArray()
'{'





*/