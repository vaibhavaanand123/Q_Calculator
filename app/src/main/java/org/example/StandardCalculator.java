package org.example;
public class StandardCalculator {
 
    protected Double result;

    protected double printResult(){
       return result;
    }

    public void clearResult(){
        this.result=0.0;
    }

    protected final void add(double num1,double num2){
        result =num1+num2;
        if((result==Double.MAX_VALUE) || (result==Double.POSITIVE_INFINITY)){
            throw new ArithmeticException("Limit Exceed");
        }
    }

    protected final void subtract(double num1,double num2){
        result=num1-num2;
        if((result==Double.MAX_VALUE)||(result==Double.NEGATIVE_INFINITY)){
            throw new ArithmeticException("Limit Exceed");
        }
    }

    protected final void multiply(double num1,double num2){
        result=num1*num2;
        if((result==Double.MAX_VALUE) || (result==Double.POSITIVE_INFINITY) || (result==Double.NEGATIVE_INFINITY)){
            throw new ArithmeticException("Limit Exceed");
        }
    }

    protected final void divide(double num1,double num2){
        if(num2==0){
            throw new ArithmeticException("Divide by zero");
        }
        result=num1/num2;
    }

    
}
