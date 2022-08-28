public class Main {
    int[] carContainer = new int[3];
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1));
    }
    public ParkingSystem(int big, int medium, int small) {

    }

    public boolean addCar(int carType) {

    }
}
