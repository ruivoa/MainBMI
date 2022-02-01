package ca.yorku.bmi.BMIModelTest;

import ca.yorku.bmi.BMIModel;

public class BMITest {
    public void getBMITest(){
        double w,h;
        System.out.println("Testing BMI.getBMI");

        w=90; h=1.8;
        System.out.println(w+","+h);
        System.out.println(BMIModel.getBMI(w,h));
    }
}

