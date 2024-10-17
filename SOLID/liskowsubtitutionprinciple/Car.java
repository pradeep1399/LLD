package liskowsubtitutionprinciple;

public class Car implements Vehicle{
    int numberOfWheels;

    @Override
    public Boolean hasEngine() {
        return true;
    }

    @Override
    public void getNumberOfWheels() {
        numberOfWheels = 4;
    }
}
