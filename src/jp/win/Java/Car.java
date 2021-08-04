package jp.win.Java;

public class Car {

	// 燃費(km/L)
	private double fuelCost;

	// 残量(L)
	private double fuelAmount;

	// コンストラクタを作成
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}

	// moveメソッド
	public void move(int km) {
		System.out.println(km + "km走ります");
		fuelAmount -= (km / fuelCost);
	}

	// fuelAmountを取得するメソッドを作成
	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
