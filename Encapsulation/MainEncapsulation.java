package Encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.setId(123);
        t1.setName("John");
        t1.setEmail("John@1000");
        t1.setDesignation("BE");
        t1.setSalary(400000.00);
        System.out.println("t1 is "+t1);
        System.out.println("t1name is "+t1.getName());
    }
}
