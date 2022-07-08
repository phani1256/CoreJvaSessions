package StringSessions;

public class StringExamples {
      static String s1="Naveen";
    static String s2="I love my country";

    static  String s3=new String("India is my country");

    static  String firstName="Purna";
    static  String lastName="chandra";
    static  String fullName;
    public static void main(String[] args) {
        /*System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s1.toLowerCase());
        int len=s1.length();
        System.out.println(len);
        System.out.println(s3.length());
        System.out.println(s3.contains("india"));
        //fullName=firstName+lastName;
        fullName=firstName.concat(lastName);
        System.out.println(fullName);
        System.out.println("Full name of the string is :"+fullName);*/

        String s1="My name is Naveen";
        String s2="My name is Naveen";
        System.out.println(s1==s2);
        String s3=new String("My name is Naveen");
        String s4=new String("my name is naveen");
        /*System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));*/

        /*System.out.println(s1.indexOf("Naveen"));
        System.out.println(s1.indexOf('e'));
        int position=s1.indexOf('e');
        System.out.println(position);
        int startposition=s1.indexOf("Naveen");
        int endposition=s1.indexOf('e',startposition);
        //System.out.println(s1.substring(startposition));
        System.out.println(s1.substring(startposition,endposition+2));*/

        /*String name="purnachandhu";
        char[] ch=name.toCharArray();
        System.out.println(ch.length);
        System.out.println(ch[0]);
        System.out.println(ch[ch.length-1]);*/

        String name="I love my India";

        String[] splittedstring=name.split(" ");
        System.out.println(splittedstring[0]);
        System.out.println(splittedstring[1]);
        System.out.println(splittedstring[2]);
        System.out.println(splittedstring[3]);
    }
}
