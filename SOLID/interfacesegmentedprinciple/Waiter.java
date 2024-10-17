package interfacesegmentedprinciple;

public class Waiter implements RestaurantEmployee{
    @Override
    public void washDishes() {
        // not my job
    }

    @Override
    public void serveCustomers() {
        System.out.println("Server the Food");
    }

    @Override
    public void cookFood() {
        //not my job
    }
}
