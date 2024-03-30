package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	
	public static void main(String[] args) {
		// 入力変数を用意
		Scanner sc1 = new Scanner(System.in);
		// 入力した変数を、で区切って配列に入れる
		String[] kadenIn = sc1.next().split("、");
		// 乱数の変数を用意
		Random rand = new Random();
		// 乱数の数値を入れるための変数を用意
		int item;
		// 入力した変数(家電)をループする
		for (String str : kadenIn) {
			// 乱数の数値を設定
			item = rand.nextInt(12);
			// 条件分岐
			switch (str) {
			// 下記4つのアイテムに対しての処理
			case "パソコン", "冷蔵庫", "扇風機", "洗濯機":
				// ランダムの数値で表示
				System.out.println(str + "の残り台数は" + item + "台です");
				// 上記4つアイテムが出たらループを抜ける
				break;
			// 下記2つのアイテムに対しての処理
			case "テレビ", "ディスプレイ":
				// テレビとディスプレイは合計が11台になるように表示
				System.out.println(str == "テレビ" ? str + "の残り台数は" + item + "台です"
						: str + "の残りの台数は" + (11 - item) + "台です");
				// 上記2つのアイテムが出たらループを抜ける
				break;
			// 上記アイテム以外のものに対しての処理
			default:
				System.out.println("『" + str + "』は指定の商品ではありません");

			}

		}

	}

}
