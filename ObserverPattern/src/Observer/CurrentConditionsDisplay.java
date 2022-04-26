package Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	/**
	 * We need the reference to the Subject even though we don't use it after registering the Observer:
	 * Because we may want to un-register ourselves as an observer and it would be handy to already have
	 * a reference to the Subject.
	 */
	private Subject weatherdata;
	
	public CurrentConditionsDisplay(Subject weatherdata) {
		/**
		 * The constructor is passed the weatherData object (the Subject)
		 * and we use it to register the display as an observer 
		 */
		this.weatherdata = weatherdata;
		weatherdata.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditons: " + temperature +"F degrees and " + humidity + "% humidity.");
	}

}
