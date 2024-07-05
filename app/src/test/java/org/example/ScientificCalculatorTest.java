package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ScientificCalculatorTest {
    private ScientificCalculator scientificCalculator;
    @BeforeEach
    void setup(){
        scientificCalculator=new ScientificCalculator();
    }

    @Test
    @DisplayName("Testing SIN")

    void testSin(){
        scientificCalculator.sin(7);
        String res= String.format("%.3f",scientificCalculator.printResult());
        Assertions.assertEquals(res, "0.657");
    }
    
}
