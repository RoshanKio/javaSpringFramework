package com.takeo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car1 = Car.getInstance();
        Car car2 = Car.getInstance();
        Car car3 = Car.getInstance();
        boolean flag = car1==car2 && car2==car3;
        System.out.println("Are all 3 car objects, same ? \nAns: "+flag);
    }
}
