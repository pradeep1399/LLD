package liskowsubtitutionprinciple;

public class BiCycle implements  Vehicle{

    int numberOfWheels;

    public Boolean hasEngine() {          // it is narrow down the parent capability
      return null;
    }

    @Override
    public void getNumberOfWheels() {
        numberOfWheels = 4;
    }
}
