package dependencyinversionrinciple;

//Class should depend on interfaces rather than concrete classes.

public class MacBook {
    private final WiredKeyBoard keyboard;
    private final WiredMose mousee;

    public MacBook(){
        keyboard = new WiredKeyBoard();
        mousee = new WiredMouse();    // -- concrete class
    }

    //fix - take interface object.

    private final KeyBoard keyBoard;
    private final Mouse mouse;

    public MacBook(KeyBoard keyBoard, Mouse mouse ){
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }

}
