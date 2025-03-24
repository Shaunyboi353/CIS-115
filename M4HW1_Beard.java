// Shaun Beard

// M4HW1

// 3/17/2025

// the program will need to calculated the net sold, sales amount, commission amount, and salary

import java.util.Scanner;

public class M4HW1_beard 
{

    public static void main(String[] args) 
    {
    
        // variables
        double commisRate = 0, salesAmount, commisAmount, salary;
        String salesname;
        int netSold = 100;
        int widgetSold, returnedWid;
        final double SALESPRICE = 4.79;
        final double BASESAL = 2000;

        // inputs
        Scanner k = new Scanner (System.in);
        
        System.out.print("Enter salesperson name: ");
        salesname = k.next(); 
        System.out.print("Enter number of Widgets sold: ");
        widgetSold = k.nextInt();
        System.out.print("Enter number of widgets returned: ");
        returnedWid = k.nextInt();

        // calculations
        netSold = widgetSold - returnedWid;
        salesAmount = netSold * SALESPRICE;
        commisAmount = commisRate * salesAmount;
        salary = commisAmount + BASESAL;


        // commission rate structure
        if(netSold <=100)
            commisRate = .1;
        else if (netSold <= 199)
            commisRate = .15;
        else if (netSold <= 299)
            commisRate = .2;
        else commisRate = .25;
        
        // Output

        System.out.print("Net Widgets Sold: " + netSold);
        System.out.println();
        System.out.print("Widgets Sales Amount: " + salesAmount);
        System.out.println();
        System.out.print("Commission Amount: " + commisAmount);
        System.out.println();
        System.out.print("Salary: " + salary);

        k.close();

        
    }
}
