package openclosedprinciple;

public class FileInvoiceDeo implements InvoiceDeoInterface{

    InvoiceDeoInterface invoiceDeoInterface;

    public FileInvoiceDeo(InvoiceDeoInterface invoiceDeoInterface){
        this.invoiceDeoInterface = invoiceDeoInterface;
    }

    public void save(){
        //save to file
    }
}
