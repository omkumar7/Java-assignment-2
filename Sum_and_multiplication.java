package Assignment_2;

public class Sum_and_multiplication {

     int sum(int a, int b){ return a + b;}
     int sum(int a, int b, int c){ return a + b + c;}
     int mul(int a, int b){ return a * b;}
     int mul(int a, int b ,int c){ return a * b *c;}


    public static void main(String[] args) {

           Sum_and_multiplication fun = new Sum_and_multiplication();

            System.out.println(fun.sum ( 3, 3) + ". sum");
            System.out.println(fun.mul(2,3,4) + ". multiplication" );
     }

}




