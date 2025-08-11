package LabSession.July25;

class Temperature {
    private double celsius;

    // Setter with validation (absolute zero check)
    public void setCelsius(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
        } else {
            System.out.println("Invalid temperature!");
        }
    }

    // Convert to Fahrenheit
    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    // Convert to Kelvin
    public double toKelvin() {
        return celsius + 273.15;
    }

    public void displayTemperatureInfo() {
        System.out.println("Temperature in Celsius : " + celsius);
        System.out.println("Temperature in Fahrenheit : " + toFahrenheit());
        System.out.println("Temperature in Kelvin : " + toKelvin());
        System.out.println();
    }
}
