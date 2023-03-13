/**
 * Class helps us to print the infornamion about sedan car
 * 
 * @author Hasan Guliyev
 * @version 5.1.0
 * ++
 */


public   class Sedan extends Car
{
    
/**
 * Sedan class Default constructor
 * 
 */

   public Sedan(){
    }
    
    /**
     * Sedan constructor  set the carid attribute to the parametr value,
     * and call Car class constructor
     * 
     * @param carId
     * 
     */
   public Sedan(int carId){
        super();
        this.carId=carId;
    }
        public Sedan(String vehiclePlate, String vehicleColor, double enginePower, int carId) {
        super(vehiclePlate, vehicleColor, enginePower, carId);
    }
    /**
     * This method print the output the sedan class information
     */


    public String toString(){
        return new String(
                "Sedan Car ID: " + this.getCarId() + "\n" +
                        "Sedan Vehicle Plate: " + this.getVehiclePlate() + "\n" +
                        "Sedan Vehicle Color: " + this.getVehicleColor() + "\n" +
                        "Sedan Vehicle Price: " + this.getVehiclePriceInCurrency() + "TL \n" +
                        "Sedan Engine Type: " + this.getEngineType() + "\n" +
                        "Sedan Engine Power: " + this.getEnginePower() + "\n" +
                        "*************" + "\n");
    }
}