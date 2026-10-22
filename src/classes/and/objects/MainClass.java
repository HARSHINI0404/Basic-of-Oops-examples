package classes.and.objects;

public class MainClass {
    public static void main(String[] args)
    {
        System.out.println("Hello everyone, This is my practice project of OOPS Concept.");
        student s1=new student();
        System.out.println("s1 is "+s1);
        System.out.println();
        s1.id=59;
        s1.name="Angel";
        s1.email="angel@200";
        s1.dob="04/12/2056";
        s1.grade="Excellent";
        System.out.println("After assigning s1 is: "+s1);
        student s2=new student(57,"Annie","annie@200","08/04/2002","Excellent");
        System.out.println("s2 is "+s2);

        Demo d1=new  Demo();
        System.out.println("abc is "+d1.abc);
        System.out.println("pqr is "+Demo.pqr);
        d1.demo1();
        Demo.demo2();
        final int aaa=100;
        final int bbb=200;
        System.out.println("aaa="+aaa+" bbb="+bbb);
        //bbb=700;
        final String delivered="Delivered";
        String orderstatus=delivered;

    }
}
