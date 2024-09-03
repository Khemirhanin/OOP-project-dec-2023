public class DynamicProductSearch {
    public void searchProduct(String name,product pr){
           System.out.println("Searching for product: "+name);
           if (pr instanceof Shirt){
               for(Shirt shirt:((Shirt) pr).getShirts()){
                   if(shirt.getName().equals(name)){
                       System.out.println("Product found");
                       System.out.println("Name: "+shirt.getName()+" Price: "+shirt.getPrice()+" Quantity: "+shirt.getQuantity());
                       break;
                   }
               }
           }
              else if(pr instanceof pants){
                for(pants pants:((pants) pr).getPants()){
                     if(pants.getName().equals(name)){
                          System.out.println("Product found");
                          System.out.println("Name: "+pants.getName()+" Price: "+pants.getPrice()+" Quantity: "+pants.getQuantity());
                          break;
                     }
                }
              }
              else{
                System.out.println("Product not found");
              }
    }

}
