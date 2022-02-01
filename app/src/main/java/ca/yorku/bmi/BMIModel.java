package ca.yorku.bmi;

public class BMIModel {

    public static double toDouble(String s){
        return Double.parseDouble(s);
    }
    public static double getBMI(double weight, double height){
        double result=weight/(Math.pow(height,2));
        return result;
    }
    public static String formatBMI(double bmi){
            String Str = String.format("%.1f",bmi);
            return Str;

    }
}
