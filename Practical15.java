/**Write a program for billing system for a shopping mall. Create a class BillGenerator that 
uses method overloading to generate bills based on customer type: 
generateBill(int itemTotal): For regular customers, apply no discount. 
generateBill(int itemTotal, int discount): For privileged customers, apply flat discount in 
rupees. 
generateBill(int itemTotal, double discountPercent): For festive offers, apply percentage 
discount. 
Write a program to display the final bill amount using appropriate overloaded method based 
on customer category.*/

class BillGenerator
{
    void generateBill(int itemTotal)
    {
        System.out.println("Final Bill Amount: " + itemTotal);
    }

    void generateBill(int itemTotal, int discount)
    {
        int finalAmount = itemTotal - discount;
        System.out.println("Final Bill Amount: " + finalAmount);
    }

    void generateBill(int itemTotal, double discountPercent)
    {
        double discountAmount = (itemTotal * discountPercent) / 100;
        double finalAmount = itemTotal - discountAmount;
        System.out.println("Final Bill Amount: " + finalAmount);
    }

    public static void main(String[] args)
    {
        BillGenerator bill = new BillGenerator();

        System.out.println("Regular Customer:");
        bill.generateBill(2000);

        System.out.println();

        System.out.println("Privileged Customer:");
        bill.generateBill(2000, 300);

        System.out.println();

        System.out.println("Festive Offer:");
        bill.generateBill(2000, 10.0);
    }
}
