
interface ParkingCharge {
    double calculateCharge();
    void displayParkingDetails();
}

class VehicleParking {
    int vehicleNumber;
    String vehicleType;
    int parkingHours;

    VehicleParking(int number, String type, int hours) {
        vehicleNumber = number;
        vehicleType = type;
        parkingHours = hours;
    }
}

class TwoWheeler extends VehicleParking implements ParkingCharge {

    TwoWheeler(int number, String type, int hours) {
        super(number, type, hours);
    }

    public double calculateCharge() {
        if (parkingHours <= 2) {
            return parkingHours * 20;
        } else {
            return (2 * 20) + ((parkingHours - 2) * 10);
        }
    }

    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Parking Charge: Rs. " + calculateCharge());
        System.out.println("--------------------------------");
    }
}

class FourWheeler extends VehicleParking implements ParkingCharge {

    FourWheeler(int number, String type, int hours) {
        super(number, type, hours);
    }

    public double calculateCharge() {
        if (parkingHours <= 2) {
            return parkingHours * 50;
        } else {
            return (2 * 50) + ((parkingHours - 2) * 30);
        }
    }

    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Parking Charge: Rs. " + calculateCharge());
        System.out.println("--------------------------------");
    }
}

public class Main12 {
    public static void main(String[] args) {

        // Runtime polymorphism
        ParkingCharge parking;

        parking = new TwoWheeler(101, "Makbul Khan", 4);
        System.out.println("TWO WHEELER PARKING DETAILS");
        parking.displayParkingDetails();

        parking = new FourWheeler(102, "Makbul Ahmed", 5);
        System.out.println("FOUR WHEELER PARKING DETAILS");
        parking.displayParkingDetails();
    }
}
