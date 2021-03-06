package cs544.exercise5_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    // IProductService productService = new ProductService();

    // Change the application in such way that App.java no longer instantiates ProductService but
    // instead retrieves this object from the Spring context
    try (ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("springconfig.xml")) {

      IProductService productService = context.getBean("productService", IProductService.class);
      Product product1 = productService.getProduct(423);
      if (product1 != null) {
        System.out.println(product1.toString());
      }
      Product product2 = productService.getProduct(239);
      if (product2 != null) {
        System.out.println(product2.toString());
      }

      System.out.println("we have " + productService.getNumberInStock(423)
          + " product(s) with productNumber 423 in stock");
      System.out.println("we have " + productService.getNumberInStock(239)
          + " product(s) with productNumber 239 in stock");
    }

  }
}
