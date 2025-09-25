/**
 * Data class to hold payment transaction information
 */
public class PaymentTransaction {
    private String date;
    private String channel;
    private String reference;
    private String amount;
    
    public PaymentTransaction(String date, String channel, String reference, String amount) {
        this.date = date;
        this.channel = channel;
        this.reference = reference;
        this.amount = amount;
    }
    
    // Getters
    public String getDate() { return date; }
    public String getChannel() { return channel; }
    public String getReference() { return reference; }
    public String getAmount() { return amount; }
    
    public Object[] toTableRow() {
        return new Object[]{date, channel, reference, amount};
    }
}