public class Inheritance {

    protected  String brand = "Ford";

    public void honk(){
        System.out.println("Tuut,tuut!!!");
    }
}

class Car extends Inheritance{

    private String modelName = "Mustang";

    public static void main(String[] args) {

        Car mycar = new Car();

        mycar.honk();

        System.out.println(mycar.brand+" "+mycar.modelName);
    }
}
