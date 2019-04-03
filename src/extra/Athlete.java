package extra;

public class Athlete {

	static int nextBibNumber;
	static String raceLocation = "New York";
	static String raceStartTime = "9.00am";

	String name;
	int speed;
	int bibNumber;

	Athlete(String name, int speed) {
		this.name = name;
		this.speed = speed;
		bibNumber = nextBibNumber;
		nextBibNumber++;
	}

	public static void main(String[] args) {

	}
}