package CoreJava;

public class maths {
    public int a = 10;
    public int b = 20;

    public void add(){
        System.out.println(a+b);
    }
    public void subtract(){
        System.out.println(b-a);
    }
    public void multiply(){
        System.out.println(a*b);
    }
    public void divide(){
        System.out.println(b/a);
    }

    public static void main(String[] args){
        maths op = new maths();
        op.add();
        op.subtract();
        op.multiply();
        op.divide();
    }
}
 