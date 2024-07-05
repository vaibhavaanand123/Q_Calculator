package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup(){
        standardCalculator = new StandardCalculator();
    }

    @Test
    @DisplayName("Exception Addition Test")

    void testAdditionException(){
        Assertions.assertThrows(ArithmeticException.class,new Executable() {
            @Override
            public void execute() throws Throwable{
                standardCalculator.add(Double.MAX_VALUE,Double.MAX_VALUE);
            }
        });
    }

    @Test 
    @DisplayName("Addition Test")
    void testAddition(){
        standardCalculator.add(35, 12);
        Assertions.assertEquals(standardCalculator.printResult(), 47.0);

    }

    @Test 
    @DisplayName("Addition Test1")
    void testAddition1(){
        standardCalculator.add(0, 0);
        Assertions.assertEquals(standardCalculator.printResult(), 0.0);

    }

    
}
