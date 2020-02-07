package ua.lviv.iot.first_laba;

public class MotorRace {
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

	public int getDuration() {
		return durationInDays;
	}

	public void setDuration(int duration) {
		this.durationInDays = duration;
	}

	public int getPrice() {
		return priceInEuro;
	}

	public void setPrice(int price) {
		this.priceInEuro = price;
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

	public MotorRace(String country, int duration, int price, int averageSpeed, int amountOfCars, String day,
			String month) {
		super();
		this.country = country;
		this.durationInDays = duration;
		this.priceInEuro = price;
		this.averageSpeed = averageSpeed;
		this.amountOfCars = amountOfCars;
		this.day = day;
		this.month = month;
	}

	public MotorRace(String country, int duration, int price, int averageSpeed) {
		this(country, duration, price, averageSpeed, 0, null, null);
	}

	public MotorRace() {
		this("Ukraine", 5, 100, 60, 10, "Monday", "May");
	}

	public String toString() {
		return "MotorRace [country=" + country + ", duration=" + durationInDays + ", price=" + priceInEuro
				+ ", averageSpeed=" + averageSpeed + ", amountOfCars=" + amountOfCars + ", day=" + day + ", month="
				+ month + "]";
	}

	public void printDistanceInKilometers() {
		System.out.println("Distance of Motor Race = " + distanceInKilometers);
	}

	public static void printStaticDistanceInKilometers() {
		System.out.println("Distance of Motor Race = " + distanceInKilometers);
	}

	public void resetValues(String country, int duration, int price, int averageSpeed, int amountOfCars, String day,
			String month) {
		this.country = country;
		this.durationInDays = duration;
		this.priceInEuro = price;
		this.averageSpeed = averageSpeed;
		this.amountOfCars = amountOfCars;
		this.day = day;
		this.month = month;
	}

}
