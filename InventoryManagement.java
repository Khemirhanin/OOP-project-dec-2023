public class InventoryManagement {
       public boolean checkStock(product p){
              if(p.getQuantity()==0){
                  System.out.println("out of stock");
                  return false;
              }
              else{
                  System.out.println("in stock");
                  return true;
              }
         }
}
