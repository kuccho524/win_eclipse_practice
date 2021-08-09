/**
 * ～九九のプログラム～
 * Created by Ryo
 */

package com.jp.practice;

public class Kuku {
	public static void main(String[] args) {

		// 掛ける数を宣言する
		for(int i = 1; i < 10; i++) {

			// 掛けられる数を宣言する
			for(int j = 1; j < 10; j++) {

				// i * jの値を出力する
				System.out.print((i * j) + " ");
			}
			System.out.println("");
		}
	}
}
