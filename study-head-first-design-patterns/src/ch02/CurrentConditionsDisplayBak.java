package ch02;

public class CurrentConditionsDisplayBak implements Observer, DisplayElement{
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplayBak(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.regsterObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions : " + temperature + "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
