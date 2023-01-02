package defaultPackage;
public class classExample implements intefaceExample {

    int integerA, integerB, integerC;
    String stringA, stringB, stringC;

    public classExample() {
        integerA = 15;
    }

    public classExample(int integerA, int integerB, int integerC, String stringA, String stringB, String stringC) {
        this.integerA = integerA;
        this.integerB = integerB;
        this.integerC = integerC;
        this.stringA = stringA;
        this.stringB = stringB;
        this.stringC = stringC;
    }

    public int getIntegerA() {
        return integerA;
    }

    public void setIntegerA(int integerA) {
        this.integerA = integerA;
    }

    public int getIntegerB() {
        return integerB;
    }

    public void setIntegerB(int integerB) {
        this.integerB = integerB;
    }

    public int getIntegerC() {
        return integerC;
    }

    public void setIntegerC(int integerC) {
        this.integerC = integerC;
    }

    public String getStringA() {
        return stringA;
    }

    public void setStringA(String stringA) {
        this.stringA = stringA;
    }

    public String getStringB() {
        return stringB;
    }

    public void setStringB(String stringB) {
        this.stringB = stringB;
    }

    public String getStringC() {
        return stringC;
    }

    public void setStringC(String stringC) {
        this.stringC = stringC;
    }
}
