package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {
		// 九九で使用する変数の宣言
		String one = null;
		String two = null;
		String kuku = null;

		// 九九の横列を1から9まで用意
		for (int i = 1; i <= 9; i++) {
			// 九九の縦列を1から20まで用意
			for (int j = 1; j <= 20; j++) {
				// iの1から9までの数字が1桁だった場合の3桁表記
				if (i <= 9) {
					one = ("00" + i);
					// iの1から9までの数字を1桁以外だった場合の3桁表記
				} else {
					one = ("0" + i);
				}
				// ｊの1から20までの数字が1桁だった場合の3桁表記
				if (j <= 9) {
					two = ("00" + j);
					// ｊの1から9までの数字が1桁以外だった場合の3桁表記
				} else {
					two = ("0" + j);
				}
				// 掛け算で1桁だった場合3桁表記にする
				if (i * j <= 9) {
					kuku = ("00" + i * j);
					// 掛け算で2桁だった場合３桁表記にする
				} else if (i * j <= 99) {
					kuku = ("0" + i * j);
					// それ以外
				} else {
					kuku = ("" + i * j);
				}
				// 3桁表記したもの同士をかけて計算結果を表示
				System.out.printf(two + "*" + one + "=" + kuku + "||");
			}
			// 改行
			System.out.println();
		}
	}

}
