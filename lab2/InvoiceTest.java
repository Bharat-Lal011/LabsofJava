class InvoiceTest {
    public static void main(String[] args) {
        Invoice inv = new Invoice("A101", "Hard Disk", 2, 3500);

        System.out.println("Part Number: " + inv.getPartNumber());
        System.out.println("Description: " + inv.getPartDescription());
        System.out.println("Quantity: " + inv.getQuantity());
        System.out.println("Price per Item: " + inv.getPricePerItem());
        System.out.println("Total Invoice Amount: " + inv.getInvoiceAmount());
    }
}

