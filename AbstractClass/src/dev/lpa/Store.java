package dev.lpa;

import java.util.ArrayList;

public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    record OrderItem(int qyt, ProductForSale product){}
    public static void main(String[] args) {

        storeProducts.add(new ArtObject("Oil Painting", 1350,
                "Impressionistic work by ABF painted in 2010"));
        lisProducts();
        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 0, 2);
        addItemToOrder(order1, 1, 1);
        printOrder(order1);
    }
    public static void lisProducts(){
        for(var item: storeProducts){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty){
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for(var item: order){
            item.product().printPriceItem(item.qyt());
            salesTotal += item.product().getSalesPrice(item.qyt());
        }
        System.out.printf("Sales total = $%6.2f %n", salesTotal);
    }
}

