package ec.edu.espe.icecream.view;

import com.google.gson.reflect.TypeToken;
import ec.edu.espe.icecream.model.Client;
import ec.edu.espe.icecream.model.GestionClient;
import static ec.edu.espe.icecream.model.Inventory.addProduct;
import static ec.edu.espe.icecream.model.Inventory.deleteProduct;
import static ec.edu.espe.icecream.model.Invoice.addInvoice;
import ec.edu.espe.icecream.model.Invoice;
import ec.edu.espe.icecream.model.Product;
import ec.edu.espe.icecream.model.SaleNote;
import ec.edu.espe.icecream.utils.UseJson;

import ec.edu.espe.icecream.utils.UseJsonInvoice;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Carlos Hernandez
 */
public class IceCreamSystem {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;
        UseJson<Product> jsonUtilProducts = new UseJson<>();
        ArrayList<Product> products = jsonUtilProducts.readFile("productdata.json", new TypeToken<ArrayList<Product>>(){}.getType());
        UseJson<Invoice> jsonUtilInvoice = new UseJson<>();
        ArrayList<Invoice> invoices = jsonUtilInvoice.readFile("invoicedata.json", new TypeToken<ArrayList<Invoice>>(){}.getType());
        UseJson<Client> jsonUtilClients = new UseJson<>();
        ArrayList<Client> clients = jsonUtilClients.readFile("clientdata.json", new TypeToken<ArrayList<Client>>() {}.getType());

        
        do {
            System.out.println("///////Ice Cream System/////////");
            System.out.println("1.Inventory");
            System.out.println("2.Invoice");
            System.out.println("3.Clients");
            System.out.println("4.SaleNote");
            System.out.println("5.Business report");
            System.out.println("6. Exit");
            option = scan.nextInt();
            scan.nextLine();
            switch (option) {
                case 1:
                    int optionInventory = 0;
                    do {
                        System.out.println("///////////Inventary////////");
                        System.out.println("1.Añadir un nuevo producto");
                        System.out.println("2.Mostrar los productos del inventario");
                        System.out.println("3.Eliminar un producto del inventario");
                        System.out.println("4.Regresar al menu principal");
                        optionInventory = scan.nextInt();
                        scan.nextLine();
                        switch (optionInventory) {
                            case 1:
                                products.add(addProduct(products));
                                jsonUtilProducts.writeFile("productdata.json", products);
                                break;
                            case 2:
                                System.out.println("array" + products);
                                break;
                            case 3:
                                deleteProduct(products);
                                jsonUtilInvoice.writeFile("invoicedata.json", invoices);
                                break;
                            case 4:
                                break;
                        }
                    } while (optionInventory != 4);
                    break;
                case 2:
                    int optionInvoice=0;
                    do {
                        System.out.println("//////////Invoice/////////");
                        System.out.println("1.Añadir una nueva factura");
                        System.out.println("2.Buscar una factura");
                        System.out.println("3.Regresar al menu principal");
                        optionInvoice = scan.nextInt();
                        scan.nextLine();
                        switch (optionInvoice) {
                            case 1:
                                invoices.add(addInvoice(invoices,products));
                                jsonUtilProducts.writeFile("productdata.json", products);
                                jsonUtilInvoice.writeFile("invoicedata.json", invoices);
                                break;
                            case 2:
                                System.out.println("array" + invoices);
                                break;
                            case 3:
                                break;
                        }
                    } while (optionInvoice != 3);
                    break;
                case 3:
                    int optionClient=0;
                    do {
                        System.out.println("//////////CLIENT/////////");
                        System.out.println("1.Ingresar Clientes");
                        System.out.println("2.Editar Cleintes");
                        System.out.println("3.Mostrar Clientes");
                        System.out.println("4.Regresar al menu principal");
                        optionClient = scan.nextInt();
                        scan.nextLine();
                        switch (optionClient) {
                            case 1:
                                clients.add(Client.addClient());
                                jsonUtilClients.writeFile("clientdata.json", clients);
                                break;
                            case 2:
                                Client.editClient(clients);
                                jsonUtilClients.writeFile("clientdata.json", clients);
                                break;
                            case 3:
                                System.out.println("array" + clients);
                                        
                                break;
                            case 4:
                                break;
                        }
                    } while (optionClient != 4);

                    break;
                case 4:
                       SaleNote saleNote = SaleNote.createSaleNote(clients, products);
                    break;
                    
                case 5:
                    //Mostrar el reporte de ventas en funcion de los invoice y las notesale
                    break;
                case 6:
                    break;
            }

        } while (option != 6);

    }

}
