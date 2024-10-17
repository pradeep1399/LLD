package liskowsubtitutionprinciple;

public class MoterCycle implements Vehicle {
    int numberOfWheels;

    @Override
    public Boolean hasEngine() {
        return true;
    }

    @Override
    public void getNumberOfWheels() {
        numberOfWheels = 2;
    }
}
