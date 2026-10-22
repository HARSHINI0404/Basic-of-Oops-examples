package Interface;

public class SampleChild implements SampleInterface , DemoInterface {
    @Override
    public void sample1() {
        System.out.println("aa= "+SampleInterface.aa);
        System.out.println("sample1 implements inside SampleChild");
    }

    @Override
    public void sample2() {
        System.out.println("bb= "+SampleInterface.bb);
        System.out.println("sample2 implements inside SampleChild");
    }

    @Override
    public void sample3() {
        System.out.println("cc= "+SampleInterface.cc);
        System.out.println("sample3 implements inside SampleChild");
    }

    @Override
    public void general() {

    }

    @Override
    public void demo1() {
        System.out.println("Demo1 inside SampleChild");
    }
}
