public class discount {
    public int  discount(double price ){
        int discount = 0;
        if(price > 1000){
            discount = 10;
        }
        else if(price > 500){
            discount = 5;
        }
        else if(price > 100){
            discount = 2;
        }
        else{
            discount = 0;
        }
        return (int) (price - discount);
    }
}
