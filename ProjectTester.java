public class ProjectTester {

	public static void main(String[] args) {
		// create a new instance of CarLot and add 4 cars
		CarLot newLot = new CarLot();
		newLot.addCar("Ford Taurus", 5000, 23, 8000D, 9900D);
		newLot.addCar("Chevy Blazer", 15000, 19, 12000D, 14500D);
		newLot.addCar("Honda Civic", 12300, 25, 6500D, 10000D);
		newLot.addCar("KIA Sorento", 22000, 28, 13500D, 15500D);
		
		// Display inventory
		System.out.println("Inventory: ");
		for (Car car: newLot.getInventory()) {
			System.out.println(car);
		}
		
		System.out.println("\nAverage MPG: " + newLot.getAverageMpg());
		System.out.println("Total Profit: " + newLot.getTotalProfit());
		System.out.println("Car with the best MPG: " + newLot.getCarWithBestMPG());
		System.out.println("Car with the highest mileage: " + newLot.getCarWithHighestMileage());
		newLot.sellCar("KIA Sorento", 15500.0D);
		System.out.println("Total profit after selling one car: " + newLot.getTotalProfit());
		
		// sell another car at a loss to test getTotalProfit() method
		newLot.sellCar("Ford Taurus", 7000.0D);
		System.out.println("Total profit after selling two cars: " + newLot.getTotalProfit());
		
		// display inventory to test that isSold() method works
		System.out.println("\nInventory: ");
		for (Car car: newLot.getInventory()) {
			System.out.println(car);
		}
		
		// test by selling a car already sold
		newLot.sellCar("Ford Taurus", 7000.0D);
		
		// Inventory not affected by trying to sell car already sold
		System.out.println("\nInventory: ");
		for (Car car: newLot.getInventory()) {
			System.out.println(car);
		}
		
		// TEST does selling already sold car affect the profits
		System.out.println("\nTotal Profit: " + newLot.getTotalProfit()); // has no effect on profits
		
		System.out.println(newLot.getCarsSortedByMPG());
		System.out.println(newLot.getCarsInOrderOfEntry());
		
	}

}
