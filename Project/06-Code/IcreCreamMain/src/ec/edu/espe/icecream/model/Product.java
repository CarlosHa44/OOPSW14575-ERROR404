package ec.edu.espe.icecream.model;

import com.google.gson.reflect.TypeToken;
import ec.edu.espe.icecream.utils.UseJson;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Product {

    private int id;
    private int amount;
    private String name;
    private float cost;

    public Product(int id, int amount, String name, float cost) {
        this.id = id;
        this.amount = amount;
        this.name = name;
        this.cost = cost;
    }
    static Scanner scan = new Scanner(System.in);

    public static void menuProduct(ArrayList<Product> products) {
        UseJson<Product> jsonUtilProducts = new UseJson<>();
        products = jsonUtilProducts.readFile("productdata.json", new TypeToken<ArrayList<Product>>() {
        }.getType());

        int optionInventory;
        while (true) {
            System.out.println("///////////Inventory////////");
            System.out.println("1.Add a new product");
            System.out.println("2.Show inventory products");
            System.out.println("3.Return to the main menu");

            if (scan.hasNextInt()) {
                optionInventory = scan.nextInt();
                scan.nextLine();  
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scan.nextLine();  
                continue;  
            }

            switch (optionInventory) {
                case 1:
                    products.add(Inventory.addProduct(products));
                    jsonUtilProducts.writeFile("productdata.json", products);
                    break;
                case 2:
                    System.out.println("Products" + products);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    @Override
    public String toString() {
        return "\n\tid=" + getId() + "--amount=" + getAmount() + "--name=" + getName() + "--Cost=" + getCost();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
