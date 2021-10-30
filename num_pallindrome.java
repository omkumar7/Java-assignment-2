package Assignment_2;

public class num_pallindrome {

    public static void main(String args[]){
        int r,sum=0,temp;
        int n=454;

        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println(" It is a pallindrome number ");
        else
            System.out.println("It is a not pallindrome");
    }

}
