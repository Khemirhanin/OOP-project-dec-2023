
import java.util.Scanner;
import java.util.Vector;
enum Role {
    ADMIN, CUSTOMER
}
class UserAuthentication {
    private final Vector<User> users = new Vector<>();

    void addUser(User user) {
        users.add(user);
    }

    public boolean authenticate(String username, String password, Role role) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password) && user.getRole().equals(role)) {
                return true;
            }
        }
        return false;
    }
}

class User {
    private String username;
    private String password;
    private Role role;
    private final UserAuthentication ua = new UserAuthentication();

    void signUp() {
        System.out.println("Sign up");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        username = scanner.nextLine();

        System.out.println("Enter password:");
        password = scanner.nextLine();

        System.out.println("Enter role (ADMIN or CUSTOMER):");
        role = Role.valueOf(scanner.nextLine());

        ua.addUser(this);
    }

    void login() {
        System.out.println("Login");
        Scanner scanner = new Scanner(System.in);

        boolean loggedIn = false;
        do {
            System.out.println("Enter username:");
            String inputUsername = scanner.nextLine();

            System.out.println("Enter password:");
            String inputPassword = scanner.nextLine();

            System.out.println("Enter role (ADMIN or CUSTOMER):");
            Role inputRole = Role.valueOf(scanner.nextLine());

            if (ua.authenticate(inputUsername, inputPassword, inputRole)) {
                loggedIn = true;
                System.out.println("Login successful");
            } else {
                System.out.println("Login failed. Try again.");
            }
        } while (!loggedIn);
    }
    void logout(){
        System.out.println("logged out");
    }
   public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public Role getRole(){
        return role;
    }


}




public class Main {
    public static void main(String[] args) {
       User user = new User();
       user.signUp();
       user.login();
       Shirt shirt = new Shirt("", 0, 0);
       shirt.addProduct(Role.ADMIN,"oversized shirt", 20, 10);
       shirt.addProduct(Role.ADMIN,"long sleeve shirt", 30, 10);
       shirt.addProduct(Role.ADMIN,"short sleeve shirt", 40, 10);
       pants pants = new pants("", 0, 0);
       pants.addProduct(Role.ADMIN,"jeans", 20, 10);
       pants.addProduct(Role.ADMIN,"shorts", 30, 10);
       pants.addProduct(Role.ADMIN,"sweatpants", 40, 10);
       pants.readProduct();
       shirt.readProduct();
       Shirt sh=new Shirt("oversized shirt", 20, 1);
       pants pa=new pants("jeans", 20, 1);
       pants pa2=new pants("shorts", 20, 2);
       shoppingcard shc=new shoppingcard(user);
       OrderProcessing op=new OrderProcessing(user,shc);
       InventoryManagement im=new InventoryManagement();
         im.checkStock(sh);
         if(!im.checkStock(sh)){
             System.out.println("out of stock");
             op.OrderProduct(sh);
         }
         else{
             System.out.println("in stock");
         }
        if(!im.checkStock(pa)){
            System.out.println("out of stock");
            op.OrderProduct(pa);
        }
        else{
            System.out.println("in stock");
        }
       DynamicProductSearch dps=new DynamicProductSearch();
        dps.searchProduct("oversized shirt",shirt);
        shc.pay();
        Shipping s=new Shipping();
        s.shipProduct(sh);
        s.shipProduct(pa);
        user.logout();

    }
    }


