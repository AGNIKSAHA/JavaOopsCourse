package abstractionAndInterference;

public class Car extends twoWheeler{
    private String color;

    public Car(int noOfTyre, int door, String color) {
        super(noOfTyre, door);
        this.color = color;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Color:-"+color);
    }

    @Override
    public void startSound(){
        System.out.println("Vrooommmm...");
    }

//    @Override
//    public void Start(){
//        System.out.println("Vromm....");
//    }

}
