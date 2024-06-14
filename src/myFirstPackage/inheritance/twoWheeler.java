package myFirstPackage.inheritance;

public class twoWheeler extends Vehicle{
     public twoWheeler() {
        noOfTyres=2;
    }
   public void run1(){
        System.out.println("no of tyres in twoWheeler:"+noOfTyres);

    }

    @Override
    public String toString() {
        return "twoWheeler{" +
                "noOfTyres=" + 3 +
                '}';
    }
//    public void run(){
//        System.out.println("No of tyres:"+noOfTyres);
//    }
}
