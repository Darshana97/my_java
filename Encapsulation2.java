public class Encapsulation2 {

    public static void main(String[] args) {

        Emp e1 = new Emp();
        Emp e2 = new Emp();
        Emp e3 = new Emp();

        e1.setEmpid(10);
        System.out.println(e1.getEmpid());

        e1.setEmpname("achi");
        System.out.println(e1.getEmpname());


    }
}

class Emp{

    private int empid;
    private String empname;

    public void setEmpid(int id)
    {
        this.empid=id;
    }

    public int getEmpid()
    {
        return empid;
    }


    public void setEmpname(String name)
    {
        this.empname=name;
    }

    public String getEmpname()
    {
        return empname;
    }

}