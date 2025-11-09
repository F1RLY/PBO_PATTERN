package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.Product;

public class ProductConsoleView {
    private final Scanner scanner;

    public ProductConsoleView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayMenu(){
        System.out.println("=== MVC SERVICE DAO ===");
        System.out.println("1. Lihat Semua Produk");
        System.out.println("2. Tambah Produk");
        System.out.println("3. Keluar");
        System.out.print("Pilih opsi:  ");
    }

    public void displayAllProducts(ArrayList<Product> products){
        System.out.println("=== Daftar Produk ===");
        if (products.isEmpty()) {
            System.out.println("Tidak ada produk tersedia.");
            
        }else{
            for (Product product : products) {
                System.out.println(product.getId() + " - " + product.getName() + "Rp. " + product.getPrice());
             }
        }
    }

    public void displayMessage(String message){
        System.out.println("INFO: "+message);
    }
    public void displayError(String message){
        System.out.println("ERROR: "+message);
    }

    public String getProductFromUser(){
        System.out.print("Masukkan nama produk: ");
        return scanner.nextLine();
    }

    public String getPriceFromUser(){
        System.out.print("Masukkan harga produk: ");
        return scanner.nextLine();
    }

    public String getPilihanMenuFromUser(){
        return scanner.nextLine();
    }
}