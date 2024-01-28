import java.util.Scanner;
public class Condtional_Statements{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Choice: ");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1 : System.out.println("Adil");
            break;
            case 2: System.out.println("Ayush");
            break;
            case 3: 
            System.out.println("Promil");
            break;
            case 4: System.out.println("Ayushman");
            break;
            default: System.out.println("HEHE");
            break;
        }
        
    }
}