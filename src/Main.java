import model.Customer;
import model.Items;
import model.Order;

import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {
            Items i1 = new Items("Cake", "Desert","Buttersotch");
            Items i2 = new Items("Crunchy", "Snacks","Burger");

            Items i3 = new Items("cold", "drinks", "Coke");
            Items i4 = new Items("chessy", "Veg", "Cheeseballs");

            ArrayList<Items> Items1 = new ArrayList<>();
            Items1.add(i1);
            Items1.add(i2);

            ArrayList<Items> Items2 = new ArrayList<>();
            Items2.add(i3);
            Items2.add(i4);


            Order o1 = new Order("Shreebisha", Items1);
            Order o2 = new Order("Shawty",  Items2);

            ArrayList<Order> customer1order = new ArrayList<>();
            customer1order.add(o1);

            ArrayList<Order> customer2order = new ArrayList<>();
            customer2order.add(o2);

            Customer c1 = new Customer(1, customer1order, 195);
            Customer c2 = new Customer(2, customer2order, 125);

            i1.getItemDetails();
            c1.getInvoice(500.35);
        }
    }

