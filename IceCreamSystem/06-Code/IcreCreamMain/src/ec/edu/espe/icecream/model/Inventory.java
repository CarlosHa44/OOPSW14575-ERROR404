package ec.edu.espe.icecream.model;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Inventory {
    private int id;

    public Inventory(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Inventory{" + "id=" + getId() + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Product addProduct(ArrayList<Product> products) {
        Scanner scan = new Scanner(System.in);
        int idaux = getActualId(products);
        int amountaux = 0;
        String nameaux = "";
        float costaux = 0.0f;
        boolean inputValid;
        do {
            try {
                System.out.println("Enter the number of products you want to add");
                amountaux = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter the product name");
                nameaux = scan.nextLine();
                System.out.println("Enter the cost of the product");
                costaux = scan.nextFloat();
                if (costaux < 0.0) {
                    System.out.println("An error occurred");
                    inputValid = false;
                } else {
                    inputValid = true;
                    scan.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("An error occurred");
                inputValid = false;
                scan.nextLine();
            }
        } while (!inputValid);
        return new Product(idaux, amountaux, nameaux, costaux);
    }

    public static int getActualId(ArrayList<Product> products) {
        int idProduct = 0;
        for (Product currentProduct : products) {
            idProduct = currentProduct.getId();
        }
        return idProduct + 1;
    }
}
