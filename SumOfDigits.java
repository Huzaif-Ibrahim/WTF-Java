import java.util.Scanner;

class SumOfDigits{
    public static void main(String[] args){
        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = s.nextInt();

        int sum = 0;

        do{
            sum = sum + (n%10);
            n = n/10;
        }while(n != 0);

        System.out.println("Sum of the number is: " + sum);
    }
}