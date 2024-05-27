package getterSetter;

public class Car {

    private String color;
    private String model;
    private int fuelLevel;

    public Car(String color, String model, int fuelLevel) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
    }

    //.....getter.....
public String getColor(){
    return color;
}
public String getModel(){
    return model;
}
  //.....setter....
public void setColor(String color){
         this.color=color;

}
public void setModel(String model){
         this.model=model;
}


}