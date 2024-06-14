package testPanel;
import myFirstPackage.inheritance.*;

public class inheritanceTest {
    public static void main(String[] args) {
        twoWheeler motorCycle=new twoWheeler();
        Vehicle motor=new Vehicle();
        motor.run();
        motorCycle.run1();
        System.out.println(motor.toString());
        System.out.println(motorCycle.toString());

    }
}
