package jp.win.JavaPractice;


/*
 * ・プリミティブ型の「long」「double」「boolean」の変数に値を代入して出力
   ・ラッパークラスの「Float」「Integer」「Character」の変数に値を代入して出力
   ・要素数が5の「int」配列に値を代入して、インデックス番号が3の値を出力
 */

public class Chapter05 {
	public static void main(String[] args) {

		// プリミティブ型の「long」「double」「boolean」の変数に値を代入して出力
		long long1 = 1234567890123456L;
		double double1 = 0.1234567;
		boolean boolean1 = true;

		System.out.println(long1);
		System.out.println(double1);
		System.out.println(boolean1);

		// ラッパークラスの「Float」「Integer」「Character」の変数に値を代入して出力
		Float float1 = 3.14f;
		Integer integer1 = 25;
		Character character1 = '未';

		System.out.println(float1);
		System.out.println(integer1);
		System.out.println(character1);

		// 要素数が5の「int」配列に値を代入して、インデックス番号が3の値を出力
		int[] group = { 0, 1, 2, 3, 4};
		System.out.println(group[3]);
	}
}
