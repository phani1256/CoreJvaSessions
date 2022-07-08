package ConstructorConcepts;

public class Main {
    public static void main(String[] args) {
        int a=20;
        int b=10;
       A obj=new A(a,b);
       B obj1=new B(a,b);
       C obj2=new C(a,b);
       obj.add();
       obj1.sub();
       obj2.mul();
    }
}
