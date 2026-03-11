import java.util.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
CO2 – Abstract Data Type (ADT)
Defining an interface to represent bill calculation behavior
*/
interface BillCalculations {
    double calculateTotal(double[] price, int[] qty);
}

/*
CO2 – Implementation of ADT
Concrete class implementing the bill calculation interface
*/
class BillingHelper implements BillCalculations {

    public double calculateTotal(double[] price, int[] qty) {

        double sum = 0;

        // CO2 – Array traversal to calculate total bill
        for (int i = 0; i < price.length; i++) {
            sum += price[i] * qty[i];
        }

        return sum;
    }
}

/*
CO1 – Sorting Algorithm (Bubble Sort)
Used to sort food items based on price
*/
class SortUtil {

    static void bubbleSort(double[] price, String[] items, int[] qty) {

        // CO1 – Bubble Sort implementation
        for (int i = 0; i < price.length - 1; i++) {

            for (int j = 0; j < price.length - i - 1; j++) {

                if (price[j] > price[j + 1]) {

                    double tempPrice = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = tempPrice;

                    String tempItem = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = tempItem;

                    int tempQty = qty[j];
                    qty[j] = qty[j + 1];
                    qty[j + 1] = tempQty;
                }
            }
        }
    }
}

/*
CO4 – Hash Based Data Structure
Using HashMap for storing menu items and prices
*/
class MenuManager {

    // CO4 – HashMap for fast item-price lookup
    static HashMap<String, Double> menu = new HashMap<>();

    static {

        // ================= VEG ITEMS =================

        menu.put("Paneer Butter Masala", 220.0);
        menu.put("Veg Biryani", 180.0);
        menu.put("Masala Dosa", 120.0);
        menu.put("Idli", 80.0);
        menu.put("Vada", 70.0);
        menu.put("Veg Fried Rice", 150.0);
        menu.put("Veg Noodles", 140.0);
        menu.put("Paneer Tikka", 200.0);
        menu.put("Veg Manchurian", 160.0);
        menu.put("Veg Burger", 120.0);
        menu.put("Veg Pizza", 200.0);
        menu.put("Aloo Paratha", 90.0);
        menu.put("Chole Bhature", 130.0);
        menu.put("Dal Tadka", 140.0);
        menu.put("Jeera Rice", 110.0);
        menu.put("Tomato Soup", 90.0);
        menu.put("Sweet Corn Soup", 100.0);
        menu.put("Paneer Roll", 130.0);
        menu.put("Veg Sandwich", 100.0);
        menu.put("Mushroom Curry", 180.0);
        menu.put("Veg Momos", 110.0);
        menu.put("Veg Spring Roll", 120.0);
        menu.put("Veg Cutlet", 90.0);
        menu.put("Gobi Manchurian", 150.0);
        menu.put("Veg Pulao", 140.0);

        menu.put("Paneer Biryani", 210.0);
        menu.put("Paneer Fried Rice", 190.0);
        menu.put("Paneer Noodles", 180.0);
        menu.put("Paneer Burger", 160.0);
        menu.put("Paneer Pizza", 240.0);
        menu.put("Veg Pasta", 180.0);
        menu.put("Cheese Pasta", 200.0);
        menu.put("Veg Maggi", 80.0);
        menu.put("Paneer Maggi", 120.0);
        menu.put("Vegetable Uttapam", 110.0);
        menu.put("Cheese Dosa", 140.0);
        menu.put("Paneer Dosa", 150.0);
        menu.put("Veg Club Sandwich", 160.0);
        menu.put("Veg Taco", 150.0);
        menu.put("Veg Nachos", 180.0);
        menu.put("Veg Quesadilla", 200.0);
        menu.put("Veg Lasagna", 250.0);
        menu.put("Paneer Momos", 160.0);
        menu.put("Veg Chili", 180.0);
        menu.put("Paneer Kadai", 220.0);

        menu.put("Malai Kofta", 220.0);
        menu.put("Veg Korma", 200.0);
        menu.put("Veg Jaipuri", 210.0);
        menu.put("Paneer Do Pyaza", 220.0);
        menu.put("Veg Thali", 250.0);
        menu.put("Paneer Thali", 280.0);
        menu.put("Veg Chinese Combo", 260.0);
        menu.put("Veg Deluxe Meal", 300.0);
        menu.put("Veg Supreme Pizza", 260.0);
        menu.put("Veg Shawarma", 150.0);

        // ================= NON VEG ITEMS =================

        menu.put("Chicken Biryani", 250.0);
        menu.put("Chicken Curry", 230.0);
        menu.put("Butter Chicken", 260.0);
        menu.put("Chicken Tikka", 240.0);
        menu.put("Chicken Fried Rice", 200.0);
        menu.put("Chicken Noodles", 190.0);
        menu.put("Chicken Burger", 170.0);
        menu.put("Chicken Pizza", 280.0);
        menu.put("Chicken Momos", 150.0);
        menu.put("Chicken Soup", 140.0);

        menu.put("Egg Biryani", 200.0);
        menu.put("Egg Curry", 160.0);
        menu.put("Egg Fried Rice", 150.0);
        menu.put("Egg Noodles", 140.0);
        menu.put("Fish Curry", 260.0);
        menu.put("Fish Fry", 240.0);
        menu.put("Prawn Curry", 320.0);
        menu.put("Prawn Fry", 300.0);
        menu.put("Chicken Lollipop", 220.0);
        menu.put("Chicken Wings", 210.0);

        menu.put("Mutton Curry", 320.0);
        menu.put("Mutton Biryani", 350.0);
        menu.put("Grilled Chicken", 280.0);
        menu.put("Chicken Shawarma", 190.0);
        menu.put("Chicken Roll", 170.0);
        menu.put("Chicken Tandoori", 300.0);
        menu.put("Chicken Malai Tikka", 260.0);
        menu.put("Chicken Seekh Kebab", 240.0);
        menu.put("Chicken Korma", 270.0);
        menu.put("Chicken Kolhapuri", 260.0);

        menu.put("Chicken Handi", 250.0);
        menu.put("Chicken Do Pyaza", 240.0);
        menu.put("Chicken Rogan Josh", 290.0);
        menu.put("Fish Tikka", 260.0);
        menu.put("Fish Biryani", 300.0);
        menu.put("Fish Masala", 280.0);
        menu.put("Prawn Masala", 330.0);
        menu.put("Prawn Biryani", 340.0);
        menu.put("Prawn Tikka", 350.0);
        menu.put("Chicken Pasta", 220.0);

        menu.put("Chicken Lasagna", 280.0);
        menu.put("Chicken Taco", 240.0);
        menu.put("Chicken Quesadilla", 250.0);
        menu.put("Chicken Nachos", 230.0);
        menu.put("Chicken Wrap", 210.0);
        menu.put("Chicken Club Sandwich", 220.0);
        menu.put("Chicken Deluxe Meal", 320.0);
        menu.put("Chicken Combo Meal", 300.0);
        menu.put("Chicken Supreme Pizza", 310.0);
        menu.put("Chicken Cheese Burger", 230.0);
    }

    // CO4 – Category checking logic for veg / non-veg
    static boolean isVeg(String item) {
        if (item.contains("Chicken") ||
                item.contains("Egg") ||
                item.contains("Fish") ||
                item.contains("Prawn") ||
                item.contains("Mutton")) {
            return false;
        }
        return true;
    }

    // CO4 – Display menu based on selected category
    static void displayMenu(int type) {

        System.out.println("\n================ FOOD HUB MENU ================");
        System.out.printf("%-30s %-10s\n", "ITEM", "PRICE");
        System.out.println("-----------------------------------------------");

        for (String item : menu.keySet()) {

            if (type == 1 && isVeg(item)) {
                System.out.printf("%-30s ₹%-10.2f\n", item, menu.get(item));
            } else if (type == 2 && !isVeg(item)) {
                System.out.printf("%-30s ₹%-10.2f\n", item, menu.get(item));
            }
        }

        System.out.println("-----------------------------------------------");
    }

    // CO4 – HashMap lookup operation
    static double getPrice(String item) {
        return menu.getOrDefault(item, 0.0);
    }
}

/*
CO3 – Stack Data Structure
Used for storing recent order history
*/
class OrderStack {

    // CO3 – Stack declaration
    static Stack<String> orders = new Stack<>();

    // CO3 – Stack push operation
    static void pushOrder(String item) {
        orders.push(item);
    }

    // CO3 – Traversing stack to display order history
    static void displayOrders() {

        System.out.println("\nRecent Orders:");

        for (String s : orders) {
            System.out.println(s);
        }
    }
}

/*
CO5 – Practical Application of Linear Data Structures
Restaurant Billing System Application
*/
public class BillingSystem {

    // CO6 – File Handling for persistent invoice storage
    static int loadInvoiceNumber() {

        try {

            File file = new File("invoice_number.txt");

            if (!file.exists())
                return 1000;

            Scanner sc = new Scanner(file);

            int num = sc.nextInt();

            sc.close();

            return num;

        } catch (Exception e) {

            return 1000;
        }
    }

    // CO6 – Writing data to file
    static void saveInvoiceNumber(int num) {

        try {

            FileWriter fw = new FileWriter("invoice_number.txt");

            fw.write(Integer.toString(num));

            fw.close();

        } catch (Exception e) {

            System.out.println("Error saving invoice number.");
        }
    }

    /*
    CO6 – Reading previous bills using File Handling
    */
    static void displayPreviousBills() {

        System.out.println("\n========== PREVIOUS BILLS ==========");

        try {

            File file = new File("restaurant_bill.txt");

            if (!file.exists()) {

                System.out.println("No previous bills found.");
                return;
            }

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (Exception e) {

            System.out.println("Error reading bill file.");
        }

        System.out.println("====================================\n");
    }

    /*
    CO5 – Real world billing application using data structures
    */
    static void createBill(Scanner o) {

        o.nextLine();

        System.out.print("Enter Customer Name: ");
        String customerName = o.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = o.nextLine();

        // CO2 / CO5 – Dynamic storage during ordering
        ArrayList<String> itemNamesList = new ArrayList<>();
        ArrayList<Double> itemPricesList = new ArrayList<>();
        ArrayList<Integer> itemQtyList = new ArrayList<>();

        // CO2 – LinkedList implementation
        LinkedList<String> itemList = new LinkedList<>();

        while (true) {

            System.out.println("\nSelect Food Type:");
            System.out.println("1. Veg");
            System.out.println("2. Non-Veg");
            System.out.println("3. Finish Order");
            System.out.print("Enter your choice: ");
            int foodType = o.nextInt();

            if (foodType == 3) {
                break;
            }

            if (foodType != 1 && foodType != 2) {
                System.out.println("Invalid choice!");
                continue;
            }

            MenuManager.displayMenu(foodType);

            o.nextLine();

            System.out.print("Enter item name: ");
            String item = o.nextLine();

            double price = MenuManager.getPrice(item);

            if (price == 0) {
                System.out.println("Item not found in menu!");
                continue;
            }

            if (foodType == 1 && !MenuManager.isVeg(item)) {
                System.out.println("This item belongs to Non-Veg menu. Please choose correctly.");
                continue;
            }

            if (foodType == 2 && MenuManager.isVeg(item)) {
                System.out.println("This item belongs to Veg menu. Please choose correctly.");
                continue;
            }

            System.out.print("Enter quantity: ");
            int qty = o.nextInt();

            itemNamesList.add(item);
            itemPricesList.add(price);
            itemQtyList.add(qty);

            itemList.add(item);

            // CO3 – Push order into stack
            OrderStack.pushOrder(item);
        }

        int n = itemNamesList.size();

        if (n == 0) {
            System.out.println("No items selected. Bill cannot be generated.");
            return;
        }

        // CO2 – Arrays used to store item data
        String[] itemNames = new String[n];
        double[] itemPrices = new double[n];
        int[] itemQuantities = new int[n];

        for (int i = 0; i < n; i++) {
            itemNames[i] = itemNamesList.get(i);
            itemPrices[i] = itemPricesList.get(i);
            itemQuantities[i] = itemQtyList.get(i);
        }

        // CO1 – Sorting items by price
        SortUtil.bubbleSort(itemPrices, itemNames, itemQuantities);

        BillCalculations billObj = new BillingHelper();
        double subtotal = billObj.calculateTotal(itemPrices, itemQuantities);

        double sgst = subtotal * 0.025;
        double cgst = subtotal * 0.025;
        double grandTotal = subtotal + sgst + cgst;

        // CO6 – Date and time generation
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateTime = now.format(dt);

        int invoice = loadInvoiceNumber() + 1;
        saveInvoiceNumber(invoice);

        System.out.println("\n============== FOOD HUB BILL ==============");
        System.out.println("Invoice No   : " + invoice);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Date & Time  : " + dateTime);

        System.out.printf("%-30s %-10s %-10s %-10s\n", "Item", "Price", "Qty", "Total");

        for (int i = 0; i < n; i++) {
            double total = itemPrices[i] * itemQuantities[i];
            System.out.printf("%-30s %-10.2f %-10d %-10.2f\n",
                    itemNames[i], itemPrices[i], itemQuantities[i], total);
        }

        System.out.println("--------------------------------------------");
        System.out.println("Subtotal   : " + subtotal);
        System.out.println("SGST (2.5%): " + sgst);
        System.out.println("CGST (2.5%): " + cgst);
        System.out.println("Grand Total: " + grandTotal);

        // CO6 – Saving bill details into file
        try {

            FileWriter fw = new FileWriter("restaurant_bill.txt", true);

            fw.write("\n====================================\n");
            fw.write("Invoice No   : " + invoice + "\n");
            fw.write("Customer Name: " + customerName + "\n");
            fw.write("Phone Number : " + phoneNumber + "\n");
            fw.write("Date & Time  : " + dateTime + "\n");
            fw.write("Grand Total  : " + grandTotal + "\n");
            fw.write("====================================\n");

            fw.close();

        } catch (Exception e) {
            System.out.println("Error saving bill.");
        }

        OrderStack.displayOrders();
    }

    public static void main(String[] args) {

        Scanner o = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n=========== FOOD HUB MENU ===========");
            System.out.println("1. Create New Bill");
            System.out.println("2. View Previous Bills");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = o.nextInt();

            switch (choice) {

                case 1:
                    createBill(o);
                    break;

                case 2:
                    displayPreviousBills();
                    break;

                case 3:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        o.close();
    }
}