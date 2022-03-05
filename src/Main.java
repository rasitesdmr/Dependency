public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(new Bus());
        vehicle.use();
        Vehicle vehicle1 = new Vehicle(new Motorcycle());
        vehicle1.use();
        Vehicle vehicle2 = new Vehicle(new Car());
        vehicle2.use();
    }
}
