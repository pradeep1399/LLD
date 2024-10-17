package interfacesegmentedprinciple;

public class Chef implements ChefInterface{
    @Override
    public void cookFood() {
        System.out.println("Cook the Food");
    }

    @Override
    public void decideMenu() {
        System.out.println("Decide the Menu");
    }

}
