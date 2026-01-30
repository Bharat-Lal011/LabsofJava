public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor
    public Invoice(String pNum, String pDesc, int qty, double price) {
        partNumber = pNum;
        partDescription = pDesc;
        if (qty > 0) quantity = qty;
        else quantity = 0;

        if (price > 0) pricePerItem = price;
        else pricePerItem = 0.0;
    }

    // Setters and Getters
    public void setPartNumber(String pNum) { partNumber = pNum; }
    public String getPartNumber() { return partNumber; }

    public void setPartDescription(String pDesc) { partDescription = pDesc; }
    public String getPartDescription() { return partDescription; }

    public void setQuantity(int qty) {
        if (qty > 0) quantity = qty;
    }
    public int getQuantity() { return quantity; }

    public void setPricePerItem(double price) {
        if (price > 0) pricePerItem = price;
    }
    public double getPricePerItem() { return pricePerItem; }

    // Method to calculate invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}
 
