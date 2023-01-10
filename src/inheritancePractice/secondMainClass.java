package inheritancePractice;

public class secondMainClass {
    public static void main(String[] args){
        Band Metallica = new Band(false,true,false,"Rock","Metallica",13,6,12.7,"Master of Puppets");


        System.out.println(Metallica.toString());

        Metallica.areaMaster();
    }


}
