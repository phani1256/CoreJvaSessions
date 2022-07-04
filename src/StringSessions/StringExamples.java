package StringSessions;

public class StringExamples {
    static  String s1="Naveen";
    static String s2="I love my country";

    static  String s3=new String("India is my country");

    static  String firstName="Purna";
    static  String lastName="chandra";
    static  String fullName;
    public static void main(String[] args) {
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s1.toLowerCase());
        int len=s1.length();
        System.out.println(len);
        System.out.println(s3.length());
        System.out.println(s3.contains("india"));
        //fullName=firstName+lastName;
        fullName=firstName.concat(lastName);
        System.out.println(fullName);
        System.out.println("Full name of the string is :"+fullName);

    }
}
