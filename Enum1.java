public class Enum1 {

    public static void main(String[] args) {

        Mobile m[] = new Mobile[0];

        for (Mobile mobile: m)
        {
            System.out.println(mobile);
        }

    }
}


enum Mobile{

    APPLE(100),SAMSUNG(80),HTC(90);

    int price;

    Mobile()
    {
        price = 80;
        System.out.println("constructor");
    }

    Mobile(int p)
    {
        price = p;
    }

    public int getPrice()
    {
        return price;
    }

    public static class values {
    }
}