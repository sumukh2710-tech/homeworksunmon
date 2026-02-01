class Temperature {
    private double celsius;

    // Setter with validation
    public void setCelsius(double value) {
        if (value >= -273.15) {
            celsius = value;
        } else {
            System.out.println("Invalid temperature! Cannot be below absolute zero.");
        }
    }

    // Getter
    public double getCelsius() {
        return celsius;
    }
}

public class code19 {
    public static void main(String[] args) {
        Temperature temp = new Temperature();

        temp.setCelsius(25);
        System.out.println("Temperature: " + temp.getCelsius() + " °C");

        temp.setCelsius(-300); // invalid
        System.out.println("Temperature: " + temp.getCelsius() + " °C");
    }
}

