package openclosedprinciple;

public class DatabaseInvoiceDeo implements InvoiceDeoInterface{
    InvoiceDeoInterface invoiceDeoInterface;

    public DatabaseInvoiceDeo(InvoiceDeoInterface invoiceDeoInterface){
        this.invoiceDeoInterface = invoiceDeoInterface;
    }

    @Override
    public void save() {
        //save to DB
    }
}
