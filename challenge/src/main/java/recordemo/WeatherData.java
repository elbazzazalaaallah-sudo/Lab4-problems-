package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

  // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit(double temperatureCelsius) {
       return (temperatureCelsius*9/5+32);
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        return String.format("Current weather : %d C(%d F) and Sunny",temperatureCelsius, temperatureFahrenheit(temperatureCelsius));
    }


    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        double temperatureCelsius = (tempFahrenheit -32)*5/9;
        return new WeatherData(temperatureCelsius, conditions);
    }

    public static void main(String[] args) {
        WeatherData w1 = new WeatherData(25,"Sunny");
        w1.getSummary();
        WeatherData w2 = fromFahrenheit(50,"Cloudy");
        w2.getSummary();
    }
}
