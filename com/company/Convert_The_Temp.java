package com.company;

public class Convert_The_Temp {
    public double[] convertTemperature(double celsius) {
        double[] f = new double[]{(celsius +273.15),(celsius * 1.80 + 32.000)};
        return f;
    }
    public static void main(String[] args) {
        Convert_The_Temp obj = new Convert_The_Temp();
        double[] f = obj.convertTemperature(273.15);
        System.out.println("Convert to kelvin : "+f[0]);
        System.out.println("Convert to Fahrenheit :"+f[1]);
    }
}
