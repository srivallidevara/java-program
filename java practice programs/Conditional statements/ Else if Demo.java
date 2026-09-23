public class TemperatureDemo {

    public static void main(String[] args) {

        int temperature = 32;

        if(temperature >= 40) {
            System.out.println("Very Hot");
        }
        else if(temperature >= 30) {
            System.out.println("Hot");
        }
        else if(temperature >= 20) {
            System.out.println("Normal");
        }
        else {
            System.out.println("Cold");
        }
    }
}
