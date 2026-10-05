package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);

        double average = sum/5.0;
        System.out.println("\nAverage sales: " + average);

        int max = sales[0];
        int id_max =0;
        for (int i=1; i<sales.length; i++) {
            if (sales[i]>max){
                max = sales[i];
                id_max = i;
            }
        }
        System.out.println("Salesperson "+ id_max+ "had the highest sale with $"+max);

        int min = sales[0];
        int id_min =0;
        for (int i=1; i<sales.length; i++) {
            if (sales[i]>min){
                min = sales[i];
                id_min = i;
            }
        }
        System.out.println("Salesperson "+ id_min+ "had the highest sale with $"+min);

        double amountToBeExceeded = scan.nextDouble();
        int exceededAmount = 0;
        for (int i=1; i<sales.length; i++) {
            if (sales[i]>amountToBeExceeded){
                System.out.println("Salesperson "+ i + "had a sale with $"+sales[i]);
                exceededAmount++;
            }
        }
        System.out.println("The total number of salespeople whose sales exceeded the value entered is"+exceededAmount);

        //modified program : when prenting the id using the index, add 1

        System.out.println("Enter the number of sales people : ");
        final int salesAmount = scan.nextInt();
        int[] sales1 = new int[salesAmount];
        //on copie tout le code precedent en changeant sales par sales1
    }
}