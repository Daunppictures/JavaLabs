package ua.lviv.iot.first_laba;

public class MotorRaceCreator {

	public static void main(String[] args) {

		MotorRace firstMotorRace = new MotorRace();

		MotorRace secondMotorRace = new MotorRace("USA", 12, 120, 80);

		MotorRace thirdMotorRace = new MotorRace("Poland", 5, 50, 70, 15, "Friday", "March");

		System.out.println(firstMotorRace);

		System.out.println(secondMotorRace);

		System.out.println(thirdMotorRace);

		firstMotorRace.printDistanceInKilometers();

		MotorRace.printStaticDistanceInKilometers();

		MotorRace[] motorRaceArray = new MotorRace[4];

		int motorRaceIndex = 0;

		while (motorRaceIndex < 4) {

			motorRaceArray[motorRaceIndex] = new MotorRace();
			motorRaceIndex++;

		}

		for (MotorRace index : motorRaceArray) {

			System.out.println(index);

		}

	}

}
