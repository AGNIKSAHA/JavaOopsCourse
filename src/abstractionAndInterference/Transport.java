package abstractionAndInterference;

public interface Transport {
    public default void Start(){
      System.out.println("Vromm....");
     }


}
