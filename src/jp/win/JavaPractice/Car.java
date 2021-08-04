package jp.win.JavaPractice;

public class Car {

	// 燃費（km/L）
	private double fuelCost;

	// 残量（L）
	private double fuelAmount;

	// コンストラクタを作成
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}

	public void move(int km) {
		System.out.println(km + "km走ります");
		fuelAmount -= (km / fuelCost);
	}

	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
