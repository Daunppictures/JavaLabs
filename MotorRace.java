package ua.lviv.iot.first_laba;

public class MotorRace {

	private static final String DEFAULT_COUNTRY = "Ukraine";

	private static final int DEFAULT_DURATION_IN_DAYS = 5;

	private static final int DEFAULT_PRICE_IN_EURO = 100;

	private static final int DEFAULT_AVERAGE_SPEED = 60;

	private static final int DEFAULT_AMOUNT_OF_CARS = 10;

	private static final String DEFAULT_DAY = "Monday";

	private static final String DEFAULT_MONTH = "May";

	public static int distanceInKilometers = 500;

	private String country;

	private int durationInDays;

	private int priceInEuro;

	private int averageSpeed;

	private int amountOfCars;

	protected String day;

	protected String month;

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
		this(country, durationInDays, priceInEuro, averageSpeed, DEFAULT_AMOUNT_OF_CARS, DEFAULT_DAY, DEFAULT_MONTH);
	}

	public MotorRace() {
		this(DEFAULT_COUNTRY, DEFAULT_DURATION_IN_DAYS, DEFAULT_PRICE_IN_EURO, DEFAULT_AVERAGE_SPEED, DEFAULT_AMOUNT_OF_CARS, DEFAULT_DAY, DEFAULT_MONTH);
	}

	@Override
	public String toString() {
		return "MotorRace [country=" + country + ", durationInDays=" + durationInDays + ", priceInEuro=" + priceInEuro
				+ ", averageSpeed=" + averageSpeed + ", amountOfCars=" + amountOfCars + ", day=" + day + ", month="
				+ month + "]";
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
