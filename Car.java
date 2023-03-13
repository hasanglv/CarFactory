/**
 * Class helps us to print the infornamion about suv car
 * 
 * @author Hasan Guliyev
 * @version 5.1.0
 * ++
 */
public abstract class Car extends Vehicle
{
    protected int carId;
    
    
        public Car(String vehiclePlate, String vehicleColor, double vehiclePrice, String engineType, double enginePower, int carId) {
        super(vehiclePlate, vehicleColor, vehiclePrice, engineType, enginePower);
        this.carId = carId;
    }

    public Car(String vehiclePlate, String vehicleColor, double enginePower, int carId) {
        super(vehiclePlate, vehicleColor, enginePower);
        this.carId = carId;
    }

    public Car(int carId, String vehicleColor) {
        super(vehicleColor);
        this.carId = carId;
    }

    public Car(int carId) {
        this.carId = carId;
    }

    public Car() {
        super();
    }
    /**
    * CarId setter of carId
    * @param carId
    */
        
    public void setCarId(int carId){
        this.carId=carId;
    }
    /**
    * get the id of Car class
    * @return carId
    */
    
        public int getCarId(){
            return carId;
        
    }
    /**
     * toString method
     * @retun null
     */
    public String toString() {
        return null;
    }
    /**
     * 
     * getVehiclePriceInCurrency method
     * @return vehiclePrice
     */
    public double getVehiclePriceInCurrency() {
        return vehiclePrice;
    }
    
    
    
}
