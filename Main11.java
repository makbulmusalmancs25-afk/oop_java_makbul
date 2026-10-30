
abstract class EnergySource {
    int sourceID;
    String sourceName;
    double energyGenerated;

    // Constructor
    EnergySource(int id, String name, double energy) {
        sourceID = id;
        sourceName = name;
        energyGenerated = energy;
    }

    // Abstract method
    abstract double calculateEfficiency();

    // Display source details
    void displayDetails() {
        System.out.println("Source ID: " + sourceID);
        System.out.println("Source Name: " + sourceName);
        System.out.println("Energy Generated: " +
                           energyGenerated + " kWh");
        System.out.println("Efficiency: " +
                           calculateEfficiency() + "%");
        System.out.println("--------------------------------");
    }
}

class SolarEnergy extends EnergySource {

    SolarEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    // Implement abstract method
    double calculateEfficiency() {
        return (energyGenerated / 5000) * 100;
    }
}

class WindEnergy extends EnergySource {

    WindEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    // Implement abstract method
    double calculateEfficiency() {
        return (energyGenerated / 8000) * 100;
    }
}

public class Main11 {
    public static void main(String[] args) {

        // Dynamic method dispatch
        EnergySource source;

        source = new SolarEnergy(101, "Makbul Khan", 4000);
        System.out.println("SOLAR ENERGY DETAILS");
        source.displayDetails();

        source = new WindEnergy(102, "Makbul Musalman", 6000);
        System.out.println("WIND ENERGY DETAILS");
        source.displayDetails();
    }
}
