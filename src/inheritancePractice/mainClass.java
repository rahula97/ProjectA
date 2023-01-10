package inheritancePractice;

public class mainClass {
    public static void main(String... args){
        System.out.print("Whatis this thsit");
        System.out.print("");
        String One,two,three,four;
        int place1,place3;
        place1 = 1;
        place3 = 3;
        System.out.println("Combined value of places is "+(place1+place3));


        //staticExample.printExample("OHIO");
        /*staticExample newStatic = new staticExample();
        newStatic.nonstaticPrint();
        newStatic.printExample("odd Places");
*/
        ComplexNumber number = new ComplexNumber(5.1,-3.5);
        number.subtract(3.5,7.2);

        System.out.println("The Complex Number is real part: "+ number.getReal()+" and imaginary part is "+number.getImaginary());

        number.add(new ComplexNumber(5.1,4.2));

        System.out.println("The Complex Number is real part: "+ number.getReal()+" and imaginary part is "+number.getImaginary());



        StudentPojo studentOne = new StudentPojo(15,"Charles","Murder");

        System.out.println(studentOne);


    }

    public void newPrint(){
        System.out.println("This is a new print");
    }

}
