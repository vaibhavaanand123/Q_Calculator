package org.example;

public class ScientificCalculator extends StandardCalculator {


    protected void sin(double num){
        result = Math.sin(num);
    }
    protected void cos(double num){
        result =Math.cos(num);
    }
    protected void tan(double num){
        result = Math.tan(num);
    }
    protected void log(double num){
        result=Math.log(num);
    }
    // Square root 
    protected void sqrt(double num){
        result=Math.sqrt(num);
    }
    // Cube root 
    protected void cbrt(double num){
        result=Math.cbrt(num);
    }
    protected void square(double num){
        multiply(num, num);
    }
}
