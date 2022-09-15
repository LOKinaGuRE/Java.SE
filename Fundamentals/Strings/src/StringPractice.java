package javabootcamp;

public class StringPractice {
    public static void main(String[] args) {
        String s1 = new String("  Hello Java Programming   ");
        String s2 = s1.trim();
        String s3 = s1.substring(5);
        String s4 = s1.substring(5,10);
        String s  = new String(" LOKi  nagure  ") ;

//        System.out.println(s.substring(3));
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);

        char c[] = {'H','E','L','L','O'};
        byte b[] = {65,66,67,68,69};

        String str1 = "JAVA"; //--> str1 r-> JAVA in String Const Pool  (No specific object created to Heap)
        String str2 = new String ("JAVA");// new object created in Heap that references Literal
        String str3 = new String(c); // constructor taking c set ofCharacter array
        String str4 = new String(b); // constructor taking c set ofBytes array  and prints its repective unicode values represantation
        String str1_2 = "JAVA";

//        String str5 = new String(b,1,2);
//        String str6 = new String(c,1,2);
//        System.out.println(str3);
//        System.out.println(str4);
//        System.out.println(str5);
//        System.out.println(str6);
//        System.out.println(str1==str1_2);

        System.out.println(str3.replace('H','Y'));
        System.out.println(str3.startsWith("Y"));//False : Strings are immutable
        System.out.println(str3.startsWith("H"));// True:

        System.out.println();
        System.out.println(str3.charAt(2));
        System.out.println(str3.indexOf("LO"));
        System.out.println(str3.lastIndexOf("O"));
        System.out.println(str3.length());
        System.out.println(str3.lines());

        System.out.println(str1.equals(str2));
        // True : this will not check reference this checks the content

        System.out.println(str3.equalsIgnoreCase("hello"));
        System.out.println("hello".equalsIgnoreCase(str3));

        System.out.println();
        System.out.println();
        String ss = "upGrad" ;
        String so = "application";
        System.out.println(ss.compareTo(so));

        
    }
}
