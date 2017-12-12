package Vehicle;

public abstract class Vehicle {

    protected String type;
    protected int conditionValue;

    public Vehicle(String type, int conditionValue ){
        this.type =type;
        this.conditionValue = conditionValue;
    }


}
