import java.util.ArrayList;

/**
 * Class produce Sedan and SUV and have the removing methods which help to remove car with entered id,
 * and at the end has the toString method which show us details of factory
 * 
 * @author Hasan Guliyev
 * @version 5.1.0
 * ++
 */

public class Factory
{
    private int factoryId;
    private String factoryName;
    private String fullAddress;
    private double campusCoverage;
    private ArrayList<Vehicle> producedVehicles;
    
    
    /**
     * Factory constructor  set the id,name,addressand coverage to their default values and 
     * create ArrayList instance for producedVehicless field
     * 
     */

    public Factory(){
        this.factoryId=0;
        this.factoryName="";
        this.fullAddress="";
        this.campusCoverage=0.0;
        this.producedVehicles= new ArrayList<>();
        
    }
     /**
     * Factory constructor  set the name,address and coverage to their default values,
     * set factoryId atribute to his parametr value and  
     * create ArrayList instance for producedVehicles field
     * 
     */
    public Factory(int factoryId){
        this.factoryId=factoryId;
        this.factoryName="";
        this.fullAddress="";
        this.campusCoverage=0.0;
        this.producedVehicles= new ArrayList<>();
    }
    /**
     * Factory constructor  set the id,name,adress coverage to their parametr value,
     * and  create ArrayList instance for producedVehicles field
     * 
     */
    
    public Factory(int factoryId, String factoryName, String fullAddress, double campusCoverage) {
        this.factoryId = factoryId;
        this.factoryName = factoryName;
        this.fullAddress = fullAddress;
        this.campusCoverage = campusCoverage;
        this.producedVehicles = new ArrayList<Vehicle>();
    }
   /**
    * get the id of factory.
    * @return factoryId
    */
    public int getFactoryId(){
        return factoryId;
    }
     /**
     * FactoryId setter method
     * @param factoryId the id of factory
     */
    public void setFactoryId(int factoryId){
        this.factoryId = factoryId;
    }
   /**
    * get the name of factory.
    * @return factoryName
    */
    public String getFactoryName(){
        return factoryName;
    }
    /**
     * FactoryName setter method
     * @param factoryName the name of factory
     */
    public void setFactoryName(String factoryName){
        this.factoryName = factoryName;
    }
   /**
    * get the fulladdress of factory.
    * @return fullAddress
    */
    public String getFullAddress(){
        return fullAddress;
    }
    /**
     * FullAddress setter method
     * @param fullAddress the fullAddress of factory
     */
    public void setFullAddress(String fullAddress){
        this.fullAddress = fullAddress;
    }
   /**
    * get the campusCoverage of factory.
    * @return campusCoverage
    */
    public double getCampusCoverage(){
        return campusCoverage;
    }
    /**
     * CampusCoverage setter method
     * @param campusCoverage the campusCoverage of factory
     */
    public void setCampusCoverage(double campusCoverage){
        this.campusCoverage = campusCoverage;
    }
    
   /**
    * get the ProducedVehicles of factory.
    * @return producedVehicles
    */
    public ArrayList<Vehicle> getProducedVehicles(){
        return this.producedVehicles;
    }
    /**
     * ProducedVehicles setter method
     * @param producedVehicles 
     */
    public  void setProducedVehicles(ArrayList<Vehicle> producedVehicles){
        this.producedVehicles = producedVehicles;
    }
    
    
    /**
     * This method produce vehicle 
     */
    public void produceVehicle(String vehicleType, String vehiclePlate, String vehicleColor, double enginePower, int vehicleId){
   
    for(int i = 0; i < producedVehicles.size(); i++){
        if(producedVehicles.get(i).getVehiclePlate() == vehiclePlate){
            return;
        }
    }
    
    Vehicle vehicle = new Sedan(); // temporarily initialization
    
    switch (vehicleType){
        case "Sedan":
            vehicle = new Sedan(vehiclePlate, vehicleColor, enginePower, vehicleId);
            break;
        case "SUV":
            vehicle = new SUV(vehiclePlate, vehicleColor, enginePower, vehicleId);
            break;
        case "Motorbike":
            vehicle = new Motorbike(vehiclePlate, vehicleColor, enginePower, vehicleId);
            break;
        case "Truck":
            vehicle = new Truck(vehiclePlate, vehicleColor, enginePower, vehicleId);
            break;
    }
    
    producedVehicles.add(vehicle);
}



    /**
     * This method destroy vehicle with input index
     * @param plateNumber
     */
  
    public void destroyVehicle(String plateNumber){
        int len = producedVehicles.size();
        int index = -1;

        for (int i = 0; i < len; i++) {
            if (plateNumber == producedVehicles.get(i).getVehiclePlate()){
                index = i;
                break;
            }
        }

        this.producedVehicles.remove(index);
    }
    
    
    /**
     * Method  give output information about id,name,fulladdress,campuscoverage
     * 
     * @return String
     */

    public String toString(){
        return new String(
                        "Factory ID: " + this.getFactoryId() + "\n" +
                        "Factory Name: " + this.getFactoryName() + "\n" +
                        "Factory Full Address: " + this.getFullAddress() +"\n" +
                        "Factory Campus Coverage: " + this.getCampusCoverage() + "\n" +
                        "*************" + "\n");
    }

}

