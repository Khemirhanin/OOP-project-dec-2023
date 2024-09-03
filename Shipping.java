import java.util.Scanner;
public class Shipping {
    public void shipProduct(product p){
        System.out.println("Shipping product: "+p.getName());
        System.out.println("Shipping method: ");
        System.out.println("1- Standard shipping");
        System.out.println("2- Express shipping");
        System.out.println("3- Same day shipping");
        System.out.println("4- Pick up");
        System.out.println("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Standard shipping");
                break;
            case 2:
                System.out.println("Express shipping");
                break;
            case 3:
                System.out.println("Same day shipping");
                break;
            case 4:
                System.out.println("Pick up");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
