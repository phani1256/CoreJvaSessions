public class Variables {
    static int a=20;
    static int b=10;
    static int c;

    public static void main(String[] args) {
                c=a+b;
                System.out.println("Globa variables addition:"+c);
                Variables obj=new Variables();
                obj.add();
                obj.sub();
                Variables.mul();


    }

    public void add(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }

    public  void sub(){
        c=a-b;
        System.out.println(c);
    }

    public  static void mul(){
        c=a*b;
        System.out.println(c);
    }
}
