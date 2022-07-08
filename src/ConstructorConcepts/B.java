package ConstructorConcepts;

public class B {
    int a;
    int b;

    public B(int a,int b){
       this.a=a;
       this.b=b;
    }

    public void sub(){
        int c=a-b;
        System.out.println(c);
    }
}
