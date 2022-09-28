public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {

        TV t1=new TV();
            t1.switchOn();
            t1.changeChannel();
            t1.changeVolume();
            t1.switchOf();
        System.out.println();

        SmartTv s1=new SmartTv() ;
         s1.switchOn();
        s1.changeChannel();
        s1.changeVolume();
        s1.playGame();
        s1.switchOf();
        System.out.println();


        //Smart Tv on only TV Mode

        //WIll not able to open Game mode

        TV staTV = new SmartTv();
        staTV.switchOn();
        staTV.changeChannel();
        staTV.changeVolume();
      //  staTV.playGame();
        staTV.switchOf();
        System.out.println();

      //  SmartTv TvaStv = new  TV();
        // A normal Tv Cannot act as Smart Tv
        //But a Smart Tv can act as Normal Tv , But unable to access Specialised smartV functions





    }
}

class  TV {
    void switchOn(){
        System.out.println("Tv On");
    }
    void changeChannel(){
        System.out.println("TV Channel changed");
    }
    void changeVolume(){
        System.out.println("Volume Changed");
    }
    void switchOf(){
        System.out.println("TV Switched OFF");
    }

}

class  SmartTv extends TV {
    @Override
    void changeChannel(){
        System.out.println("SmartTV :Channel Changed");
    }
    @Override
    void  changeVolume(){
        System.out.println("SmartTv: Volume Changed");
    }
    @Override
    void switchOf(){
        System.out.println("SmartTV: Switched OFF");
    }

    void playGame(){
        System.out.println("Game Mode On");
    }


}