package ua.lviv.iot.first_laba;

public class MotorRace {

	public static int distanceInKilometers = 500;

	protected String day;

	protected String month;

	private String country;

	private int durationInDays;

	private int priceInEuro;

	private int averageSpeed;

	private int amountOfCars;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getDurationInDays() {
		return durationInDays;
	}

	public void setDurationInDays(int durationInDays) {
		this.durationInDays = durationInDays;
	}

	public int getPriceInEuro() {
		return priceInEuro;
	}

	public void setPrice(int priceInEuro) {
		this.priceInEuro = priceInEuro;
	}

	public int getAverageSpeed() {
		return averageSpeed;
	}

	public void setAgerageSpeed(int averageSpeed) {
		this.averageSpeed = averageSpeed;
	}

	public int getAmountOfCars() {
		return amountOfCars;
	}

	public void setAmountOfCars(int amountOfCars) {
		this.amountOfCars = amountOfCars;
	}

	public MotorRace(String country, int durationInDays, int priceInEuro, int averageSpeed, int amountOfCars,
			String day, String month) {
		this.country = country;
		this.durationInDays = durationInDays;
		this.priceInEuro = priceInEuro;
		this.averageSpeed = averageSpeed;
		this.amountOfCars = amountOfCars;
		this.day = day;
		this.month = month;
	}

	public MotorRace(String country, int durationInDays, int priceInEuro, int averageSpeed) {
		this(country, durationInDays, priceInEuro, averageSpeed, 0, null, null);
	}

	public MotorRace() {
		this("Ukraine", 5, 100, 60, 10, "Monday", "May");
	}

	public String toString() {
		return "MotorRace [country = " + country + ", durationInDays = " + durationInDays + ", priceInEuro = "
				+ priceInEuro + ", averageSpeed = " + averageSpeed + ", amountOfCars = " + amountOfCars + ", day = "
				+ day + ", month = " + month + "]";
	}

	public void printDistanceInKilometers() {
		System.out.println("Distance of Motor Race = " + distanceInKilometers);
	}

	public static void printStaticDistanceInKilometers() {
		System.out.println("Distance of Motor Race (static) = " + distanceInKilometers);
	}

	public void resetValues(String country, int durationInDays, int priceInEuro, int averageSpeed, int amountOfCars,
			String day, String month) {
		this.country = country;
		this.durationInDays = durationInDays;
		this.priceInEuro = priceInEuro;
		this.averageSpeed = averageSpeed;
		this.amountOfCars = amountOfCars;
		this.day = day;
		this.month = month;
	}

}
