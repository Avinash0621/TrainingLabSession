package LabSession.July24;

abstract class Bill {
    abstract void generateBill();
}

class ElectricityBill extends Bill {
    double units;

    ElectricityBill(double units) {
        this.units = units;
    }

    @Override
    void generateBill() {
        double cost = units * 5.50; // Example rate
        System.out.println("Electricity Bill: " + cost);
    }
}

class WaterBill extends Bill {
    double liters;

    WaterBill(double liters) {
        this.liters = liters;
    }

    @Override
    void generateBill() {
        double cost = liters * 2.00; // Example rate
        System.out.println("Water Bill: " + cost);
    }
}

public class BillingTest {
    public static void main(String[] args) {
        Bill eBill = new ElectricityBill(120);
        Bill wBill = new WaterBill(300);

        eBill.generateBill();
        wBill.generateBill();
    }
}
