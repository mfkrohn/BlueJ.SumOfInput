/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        boolean go = true;
        int sum = 0;
        while(go){
        System.out.println("Please type in an integer, n. I will tell you " + 
        "the sum of 1 to n.");
        if (scanner.hasNextInt()){
         int num = scanner.nextInt();
         for(int i = 0; i < num + 1; i++){
             sum += i;
            }
           System.out.println("The sum of the numbers is: " + sum);
            
           System.out.println("Would you like to keep going? Type \"Yes\" or \"yes\" to continue");
    
           String ans = scanner1.nextLine();
           System.out.println(ans);
    if(ans.equalsIgnoreCase("Yes")){
        System.out.println("Ok, let's go again");
    }
    else{
     go = false; 
     System.out.println("Bye!");
    } 
    }
    else {
        System.out.println("Entry was not an integer. Please type an integer next time, Bye!");
        go = false;
    }
    
    sum = 0;
}
}
}
