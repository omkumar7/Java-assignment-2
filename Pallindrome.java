package Assignment_2;

public class Pallindrome {
            public static void main(String[] args) {

            String pallindrome = "radar";
            int length = pallindrome.length();
            String reverse = "";
            for(int i=length-1; i >=0; i--){

               reverse = reverse + pallindrome.charAt(i);
            }
            if(pallindrome.equals(reverse)){
                System.out.println("It is a pallindrome");
            }
            else {
                System.out.println("It is a not pallindrome");
            }

    }
}
