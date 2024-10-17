package liskowsubtitutionprinciple;

//If Class B is subtype of class A, then we should be able to replace object of A with B without breaking the behaviour of the program.
//Subclass should extend the capability of parent class not narrow it down.

public interface Vehicle {
    void getNumberOfWheels();
    Boolean hasEngine();
}
