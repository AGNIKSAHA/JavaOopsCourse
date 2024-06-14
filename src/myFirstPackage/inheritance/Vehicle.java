package myFirstPackage.inheritance;

public class Vehicle {
    protected int noOfTyres=0;
    public void run(){
        System.out.println("No of tyres:"+noOfTyres);
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "noOfTyres=" + noOfTyres +
                '}';
    }
}
