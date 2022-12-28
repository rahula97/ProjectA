public class newPracticeClass {
 /*   public static void main(String[] args){
        System.out.println("This is state of newPracticeClass");

        int max =3;

        //Time to Declare first class without any interface

        class Ben10 implements Gwen10Interface{

            private String testString;


        }

        //Although it doesn't seem to have any useful thing going on. Declaring class inside function seems to enable use to maybe manage data better. Most like a subclass made of different types of data. We shall see where it will be useful if at all
        Ben10 BenTennyson = new Ben10();

        BenTennyson.testString = "Audrey";
        Alien aliens = new Alien();
//        aliens.alienName= "Heatblast";
//        aliens.alienPower="Firestarter";

        aliens.setAlienName("SuckMyBalls");
        aliens.setAlienPower("BallSucking");


        System.out.println("max is " + max);
        System.out.println("testString is %s" + aliens.getAlienName());
        System.out.println("Awful SHit is happening man");


    }*/

    public static void main(String[] args) {
        System.out.println("This is test for the prime number program");


        /*primenumbercheck prime = new primenumbercheck();

        prime.setNumber(2);

        System.out.println(prime.primenumbercheck());

         */
        /* intefaceExample variableName = new classExample();

        variableName.setIntegerA(32);
        System.out.println(variableName.getIntegerA());*/ 
        /*Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());*/

        //Constructor example
        Person person = new Person();
        System.out.println(person.getFirstName());


    }
}
