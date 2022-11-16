public class primenumbercheck {

    int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    String primenumbercheck(){

        if(number==1)
        return "Neither Prime not Composite";

        else if(number ==2)
            return "Prime";
        else{
            int t=0;
            for(int i=2;i<=number/2;i++)
            {
                if(number%i==0)
                t=1;
            }
            if(t==1)
                return "Composite";
            else
                return "Prime";
        }
    }
}
