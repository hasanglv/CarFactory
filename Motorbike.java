/**
 * Class helps us to find right currency and print details
 * 
 * @author Hasan Guliyev
 * @version 5.1.0
 * ++
 */
public class Motorbike extends Vehicle
{
    
    private int motorbikeId;
    /**
     * Motorbike constructor set the parametr to his value
     * @param motorBikeId
     */

    public Motorbike(int motorBikeId) {
        this.motorbikeId = motorBikeId;
    }
    /**
    * Default constructor
    */
    public Motorbike(){
        super();
    }
        public Motorbike(String vehiclePlate, String vehicleColor, double vehiclePrice, String engineType, double enginePower, int motorBikeId) {
        super(vehiclePlate, vehicleColor, vehiclePrice, engineType, enginePower);
        this.motorbikeId = motorBikeId;
    }

    public Motorbike(String vehiclePlate, String vehicleColor, double enginePower, int motorBikeId) {
        super(vehiclePlate, vehicleColor, enginePower);
        this.motorbikeId = motorBikeId;
    }

    public Motorbike(String vehicleColor, int motorBikeId) {
        super(vehicleColor);
        this.motorbikeId = motorBikeId;
    }
    /**
    * Motorbike setter of Id
    * @param motorbikeId
    */
    
    public void setMotorbikeId(int motorbikeId){
        this.motorbikeId = motorbikeId;
    }
    /**
    * get the id of Motorbike class
    * @return motorbikeId
    */
    public int getMotorbikeId(){
            return motorbikeId;
        
    }
    /**
     * VehiclePriceInCurrency method convert to right currency
     * @return vehiclePrice /18
     */
    
    public double getVehiclePriceInCurrency(){
        
        return vehiclePrice / 18;
    }
    /**
     * This method give information about Motorbike to output
     * @return String
     */
    
    public String toString(){
        return new String(
                "Motorbike ID: " + this.getMotorbikeId() + "\n" +
                        "Motorbike Vehicle Plate: " + this.getVehiclePlate() + "\n" +
                        "Motorbike Vehicle Color: " + this.getVehicleColor() + "\n" +
                        "Motorbike Vehicle Price: " + this.getVehiclePriceInCurrency() + "USD \n" +
                        "Motorbike Engine Type: " + this.getEngineType() + "\n" +
                        "Motorbike Engine Power: " + this.getEnginePower() + "\n" +
                        "*************" + "\n");
    }


}
