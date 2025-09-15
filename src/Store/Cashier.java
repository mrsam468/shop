package Store;



public class Cashier extends Staff{

   public void resume() {
       System.out.println("i will be resuming work by 10 am");
    }
    public void sellAndReceipt(){
        Product prod = new Product();
        System.out.println("these are the list of products we have");
        prod.products().forEach((k,v)-> System.out.println(k));
        System.out.println("what will you like to buy?");
        Customer customer = new Customer();

        String name = customer.name;
        System.out.println("one "+name+" will cost $"+prod.priceGetter(name));
        System.out.println("how many  "+name +" will you like to buy?");
        int amount = customer.number();
        System.out.println("here is receipt");
        System.out.println("name-of-product: "+name);
        System.out.println("Total goods purchase: "+amount);
        System.out.println("unit price: "+ prod.priceGetter(name));
        System.out.println("total price: "+amount* prod.priceGetter(name));
        System.out.println("thanks for you patronage");
    }



}
