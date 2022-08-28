public class ParkingSystem {
    int[] carContainer = new int[3];

    public ParkingSystem(int big, int medium, int small) {
        carContainer[0] = big;
        carContainer[1] = medium;
        carContainer[2] = small;
    }

    public void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1));
    }


    public boolean addCar(int carType) {
        if (carContainer[carType - 1] > 0) {
            carContainer[carType - 1]--;
            return true;
        }
        return false;
    }
}
