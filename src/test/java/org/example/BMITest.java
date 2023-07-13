package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BMITest {

    double height;
    double weight;

    @Test
    @DisplayName("Test for Under Weight")
    public void testForUnderWeight(){  // < 18.5
        height = 1.75; //in meters
        weight = 55;   //in kg
        String bmiResult = BMI.calculateBMI(weight,height);
        Assertions.assertEquals("under weight",bmiResult);
    }

    @Test
    @DisplayName("Test for Normal Weight")
    public void testForNormalWeight(){ // 18.6 to 24
        height = 1.75;
        weight = 63;
        String bmiResult = BMI.calculateBMI(weight,height);
        Assertions.assertEquals("normal weight",bmiResult);

    }

    @Test
    @DisplayName("Test for Over Weight")
    public void testForOverWeight(){ //25 or more
        height = 1.75;
        weight = 80;
        String bmiResult = BMI.calculateBMI(weight,height);
        Assertions.assertEquals("over weight",bmiResult);

    }

}