package jp.win.JavaPractice;

/*
 * 自分の名前を「String」型の変数に代入
 * 好きな言葉を再代入
 * ラッキーナンバーをint型で宣言した定数に代入
 */

public class Chapter04 {
	public static void main(String[] args) {

		// String型の変数を持つ変数nameに自分の名前を代入し出力
		String name = "Ryo";
		System.out.println(name);

		// 変数nemeに好きな言葉を代入し出力
		name = "ジャンクフード！！";
		System.out.println(name);

		// ラッキーナンバーをint型で宣言した定数に代入し出力
		final int luckyNumber = 4;
		System.out.println(luckyNumber);

	}
}
