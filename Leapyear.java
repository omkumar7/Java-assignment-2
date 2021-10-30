package Assignment_2;

public class Leapyear {

    public static void leapyear(int num) {
        if (num % 4 == 0) {
            System.out.println( "This is leap year.");
        } else {
            System.out.println("This is not leap year.");
        }
    }

    public static void main(String args[]) {
        leapyear(2012);

    }
}