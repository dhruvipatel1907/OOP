import java.util.Scanner;

interface Order
{
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

abstract class PartialOrder implements Order
{
    String itemName;
    int quantity;
    int orderId = 101;

    public void placeOrder(String item, int qty)
    {
        itemName = item;
        quantity = qty;
        System.out.println("Order placed successfully");
    }
}

class FinalOrder extends PartialOrder
{
    public void cancelOrder(int orderId)
    {
        if (this.orderId == orderId)
            System.out.println("Order cancelled");
        else
            System.out.println("Invalid Order ID");
    }

    public void generateBill()
    {
        int price = 100; // fixed price per item
        int total = price * quantity;

        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: " + total);
    }
}

class MainClass
{
    public static void main(String[] args)
    {
        System.out.println("Name: Dhruvi Patel");
        System.out.println("Enrollment No: 240390107027");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        FinalOrder fo = new FinalOrder();

        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        fo.placeOrder(item, qty);

        System.out.println("\n1. Generate Bill");
        System.out.println("2. Cancel Order");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        if (ch == 1)
        {
            fo.generateBill();
        }
        else if (ch == 2)
        {
            System.out.print("Enter Order ID: ");
            int id = sc.nextInt();
            fo.cancelOrder(id);
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}