package IntroPOO.EX2.application;

import IntroPOO.EX2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter product data: ");
    System.out.println("name: ");
    String name = sc.nextLine();
    System.out.println("price: ");
    double price = sc.nextDouble();
    System.out.println("quantity: ");
    int quantity = sc.nextInt();

    Product product = new Product(name, price, quantity);

    System.out.println();
    System.out.println("Product data: " + product);

    System.out.println();
    System.out.println("Enter the number of products to be added in stock: ");
    quantity = sc.nextInt();
    product.addProducts(quantity);

    System.out.println();
    System.out.println("Updated dataT: " + product);

    System.out.println();
    System.out.println("Enter the number of products to be removed in stock: ");
    quantity = sc.nextInt();
    product.removeProducts(quantity);

    System.out.println();
    System.out.println("Updated dataT: " + product);

    sc.close();
  }
}
