package LabSession.July25;

public class TemperatureTest {
    public static void main(String[] args) {
    	
        Temperature t1 = new Temperature();
        t1.setCelsius(25);
        t1.displayTemperatureInfo();

        Temperature t2 = new Temperature();
        t2.setCelsius(-300); 
        t2.displayTemperatureInfo();

        Temperature t3 = new Temperature();
        t3.setCelsius(-273.15); 
        t3.displayTemperatureInfo();
    }
}
