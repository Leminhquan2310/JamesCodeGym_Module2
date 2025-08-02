package org.example;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double volume = getPerimeter(radius) * height + 2 * getArea(radius);
        return volume;
    }

    public static double getArea (int radius) {
        double baseArea = Math.PI * radius * radius;
        return baseArea;
    }

    public static double getPerimeter (int radius) {
        return  2 * Math.PI  * radius;
    }

}