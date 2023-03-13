import java.util.*; 
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class helps us to print the infornamion about company form text file
 * 
 * @author Hasan Guliyev
 * @version 5.1.0
 * ++
 */


public class Company
{

    private String name;
    private String hqAddress;
    private ArrayList<Factory> factories ; 
    /**
     * Company constructor  set the name,
     * hqAddress to their default values and declare Factory ArrayList to his value
     */
    
    public Company()
    {
        this.name="CENGG";
        this.hqAddress="Bilisim Vadisi,Gebze";
        ArrayList<Factory> factories = new ArrayList<Factory>();
    }
   /**
    * get the name of company
    * @return name
    */
    
    public String getName(){
        return this.name;
    }
    /**
    * get the HqAddress of company
    * @return hqAddress
    */
    
    public String getHqAddress(){
        return this.hqAddress;
    }
    /**
    * set the Name of company
    * @param name
    */
    public void setName(String name){
        this.name=name;
    }
    /**
    * get the Factories of company
    * @return factories
    */
    public ArrayList<Factory> getFactories(){
        return this.factories;
    }
    /**
    * set the Factories of company
    * @param factories
    */
    public void setFactories(ArrayList<Factory> factories){
        this.factories=factories;
    }
    /**
    * set the hqAddress of company
    * @param hqAddress
    */
    public void setHqAddress(String hqAddress){
         this.hqAddress=hqAddress;
    }
    
    /**
     * AddFactory method add factory to factories
     * 
     */
    public void addFactory(Factory factory){
        int len = getFactories().size();
        for(int i = 0; i < len; i++){
            if(factory.getFactoryId() == factories.get(i).getFactoryId()){
                System.out.println("This factory Id exist");
                return;
            }
        }
        this.factories.add(factory);
    }
    /**
     * RemoveFactory method remove factory from factories
     * 
     */
    
    public void removeFactory(int factoryId){
        int len= factories.size();
        int index = -1;
        for(int i = 0; i < len; i++){
            if(factoryId == factories.get(i).getFactoryId()){
                index = i;
                factories.remove(index);
                break;
            }
        }
    }
    /**
     * PrintCompanyDetails method show the content of company from factories
     * 
     * 
     */
    
    public void printCompanyDetails(){
        System.out.println("Company Name: " + this.getName());
        System.out.println("Company HQ Address: " + this.getHqAddress());
        System.out.println("Factories owned by the company, and the cars they have produced: ");
        for (int i = 0; i < factories.size(); i++) {

            Factory factory = factories.get(i);//sualim var
            System.out.println(factory.toString());
            System.out.println("Vehicles of Factory " + i + ": ");

            for (int j = 0; j < factory.getProducedVehicles().size(); j++) {

                int idxSUV = 0;
                int idxSedan = 0;
                int idxMoto = 0;
                int idxTruck = 0;

                Vehicle vehicle = factories.get(i).getProducedVehicles().get(j);

                if(vehicle instanceof Sedan){
                    System.out.println("Sedan " + idxSedan + ": ");
                    idxSedan++;
                } else if(vehicle instanceof SUV){
                    System.out.println("SUV " + idxSedan + ": ");
                    idxSUV++;
                } else if(vehicle instanceof Motorbike){
                    System.out.println("Motorbike " + idxSedan + ": ");
                    idxMoto++;
                } else if(vehicle instanceof Truck){
                    System.out.println("Truck " + idxSedan + ": ");
                    idxTruck++;
                }

                System.out.println(vehicle.toString());
            }
        }
    }
    /**
     * We add factories information from file
     * 
     * 
     */
       public void addFactoriesFromFile(String filePath) throws IOException {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            int numOfFactories = 0;

            if(scanner.hasNextLine()) {
                numOfFactories = Integer.parseInt(scanner.nextLine());
            }

            while (numOfFactories > 0 ){

                int factoryId = 0;
                String factoryName = "";
                String factoryAddress = "";
                double campusCoverage = 0.0;

                if(scanner.hasNextLine()) {
                    factoryId = Integer.parseInt(scanner.nextLine());
                }

                if(scanner.hasNextLine()) {
                    factoryName = scanner.nextLine();
                }

                if(scanner.hasNextLine()) {
                    factoryAddress = scanner.nextLine();
                }

                if(scanner.hasNextLine()) {
                    campusCoverage = Double.parseDouble(scanner.nextLine());
                }

                Factory factory = new Factory(factoryId, factoryName, factoryAddress, campusCoverage);
                factories.add(factory);

                numOfFactories--;
            }
            scanner.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    /**
     * This method find the right vehicle and print it
     * 
     */
        public void findAndPrintVehicles(String keyword){
        boolean flag = false;
        System.out.println("Search Results: ");
        System.out.println("----------------");

        for(Factory factory : factories){
            ArrayList<Vehicle> currentVehicles = factory.getProducedVehicles();

            for(Vehicle vehicle : currentVehicles){
                if(vehicle.findPlateMatch(keyword)){
                    flag = true;
                    System.out.println(vehicle.toString());
                }
            }
        }

        if(!flag)  {
            System.out.println("No vehicles found.");
        }

    }


    
}