public class InvoiceTest {
public static void main(String[] args) {
    Invoice invoice01 = new Invoice("1", "Caneta", 10, 2.5);
    Invoice invoice02 = new Invoice("2", "Lápis", 5, -1.0);

    System.out.println("Invoice 1 Amount: " + invoice01.getInvoiceAmount());
    System.out.println("Invoice 2 Amount: " + invoice02.getInvoiceAmount());
}
}
