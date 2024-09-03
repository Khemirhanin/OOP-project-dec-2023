public class OrderProcessing {
 private User user;
    private shoppingcard shoppingcard;
    public OrderProcessing(User user, shoppingcard shoppingcard){
        this.user = user;
        this.shoppingcard = shoppingcard;
    }
    public void  OrderProduct(product p){
        shoppingcard.addProduct(p);
    }
    public void  removeProduct(product p){
        shoppingcard.removeProduct(p);
    }


}
