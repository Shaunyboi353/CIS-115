// Shaun Beard
// M4HW2
// 3/26/2025
// the program will find out if the user is able to vote using nested structures
import java.util.Scanner;
public class M4HW2_Beard 
{

    public static void main(String[] args) 
    {
    
    Scanner k = new Scanner(System.in);

    String vote_name, citizen, county, age, charges;

    System.out.print("Enter the voter name: ");
    vote_name = k.next();
    String yes;
    do
    {
        System.out.print("Answer yes or no to the following Questions");
        System.out.print("Are you a US citizen? ");
        citizen = k.next();
                while (citizen != yes) 
        {
            System.out.println("You cannot vote because you are not US citizen.");    
        }
    
    
    }

     k.close();
    
    }

}