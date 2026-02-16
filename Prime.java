import java.util.Scanner;

class Prime{
    public static void main(String args[]){
        int n,j,flag = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();

        if(n<=1){
            System.out.println("The number "+n+" is not prime.");
            return;
        }

        for(j=2; j<n; j++){
            if(n%j==0){
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            System.out.println("The number "+n+" is Prime");
        }else{
            System.out.println("The number "+n+" is not Prime");
        }

        s.close();
    }
}