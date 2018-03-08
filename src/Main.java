import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        int[] numbers = new int[10];
        String userInput = null;
        int sum = 0;
        int i = 0;

        Scanner sc = new Scanner(System.in);

        OUTER:
        do {

            try{
                System.out.println("Enter a number into the Array:");
                userInput = sc.nextLine();
                if(userInput.equals("STOP"))
                    break OUTER;
                numbers[i] = Integer.parseInt(userInput);
                i++;

            } catch (Exception e){
                System.out.println("Please enter a valid number or type STOP");
            }

        }while (i<10);


       for(int j=0; j < numbers.length; j++){
           sum += numbers[j];
       }

       System.out.println(Arrays.toString(numbers));
       System.out.println(sum);


    }
}
