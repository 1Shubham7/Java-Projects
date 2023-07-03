package dev.lpa;
import java.util.ArrayList;

record OrderItem (int qty, ProductForSale product){

}

public abstract class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil painting", 1200,
                "Impressionistic work by Raja Ravi Verma "));
        storeProducts.add(new ArtObject("Sculpture", 2000, "Bronze work by RRV, produced in 1950"));
        storeProducts.add(new Furniture("Lamp" , 200, "Tiffany Lamp with HummingBirds"));
        listProducts();
        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1,2);
        addItemToOrder(order1,0,1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 1,2);
        addItemToOrder(order2,2,3);
        printOrder(order1);
    }

    public static void listProducts() {
        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder (ArrayList<OrderItem> order, int orderIndex, int qty){
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $6.2f %n", salesTotal);
    }
}