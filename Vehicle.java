/**
 * Class helps us to compare to vehicles and print the right currency
 * 
 * @author Hasan Guliyev
 * @version 5.1.0
 * ++
 */
public abstract class Vehicle implements java.lang.Comparable<Vehicle>{
    protected String vehiclePlate;
    protected String vehicleColor;
    protected double vehiclePrice;
    protected String engineType;
    protected double enginePower;
    
    
    
    public Vehicle(String vehiclePlate, String vehicleColor, double vehiclePrice, String engineType, double enginePower) {
        this.vehiclePlate = vehiclePlate;
        this.vehicleColor = vehicleColor;
        this.vehiclePrice = vehiclePrice;
        this.engineType = engineType;
        this.enginePower = enginePower;
    }

    public Vehicle(String vehicleColor) {
        this.vehicleColor = vehicleColor;
        this.enginePower = 0.0;
        this.engineType = "Electric"; // TODO
        this.vehiclePrice = 0.0;
        this.vehiclePlate = "X"; // TODO
    }

    public Vehicle(String vehiclePlate, String vehicleColor, double enginePower) {
        this.vehiclePlate = vehiclePlate;
        this.vehicleColor = vehicleColor;
        this.enginePower = enginePower;
    }

    public Vehicle() {
        this.vehicleColor = "White"; //TODO
        this.enginePower = 0.0;
        this.engineType = "Electric"; // TODO
        this.vehiclePrice = 0.0;
        this.vehiclePlate = "X"; // TODO
    }

    /**
    * get the vehiclePlate of Vehicle class
    * @return vehiclePlate
    */
    
    public String getVehiclePlate(){
        return vehiclePlate;
    }
    /**
     * VehiclePlate setter method
     * @param vehiclePlate
     * 
     */ 
    public void setVehiclePlate(String vehiclePlate){
        this.vehiclePlate = vehiclePlate;
        
    }
    /**
    * get the vehicleColor of Vehicle class
    * @return vehicleColor
    */
    
    public String getVehicleColor(){
        return vehicleColor;
    }
    /**
     * VehicleColor setter method
     * @param vehicleColor
     * 
     */ 
    
    public void setVehicleColor(String vehicleColor){
        this.vehicleColor = vehicleColor;
    }
    /**
    * get the vehiclePrice of Vehicle class
    * @return vehiclePrice
    */
    public double getVehiclePrice(){
        return vehiclePrice;
    }
    /**
     * VehiclePrice setter method
     * @param vehiclePrice
     * 
     */    
    public void setVehiclePrice(double vehiclePrice){
        this.vehiclePrice = vehiclePrice;
    }
    /**
    * get the enginePower of Vehicle class
    * @return enginePower
    */
    public double getEnginePower(){
        return enginePower;
    }
    /**
     * EnginePower setter method
     * @param enginePower
     * 
     */
    public void setEnginePower(double enginePower){
        this.enginePower = enginePower;
    }
    /**
    * get the engineType of Vehicle class
    * @return engineType
    */
    public String getEngineType(){
        return engineType;
    }
    /**
     * EngineType setter method
     * @param engineType
     * 
     */
    
    public void setEngineType(String engineType){
        this.engineType=engineType;
    }
    /**
     * Find the current Vehicle if it contain right plate
     */
    
    public boolean findPlateMatch(String str) {
        return this.vehiclePlate.contains(str);
    }
    /**
     * this method compare to vehicles
     */
    public int compareTo(Vehicle o) {

        if (this.getEnginePower() > o.getEnginePower()) {
            return 1;
        } else if (this.getEnginePower() < o.getEnginePower()) {
            return -1;
        }

        return 0;
    }
    /**
     * getVehiclePriceInCurrency abstract  method
     */
    
    public abstract double getVehiclePriceInCurrency();
        
    /**
     * toString abstract  method
     */
    public abstract String toString();


}
