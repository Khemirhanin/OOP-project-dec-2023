import java.util.Vector;
public class shoppingcard {
    User user ;
    Vector<product> products = new Vector<product>();
    Payment p= new Payment();
    public shoppingcard(User user){
        this.user = user;
    }
    public void addProduct(product product){
        products.add(product);
    }
    public void removeProduct(product product){
        products.remove(product);
    }
    public void updateProduct(product product){
        products.set(products.indexOf(product),product);
    }
    void  displaycardinfo(){
        System.out.println("Shopping card info");
        System.out.println("User: "+user.getUsername());
        System.out.println("Products: ");
        for (product product : products) {
            System.out.println("Name: "+product.getName()+" Price: "+product.getPrice()+" Quantity: "+product.getQuantity());
        }
    }

    public void pay(){
        discount d = new discount();
        double total = 0;
        for (product product : products) {
            total += product.getPrice() * product.getQuantity();
        }
        if(products.size()>5){
            total= d.discount(total);
        }
        p.processPayment(total);
    }




}
