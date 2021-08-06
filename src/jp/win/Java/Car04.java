package jp.win.Java;

public class Car04 {

	// 燃費（Km/L）
    private double fuelCost;
    // 残量（L）
    private double fuelAmount;

    // コンストラクタを作成
    public Car04(double fuelCost, double fuelAmount) {
    	this.fuelCost = fuelCost;
    	this.fuelAmount = fuelAmount;
    }

    // moveメソッド
    public void move(int km) {

    	// "xx km 走ります"を出力
    	System.out.println(km + "走ります");

    	// 残量を計算
    	this.fuelAmount -= (km / fuelCost);
    }



    // fuelAmountを取得するメソッドを作成
    public double getFuelAmount() {
    	return fuelAmount;
    }
}
