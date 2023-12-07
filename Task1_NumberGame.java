import java.util.Random;
import java.util.Scanner;

public class Task1_NumberGame {

    public static void main(String args[])
    {
        Random random = new Random();
        int RandomNumber = random.nextInt(100) + 1;

        System.out.println("Let's Start the game !");
        
        Scanner sc = new Scanner(System.in);
        int number;
        
        do{
            System.out.println("Enter a value between 1-100 : ");
            number = sc.nextInt();

            if(number==RandomNumber)
            {
                System.out.println("The guess is correct ");
            }
            else if(number > RandomNumber)
            {
                System.out.println("Too high");
            } 
            else if(number < RandomNumber)
            {
                System.out.println("Too low");
            }
        }while(number != RandomNumber);
        sc.close();

    }
    
}