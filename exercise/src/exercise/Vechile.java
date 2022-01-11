package exercise;
abstract class Vechile1 {
		int speed;
		long distance;

		Vechile1() {
			System.out.println("vechile is started");
		}

		Vechile1(int a, long b) {
			speed = a;
			distance = b;
		}

		void display() {
			System.out.println(speed + " " + distance);
		}

		public void fuel(int x) {	
		}

		public void fuel(float y) {

		}

		public void fuel2(int a, char c) {

		}

		abstract void run();

		abstract void stop();
	}

	class TwoWheeler extends Vechile1 {
		int speed=100;
		long distance=25;
		int no_of_tyre = 2;

		TwoWheeler() {
			System.out.println("twowheeler vechile");
		}

		void display() {
			System.out.println(speed + " " + distance + " " + no_of_tyre+" "+super.speed+" "+super.distance);
		}

		void run() {
			System.out.println("running in process");
		}

		void stop() {
			System.out.println("vechile is stopped");
		}

	}

	class ThreeWheeler extends Vechile1 {
		int speed=125;
		long distance=30;
		int no_of_tyre = 3;

		ThreeWheeler() {
			System.out.println("threewheeler vechile");
		}

		void display() {
			System.out.println(speed + " " + distance + " " + no_of_tyre+" "+super.speed+" "+super.distance);
		}

		void run() {
			System.out.println("running in process");
		}

		void stop() {
			System.out.println("vechile is stopped");
		}

	}

	class FourWheeler extends Vechile1 {
		int speed=130;
		long distance=35;
		int no_of_tyre = 4;

		FourWheeler() {
			System.out.println("Fourwheeler vechile");
		}

		void display() {
			System.out.println(speed + " " + distance + " " + no_of_tyre+" "+super.speed+" "+super.distance);
		}

		void run() {
			System.out.println("running in process");
		}

		void stop() {
			System.out.println("vechile is stopped");
		}

	}

	class EghitWheeler extends Vechile1 {
		int speed=140;
		long distance=40;
		int no_of_tyre = 8;

		EghitWheeler() {
			System.out.println("Eghitwheeler vechile");
		
		}
		void display() {
			System.out.println(speed + " " + distance + " " + no_of_tyre+" "+super.speed+" "+super.distance);
		}

		void run() {
			System.out.println("vechile starts running");
		}

		void stop() {
			System.out.println("vechile stopped");
		}
	
	}
	public class Vechile {
		public static void main(String[] args) {
			TwoWheeler t=new TwoWheeler();
			t.display();
			t.run();
			t.stop();
			ThreeWheeler th=new ThreeWheeler();
			th.display();
			th.run();
			th.stop();
			FourWheeler f=new FourWheeler();
			th.display();
			th.run();
			th.stop();
			System.out.println(" ");
            Vechile1 ob = new EghitWheeler();
            ob.display();
			ob.run();
			ob.stop();
		}
	
	}
	
	