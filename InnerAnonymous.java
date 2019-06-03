public class InnerAnonymous {

    public static void main(String[] args) {

        E e = new E(){

            public void shown()
            {
                System.out.println("hiiiii");
            }

        };


        e.shown();


    }
}

class E{

    public void shown()
    {
        System.out.println("helloooo");
    }
}
