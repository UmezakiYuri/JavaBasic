package practice02;
/*
 * PTra02_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra02_09 {
	public static void main(String[] args) {
		int length = 9;	// 底辺
		int hength = 23;	// 高さ

		// ★ 変数quadrangleに、四角形の面積を代入してください
		int quadrangle=(length*length)*hength;


		// ★ 変数quadrangleを出力してください
		System.out.println((length*length)*hength);


		// ★ 変数triangleに、三角形の面積を代入してください
		int triangle=(length* hength)/3;


		// ★ 変数triangleを出力してください
		System.out.println((length* hength)/3);


	}
}
