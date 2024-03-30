
package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		
		
		// 九九で使用する変数の宣言
		String one = null;
		String two = null;
		String kuku = null;

		// 九九の横列を1から9まで用意
		for (int i = 1; i <= 9; i++) {
			// 九九の縦列を1から9まで用意
			for (int j = 1; j <= 9; j++) {
				// iの1から9までの数字を2桁表記
				if (i <= 9) {
					one = ("0" + i);
				}
				// ｊの1から9までの数字を2桁表記
				if (j <= 9) {
					two = ("0" + j);
				}
				// 掛け算(結果が一桁だった場合2桁表記にする)
				if (i * j <= 9) {
					kuku = ("0" + i * j);
					// それ以外はそのまま2桁表記
				} else {
					kuku = ("" + i * j);
				}
				
				// 2桁表記したもの同士をかけて計算結果を表示
				System.out.printf(one + "*" + two + "=" + kuku + "||");
			}
			// 改行
			System.out.println();
		}
	}

}
