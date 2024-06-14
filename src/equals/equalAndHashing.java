package equals;

public class equalAndHashing {
    public static void main(String[] args) {
        Person person1 = new Person("Agnik",12,001);
        Person person2 = new Person("Agnik",12,001);
        if(person1.equals(person2)){
            System.out.println("equal");
        }
        else
        {
            System.out.println("notEqual");
        }
    }

}
