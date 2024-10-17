package interfacesegmentedprinciple;

public class Waiters implements WaiterInterface{

    @Override
    public void serverCustomers() {
        System.out.println("Server the Food to customers");
    }

    @Override
    public void takeOrder() {
        System.out.println("Take the order");
    }
}
