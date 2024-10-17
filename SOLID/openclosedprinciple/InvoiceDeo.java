package openclosedprinciple;

import singleresponsibilityprinciple.Invoice;

public class InvoiceDeo {
    private Invoice invoice;

    public InvoiceDeo(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){         // Live and Tested
        //save into DB
    }

    public void saveToFile(){       //save to db live and test to implement the new method can cause the issue
        //save into file
    }
}
