package StringSessions.WrapperClasses;

public class WrapperClass {
    public static void main(String[] args) {
      /*  int a=20;
        //Integer i=Integer.valueOf(a);
        Integer j=a;//Autoboxing
        System.out.println(a+" "+j);
        Integer b=new Integer(3);
        int k=b;
        System.out.println(k);//unboxing*/

        //String to int
        String x="100";
        System.out.println(x+20);
        int i=Integer.parseInt(x);
        System.out.println(i);
        //int to string
        int y=100;
        double z=(double)y;//Typecasting
        String value=String.valueOf(y);
        System.out.println(value);
    }
}
