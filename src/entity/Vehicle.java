package entity;

public class Vehicle {
    private int vehicle_id;
    private String make;
    private String model;
    private int year;
    private String status;
    private double dailyRate;
    private int passengerCapacity;
    private double engineCapacity;
    //default constructor
    public Vehicle() {}
    //parametrized constructor
    public Vehicle(int vehicle_id,String make,String model,int year,String status, double dailyRate,int passengerCapacity,
                   double engineCapacity){
        this.vehicle_id=vehicle_id;
        this.make=make;
        this.model=model;
        this.year=year;
        this.status=status;
        this.dailyRate=dailyRate;
        this.passengerCapacity=passengerCapacity;
        this.engineCapacity=engineCapacity;

    }
// getters and setters
    public int getVehicle_id(){
        return vehicle_id;
    }
  public void setVehicle_id(int vehicle_id){
        this.vehicle_id=vehicle_id;
  }
  public String getMake(){
        return make;
  }
  public void setMake(String make){
        this.make=make;
  }
  public String getModel(){
        return model;
  }
  public void setModel(String model){
        this.model=model;
  }
  public int getYear(){
        return year;
  }
  public void setYear(int year){
        this.year=year;
  }
  public double getDailyRate(){
        return dailyRate;
  }
  public void setDailyRate(double dailyRate) {
      this.dailyRate = dailyRate;
  }
  public String getStatus(){
        return status;
  }
  public void setStatus(String status){
        this.status=status;
  }
  public int getPassengerCapacity(){
        return passengerCapacity;
  }
  public void setPassengerCapacity(int passengerCapacity){
        this.passengerCapacity=passengerCapacity;
  }
  public double getEngineCapacity(){
        return engineCapacity;
  }
  public void setEngineCapacity(double engineCapacity){
        this.engineCapacity=engineCapacity;
  }
    @Override
    public String toString() {
        return "Vehicle ID: " + vehicle_id +
                ", Make: " + make +
                ", Model: " + model +
                ", Year: " + year +
                ", Status: " + status +
                ", Daily Rate: " + dailyRate +
                ", Passenger Capacity: " + passengerCapacity +
                ", Engine Capacity: " + engineCapacity;
    }
}
