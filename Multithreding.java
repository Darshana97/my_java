public class Multithreding {

    public static void main(String[] args) {

        Hi obj = new Hi();
        Hello obj1 = new Hello();

        obj.show();
        obj1.show();


    }
}

class Hi extends Thread{

    public void show()
    {

        for (int i=0;i<5;i++)
        {
            System.out.println("hiii");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}

class Hello extends Thread{

    public void show()
    {

        for (int i=0;i<5;i++)
        {
            System.out.println("helloooo");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
