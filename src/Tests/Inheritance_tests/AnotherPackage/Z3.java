package Tests.Inheritance_tests.AnotherPackage;

import Tests.Inheritance_tests.Car;

/**
 * Created by Yurbly on 19.07.2017.
 */
public class Z3 extends Car {

    Z3(){
        passengers = 1;
    }

    public static void main(String[] args) {
        Car car = new Car();
        Z3 z3 = new Z3();
        z3.passengers = 3;
    }

}
