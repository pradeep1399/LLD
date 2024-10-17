package singleresponsibilityprinciple;

public class InvoiceDeo {
    private Invoice invoice;

    public InvoiceDeo(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveTODb(){
        //save into DB
    }
}
