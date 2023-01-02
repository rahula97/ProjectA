package defaultPackage;
public class Ben10 implements Benjamin{
    String alienColor, alienPower;

    public Ben10() {
    }

    public Ben10(String alienColor, String alienPower) {
        this.alienColor = alienColor;
        this.alienPower = alienPower;
    }

    public String getAlienColor() {
        return alienColor;
    }

    public void setAlienColor(String alienColor) {
        this.alienColor = alienColor;
    }

    public String getAlienPower() {
        return alienPower;
    }

    public void setAlienPower(String alienPower) {
        this.alienPower = alienPower;
    }
}
