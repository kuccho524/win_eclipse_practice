package jp.win.Java;

public class Chapter093 {
	public static void main(String[] args) {
        // 燃費（Km/L）
        double fuelCost = 12.5;
        // 残量（L）
        double fuelAmount = 55.0;

        Car01 car01 = new Car01(fuelCost, fuelAmount);

        car01.move(20);
        System.out.println("残量は、" + car01.getFuelAmount() + "です");
    }
}
