package mySecondPackage;
import getterSetter.Car;

public class getterSetterTest {

    public static void main(String[] args) {
        Car car=new Car("blue","ml123",12);
        car.setColor("red");
        System.out.println(car.getColor());
        System.out.println(car.getModel());

    }






}