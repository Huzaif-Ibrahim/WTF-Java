// 5

import java.util.Scanner;

class Equation{
    public static void main(String[] args){
        String n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the equation : ");
        n = s.nextLine();
        String a = n.replaceAll("","");

        if(a.length() < 3){
            System.out.println("Enter the equation : ");
            System.out.println("Minimum 2 numbers and one operator is required.");
        }
        int i = 0;
        int result = 0;
        while(a.charAt(i) != '+' && a.charAt(i) != '-' && a.charAt(i) != '*' && a.charAt(i) != '/'){
            i++;
        }

        switch(a.charAt(i)){
            case '+':
                result = Integer.parseInt(a.substring(0,i)) + Integer.parseInt(a.substring(i+1, a.length()));
                break;

            case '-':
                result = Integer.parseInt(a.substring(0,i)) - Integer.parseInt(a.substring(i+1, a.length()));
                break;
            
            case '*':
                result = Integer.parseInt(a.substring(0,i)) * Integer.parseInt(a.substring(i+1, a.length()));
                break;

            case '/':
                result = Integer.parseInt(a.substring(0,i)) / Integer.parseInt(a.substring(i+1, a.length()));
                break;
        }

        System.out.println(a.substring(0,i) + " " + a.charAt(i) + " " + a.substring(i+1, a.length()) + " = " + result);

    }
}