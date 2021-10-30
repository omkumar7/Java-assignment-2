package Assignment_2;

public class LargestNumber {


   public static int n1=1 , n2=4 , n3=6 ;

    public static void main(String[] args) {


        if (n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");

    }
}