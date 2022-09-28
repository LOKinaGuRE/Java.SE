class Customer  implements Member {

    String name;
    Customer(String name){
        this.name=name;
    }

    @Override //Interface abstarct method
    public void callBack(){
        System.out.print("Okay!  ");
        System.out.println("Replay From :"+this.name);
        System.out.println();
    }

    public String getName() {
        return name;
    }

   
    
}