package Store;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
public class Product {
     public Map<String,Integer> products(){
         Map<String,Integer> product = new HashMap<>();
         product.put("bread",3000);
         product.put("egg",200);
         product.put("milk",3000);
         product.put("biscuits",500);
         product.put("yogurt",1500);
         product.put("mango",8000);
         product.put("hypo",1000);
         product.put("sweet",100);
         product.put("groundnut",4500);

          return product;
     }
     public int priceGetter(String name){
         Product prod = new Product();
         Map<String,Integer> product= prod.products();
         return (int) product.get(name);
     }
}
