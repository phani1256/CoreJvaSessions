package OOPSPolymorphism;

public class MethodOverloading {
    public  MethodOverloading(int a){
        System.out.println(a);
    }
    public  MethodOverloading(int a,int b){
        System.out.println(a+b);
    }
    int d=10;
    public void add(int a,int b){
        System.out.println(d);
        int c=a+b;
        System.out.println(c);
    }


    public void add(int a,int b,int c){
        int d=a+b;
        System.out.println(d);
    }
    public void add(float a,int b,int c){
        float d=a+b;
        System.out.println(d);
    }
}
