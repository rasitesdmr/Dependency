public class Vehicle {
    IVehicles iVehicles;

    public Vehicle(IVehicles iVehicles) {
        this.iVehicles = iVehicles;
    }
    public void use(){
        iVehicles.giveGas();
        iVehicles.turnRight();
        iVehicles.turnLeft();
        iVehicles.brake();
    }
}
