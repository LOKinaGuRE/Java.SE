public class Shop {
    

Member[] mem = new Member [50];

int couunt =0;


//Taking Member Type as Param
void registerMembers(Member m){
    this.mem[couunt++]=m;
}


//goes to Customer callBack Method
void saleInvite(){

    for (int i=0 ; i <couunt ; i++){
        mem[i].callBack();
    }


}




}
