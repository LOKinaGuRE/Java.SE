public class FormatChallenge {
public static void main (String arg[]) {

//int num1,num2;
//num1=101010;

//num2=0x37BE;

//System.out.println(num1);

//String sBin=String.valueOf(num1);
//String sHex="23BE";

//System.out.println(sBin.matches("[01]*"));
//System.out.println(sBin.matches("[0-9a-zA-Z]*"));

//String date="23/06/2022";

//System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));



String s1="aB!c@#1$2%2";
String s2=s1.replaceAll("\\W","");
System.out.println(s2);

String s3="   Hello    jhon            It's     Time!   ";
String s4=(s3.replaceAll("\\s+"," ")).trim();
System.out.println(s4);

String s5= "aB!c@#1$2%2 Hello jhon It's   Time! ";
//String s6=s5.replaceAll(	"[^A-Za-z]",""	);
//System.out.println(s6.length()); gives number of alphabtes

String s7="   Hello    jhon     @       It's     Time!   ";
String s8=(s7.replaceAll("\\s+"," ")).trim();
String s9[]=s8.split("\\s"); //stores words in array
System.out.println(s9.length);

}
}
