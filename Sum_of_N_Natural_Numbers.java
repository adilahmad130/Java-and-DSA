import java.util.Scanner;
public class Sum_of_N_Natural_Numbers{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int sum=0;
        for(int i = 0;i<=n;i++)
        {
           sum=sum+i;   
        }
        System.out.println("Sum of N Natural Numbers: "+sum);

    }
}