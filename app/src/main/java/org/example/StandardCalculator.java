package org.example;
public class StandardCalculator {
 
    protected Double result;

    public double printResult(){
       return result;
    }

    public void add(double num1,double num2){
        result =num1+num2;
        if((result==Double.MAX_VALUE) || (result==Double.POSITIVE_INFINITY)){
            throw new ArithmeticException("Limit Exceed");
        }
    }

    public void subtract(double num1,double num2){
        result=num1-num2;
        if((result==Double.MAX_VALUE)||(result==Double.NEGATIVE_INFINITY)){
            throw new ArithmeticException("Limit Exceed");
        }
    }

    public void multiply(double num1,double num2){
        result=num1*num2;
        if((result==Double.MAX_VALUE) || (result==Double.POSITIVE_INFINITY) || (result==Double.NEGATIVE_INFINITY)){
            throw new ArithmeticException("Limit Exceed");
        }
    }

    public void divide(double num1,double num2){
        if(num2==0){
            throw new ArithmeticException("Divide by zero");
        }
        result=num1/num2;
    }

    
}
