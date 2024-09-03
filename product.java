import java.util.Vector;
public abstract class product {
    private String name;
    private double price;
    private int quantity;
    public product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public abstract void addProduct(Role roele ,String name, double price, int quantity);
    public abstract void updateProduct(Role role,String name, double price, int quantity);

    public abstract void deleteProduct(Role role);

    public abstract void readProduct();

}

class Shirt extends product {
    private Vector<Shirt> shirts = new Vector<Shirt>();
    private String category;
    public Vector<Shirt> getShirts() {
        return shirts;
    }
    public Shirt(String name, double price, int quantity) {
        super(name, price, quantity);
        this.category = "Clothing";
    }
    public int getQuantity() {
        return super.getQuantity();
    }
    public void addProduct(Role role, String name, double price, int quantity) {
        Shirt shirt = new Shirt(name, price, quantity);
        if (role == Role.ADMIN) {
            shirts.add(shirt);
            System.out.println("Shirt added " + this.getName());
        } else {
            System.out.println("Insufficient privileges. Only admin can add shirts.");
        }
    }
    public void updateProduct(Role role, String name, double price, int quantity) {
        if (role == Role.ADMIN ) {
            this.setName(name);
            this.setPrice(price);
            this.setQuantity(quantity);
            System.out.println("Updating shirt: " + this.getName());
        } else {
            System.out.println("Insufficient privileges to update shirts.");
        }
    }
    public void deleteProduct(Role role) {
        if (role == Role.ADMIN) {
            shirts.remove(this);
            System.out.println("Deleted shirt: " + this.getName());
        } else {
            System.out.println("Insufficient privileges. Only admin can delete shirts.");
        }
    }

    public void readProduct() {
        System.out.println("availaible shirts:");
        for (Shirt shirt : shirts) {
            System.out.println(" " + shirt.getName());
        }
    }
}

class pants extends product {
    private Vector<pants> pants= new Vector<pants>();
    private String category;
    public Vector<pants> getPants() {
        return pants;
    }
    public pants(String name, double price, int quantity) {
        super(name, price, quantity);
        this.category = "Clothing";
    }

    public void addProduct(Role role ,String name, double price, int quantity) {
        pants pantt = new pants(name, price, quantity);
        if (role == Role.ADMIN) {
            pants.add(pantt);
            System.out.println("pants added " + this.getName());
        } else {
            System.out.println("Insufficient privileges. Only admin can add pants.");
        }
    }

    public void updateProduct(Role role,String name, double price, int quantity) {
        if (role == Role.ADMIN || role == Role.CUSTOMER) {
            System.out.println("Updating pants: " + this.getName());
        } else {
            System.out.println("Insufficient privileges to update pants.");
        }
    }
    public void deleteProduct(Role role) {
        if (role == Role.ADMIN) {
            System.out.println("Deleted pants: " + this.getName());
        } else {
            System.out.println("Insufficient privileges. Only admin can delete pants.");
        }
    }

    public void readProduct() {
        System.out.println("avilaible pants:");
        for (pants pants : pants) {
            System.out.println(" " + pants.getName());
        }
    }

    public int getQuantity() {
        return super.getQuantity();
    }
}