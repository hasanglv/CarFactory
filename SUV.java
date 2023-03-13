/**
 * Class helps us to print the infornamion about suv car
 * 
 * @author Hasan Guliyev
 * @version 5.1.0
 * ++
 */

public class SUV extends Car
{

    private String autoPilotLevel;
    private int autoPilotSensorCount;

    /**
     * SUV constructor  set the autopilotlevel,
     * autopilotsensorcount to their default values   
     */
    public SUV(){
        this.autoPilotLevel="";
        this.autoPilotSensorCount=0;
    }
    /**
     * SUV constructor  set the autopilotlevel,
     * autopilotsensorcount to their default values and set the carid attribute to the parametr value,
     * and call Car class constructor
     * 
     * @param carId
     * 
     */
    public SUV(int carId){
        super();
        this.carId=carId;
        this.autoPilotLevel="";
        this.autoPilotSensorCount=0;
    }
     public SUV(int carId, String vehicleColor){

        super(carId, vehicleColor);
    }

    public SUV(String vehiclePlate, String vehicleColor, double vehiclePrice, String engineType, double enginePower, 
               int carId, String autoPilotLevel, int autoPilotSensorCount) {
        super(vehiclePlate, vehicleColor, vehiclePrice, engineType, enginePower, carId);
        this.autoPilotLevel = autoPilotLevel;
        this.autoPilotSensorCount = autoPilotSensorCount;
        
    }

    public SUV(String vehiclePlate, String vehicleColor, double enginePower, int carId) {
        super(vehiclePlate, vehicleColor, enginePower, carId);
        
    }


   /**
    * get the auto Pilot Level of Suv.
    * @return autoPilotLevel
    */
    public String getAutoPilotLevel(){
        return autoPilotLevel;
    }
    /**
     * AutoPilotLevel setter method
     * @param autoPilotLevel the autoPilotLevel of Suv
     */
    public void setAutoPilotLevel(String autoPilotLevel){
        this.autoPilotLevel = autoPilotLevel;
    }
   /**
    * get the autoPilotSensorCount of Suv.
    * @return autoPilotSensorCount
    */
    public int getAutoPilotSensorCount(){
        return autoPilotSensorCount;
    }
    /**
     * AutoPilotSensorCount setter method
     * @param autoPilotSensorCount the autoPilotSensorCount of Suv
     */
    public void setAutoPilotSensorCount(int autoPilotSensorCount){
        this.autoPilotSensorCount = autoPilotSensorCount;
    }
    /**
     * Method  give output information about id,color,enginetype,enginepower,autopilotlevel,
     * autopilotsensorcount
     * 
     */
    public String toString(){
        return new String(
                "SUV Car ID: " + this.getCarId() + "\n" +
                        "SUV Vehicle Plate: " + this.getVehiclePlate() + "\n" +
                        "SUV Vehicle Color: " + this.getVehicleColor() + "\n" +
                        "SUV Vehicle Price: " + this.getVehiclePriceInCurrency() + "TL \n" +
                        "SUV Engine Type: " + this.getEngineType() + "\n" +
                        "SUV Engine Power: " + this.getEnginePower() + "\n" +
                        "SUV Autonomy Level: " + this.getAutoPilotLevel() + "\n" +
                        "SUV Autonomy Sensor Count: " + this.getAutoPilotSensorCount() + "\n" +
                        "*************" + "\n");
    }

  }


