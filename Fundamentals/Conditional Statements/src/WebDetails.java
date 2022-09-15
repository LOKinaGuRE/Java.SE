import java.util.Scanner;


public class WebDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter URL");
        String website = sc.next();

        String type = website.substring(  website.lastIndexOf(".")+1    );
        String protocol = website.substring(0,website.indexOf(":"));

        switch (protocol){
            case "https" :
                System.out.println("Secured Hyper Text Transfer Protocol "); break ;

            case "http" :
                System.out.println("Hyper Text Transfer Protocol");         break;

            case  "ftp" :
                System.out.println("File Transfer Protocol");               break;

            default:
                System.out.printf("This website uses %s protocol ", protocol);
        }

        switch (type){

            case "com" :
                System.out.println("Commercial website "); break;

            case "edu" :
                System.out.println("Educational website "); break;

            case "org" :
                System.out.println("Organisational website"); break;

            case "net" :
                System.out.println("Networking website ");     break;

            default:
                System.out.printf("This is %s type of website",type); break;


        }



    }
}
