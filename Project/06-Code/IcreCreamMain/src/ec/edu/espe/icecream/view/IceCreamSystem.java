package ec.edu.espe.icecream.view;
import ec.edu.espe.icecream.model.Client;
import ec.edu.espe.icecream.model.Invoice;
import ec.edu.espe.icecream.model.Product;
import ec.edu.espe.icecream.model.SaleNote;
import ec.edu.espe.icecream.utils.Authenticator;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Carlos Hernandez
 */
public class IceCreamSystem {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Invoice> invoices = new ArrayList<>();
        ArrayList<Client> clients = new ArrayList<>();

        // Autenticación del usuario
        if (Authenticator.authenticateUser(scan)) {
            int option = 0;
            do {
                showMainMenu();
                option = scan.nextInt();
                scan.nextLine();

                switch (option) {
                    case 1:
                        Product.menuProduct(products);
                        break;
                    case 2:
                        Invoice.menuInvoice(invoices, products);
                        break;
                    case 3:
                        Client.menuClient(clients);
                        break;
                    case 4:
                        SaleNote.menuSaleNote(products, clients);
                        break;
                    case 5:
                        // Implementa la lógica para el informe comercial
                        break;
                    case 6:
                        System.out.println("Exiting the Ice Cream System. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }

            } while (option != 6);
        } else {
            System.out.println("Authentication failed. Exiting the Ice Cream System. Goodbye!");
        }
    }

    public static void showMainMenu() {
        System.out.println("///////Ice Cream System/////////");
        System.out.println("1.Inventory");
        System.out.println("2.Invoice");
        System.out.println("3.Clients");
        System.out.println("4.SaleNote");
        System.out.println("5.Business report");
        System.out.println("6. Exit");
    }
}