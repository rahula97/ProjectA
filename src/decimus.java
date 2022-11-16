public class decimus implements Decimus{

    private int balance, balance2, balance3;
    private String acc1,acc2,acc3;

    public decimus(int balance, int balance2, int balance3, String acc1, String acc2, String acc3){

        System.out.println("Paramterised Consutructor");
    }

    public decimus() {
        this(20,23,24,"max","verstappen","checo");
        System.out.println("Simple Constructor");


    }

    public boolean passaround(int addon){


        return(this.balance==balance);
      //  return balance;
    }
}
