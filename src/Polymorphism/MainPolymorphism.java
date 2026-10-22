package Polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {
        PerformSum ps = new PerformSum();
        ps.sum(2,6);
        ps.sum(3,4.78f);
        ps.sum(5,6.10);
        ps.sum(7,8,3);
    }
}
