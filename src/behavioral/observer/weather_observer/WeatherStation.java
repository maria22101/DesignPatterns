package behavioral.observer.weather_observer;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        Observer currentConditions = new CurrentConditionsDisplay(weatherData);
        Observer forecast = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(30, 80, 28.1f);

        System.out.println("-------------------------------");

        System.out.println("Observers: " + weatherData.getObservers());
    }

}
