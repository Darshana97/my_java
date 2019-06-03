public class Inheritance2 {

    public static void main(String[] args) {

        Sub obj = new Sub();
        obj.num1=10;
        obj.num2=3;
        obj.add();
        System.out.println("sum is: "+obj.result);
        obj.sub(100);
        System.out.println("sub is: "+obj.result);


    }


}

class Operation{

    int num1,num2,result;
}

class Add extends Operation{

    public void add()
    {
        result=num1+num2;
    }


}

class Sub extends Add{

    public void sub(int x)
    {
        result=num1-num2;
        System.out.println("x is: "+x);
    }
}


