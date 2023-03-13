/**
 * Class helps us to print the right currency and information about truck
 * 
 * @author Hasan Guliyev
 * @version 5.1.0
 * ++
 */
public class Truck extends Vehicle
{
    
    private int truckId;

    /**
     * Constructor for objects of class Truck
     */
    public Truck()
    {
        this.truckId=0;

    }
    /**
    * TruckId setter of TruckId
    * @param truckId
    */
    
    public void setTruckId(int truckId){
        this.truckId = truckId;
    }
        public Truck(String vehiclePlate, String vehicleColor, double vehiclePrice, String engineType, double enginePower, int truckId) {
        super(vehiclePlate, vehicleColor, vehiclePrice, engineType, enginePower);
        this.truckId = truckId;
    }

    public Truck(String vehiclePlate, String vehicleColor, double enginePower, int truckId) {
        super(vehiclePlate, vehicleColor, enginePower);
        this.truckId = truckId;
    }

    public Truck(String vehicleColor, int truckId) {
        super(vehicleColor);
        this.truckId = truckId;
    }
    /**
    * get the id of Truck class
    * @return truckId
    */
    public int getTruckId(){
            return truckId;
        
    }
    
    public double getVehiclePriceInCurrency(){
        
        return 0;
        
    }
    /**
     * This method print the output the information about Truck Vehicle
     * 
     */
    
    public String toString(){
        return new String(
                "Truck ID: " + this.getTruckId() + "\n" +
                        "Truck Vehicle Plate: " + this.getVehiclePlate() + "\n" +
                        "Truck Vehicle Color: " + this.getVehicleColor() + "\n" +
                        "Truck Vehicle Price: " + this.getVehiclePriceInCurrency() + "USD \n" +
                        "Truck Engine Type: " + this.getEngineType() + "\n" +
                        "Truck Engine Power: " + this.getEnginePower() + "\n" +
                        "*************" + "\n");
    }

    }
