package abstractionAndInterference;

public abstract class twoWheeler implements Transport {
    private int noOfTyre=2;
    private int door=3;

    protected twoWheeler(int noOfTyre, int door) {
        this.noOfTyre = noOfTyre;
        this.door = door;
    }



    protected void display(){
        System.out.println("No. of Tyre:-"+noOfTyre);
        System.out.println("No. of door:-"+door);
    }
    protected abstract void startSound();

}
