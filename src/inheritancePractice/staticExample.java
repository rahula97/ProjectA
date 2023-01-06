package inheritancePractice;

public class staticExample {
   /* int b,c;
    String d,e,f;
  */
   static int a=15;
    public static void printExample(String max){
        System.out.println(max);
    }

    // Now time for instantiated Method
    public void nonstaticPrint(){
        System.out.println("What is this palce");
        printExample("Sofi Tukker");

        int black = 3>7 ? 15:16;
        System.out.println(black);
    }

}
