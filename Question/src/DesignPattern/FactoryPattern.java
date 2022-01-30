package DesignPattern;

public class FactoryPattern {

	public static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
		case SMALL:
			car = new SmallCar();
			break;
		case LUXURY:
			car = new LuxuryCar();
			break;

		default:
			// throw some exception
			break;
		}
		return car;
	}

	public static void main(String[] args) {
		System.out.println(FactoryPattern.buildCar(CarType.SMALL));
		System.out.println(FactoryPattern.buildCar(CarType.SEDAN));
		System.out.println(FactoryPattern.buildCar(CarType.LUXURY));
	}
}
