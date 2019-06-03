public class Encapsulation {

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
}

 class Myclass{

     public static void main(String[] args) {
         Encapsulation myobj = new Encapsulation();
         myobj.setName("achi");
         System.out.println(myobj.getName());
     }

}
