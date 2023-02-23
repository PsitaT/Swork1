package Javamix;

public class JavaMixPractice2 {

	public static void main(String[] args) {

		int day = 5;
		switch (day) {
		case 1:
			System.out.println("Sunday");
		case 2:
			System.out.println("Monday");
		case 3:
			System.out.println("Tuesday");
		case 4:
			System.out.println("Wednesday");
		case 5:
			System.out.println("Thursday");
		case 6:
			System.out.println("Friday");
		case 7:
			System.out.println("Saturday");
		default:
			System.out.println("Please insert the correct number");
		}

		String CityA = "Fortworth";
		switch (CityA) {
		case "Fortworth":
			System.out.println("FW");
			break;
		case "Crowley":
			System.out.println("FW");
			break;
		case "Burleson":
			System.out.println("FW");
			break;
		case "Irving":
			System.out.println("DFW");
			break;
		case "Bedford":
			System.out.println("DFW");
			break;
		default:
			System.out.println("Please provide correct cityA name");
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		for (int i = 20; i >= 1; i--) {
			System.out.println(i);
		}

		for (int i = 1; i <= 30; i++) {
			System.out.println(i);
		}

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		for (int i = 50; i >= 1; i--) {
			if (i == 35) {
				break;
			}
			System.out.println(i);
		}

		for (int i = 1; i < 50; i++) {
			System.out.println(i);
			if (i == 35) {
				break;
			}

		}

		for (int i = 50; i >= 1; i--) {
			if (i == 35) {
				continue;
			}
			System.out.println(i);
		}

		for (int i = 1; i < 50; i++) {
			if (i == 35) {
				continue;
			}
			System.out.println(i);
		}

	}

}
