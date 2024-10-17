package singleresponsibilityprinciple;

public class Invoice {
    private Marker marker;
    private int quantity;

    public int calculationTotal(){                       //First reason to change eg. GST
        return ((marker.price)* this.quantity);
    }

//    public void printInvoice(){                         //Second reason to change
//        //print the Invoice
//    }
//
//    public void saveToDB(){                             //Third reason to change
//        //save the Data into DB
//    }

}
