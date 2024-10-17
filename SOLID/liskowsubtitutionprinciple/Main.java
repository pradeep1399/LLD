package liskowsubtitutionprinciple;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MoterCycle());
        vehicleList.add(new Car());
        vehicleList.add(new BiCycle());

        for(Vehicle vehicle: vehicleList){
            System.out.println(vehicle.hasEngine().toString());    //will throw null pointer exception.
        }
    }
}
