package LabSession.July31;

import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - " + price;
    }
}

class PriceNameComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        // First compare price
        int priceCompare = Double.compare(p1.price, p2.price);
        if (priceCompare == 0) {
            // If prices are equal, compare by name
            return p1.name.compareTo(p2.name);
        }
        return priceCompare;
    }
}

public class SortProducts {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 75000));
        products.add(new Product("Phone", 30000));
        products.add(new Product("Tablet", 30000));
        products.add(new Product("Monitor", 15000));

        Collections.sort(products, new PriceNameComparator());

        System.out.println("Products Sorted by Price then Name:");
        
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
