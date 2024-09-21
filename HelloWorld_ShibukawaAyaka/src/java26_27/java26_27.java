package java26_27;

import java.util.Scanner;

public class java26_27 {
	//スキャナー用意
	static Scanner sc1 = new Scanner(System.in);

	public static void main(String[] args) {
		//出力
		System.out.println("コンソールに文字を入力してください");
		//入力内容の読み取り
		String line = sc1.nextLine();
		//入力内容を,で区切る
		String[] animals = line.split(",");
		//学名の配列を準備
		String[] name = { "パンテラ レオ", "ロキソドンタ・サイクロティス", "アイルロポダ・メラノレウカ", "パン・トゥログロディテス", "チャップマンシマウマ", "不明" };

		//animalsの数分ループする
		for (int i = 0; i < animals.length; i++) {
			//,で区切った文字列をさらに:で区切る
			String[] animal = animals[i].split(":");
			//出力
			System.out.println("動物名:" + animal[0]);
			System.out.println("体長:" + animal[1] + "m");
			System.out.println("速度:" + animal[2] + "km/h");
			//条件分岐(動物ごとに記載)
			switch (animal[0]) {
			case "ライオン":
				System.out.println("学名:" + name[0] + "\n");
				break;
			case "ゾウ":
				System.out.println("学名:" + name[1] + "\n");
				break;
			case "パンダ":
				System.out.println("学名:" + name[2] + "\n");
				break;
			case "チンパンジー":
				System.out.println("学名:" + name[3] + "\n");
				break;
			case "シマウマ":
				System.out.println("学名:" + name[4] + "\n");
				break;
			case "インコ":
				System.out.println("学名:" + name[5] + "\n");
				break;
			}
		}
	}
}