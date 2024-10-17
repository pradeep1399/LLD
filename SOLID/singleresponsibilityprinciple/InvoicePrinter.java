package singleresponsibilityprinciple;

public class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }

    public void printInvoice(){
        //print the Invoice
    }
}
