package ArraysConcepts;

public class ArraySession {

    static  int a[]={10,20,30,40,50,60};


    String names[]={"naveen","phani","chandhu"};
    boolean c[]={true,false};

    static  int b[]=new int[6];

    public static void main(String[] args) {
        System.out.println(a.length);
        System.out.println(a[4]);
        System.out.println(b);
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);
        System.out.println(b[5]);
        b[0]=10;
        b[1]=20;
        b[2]=30;
        b[3]=40;
        b[4]=50;
        b[5]=60;
        //b[6]=70;
        System.out.println(b);
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);
        System.out.println(b[5]);
        //System.out.println(b[6]);



    }


}
