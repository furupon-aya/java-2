package java26_27;

import java.util.Scanner;

public class java26_27 {
	//スキャナー用意
	static Scanner sc1 = new Scanner(System.in);

	public static void main(String[] args) {
		//入力内容の読み取り
		String line = sc1.nextLine();
		//入力内容を,で区切る
		String[] animals = line.split(",");
		//学名の配列を準備
		String[] name = { "パンテラ レオ", "ロキソドンタ・サイクロティス", "アイルロポダ・メラノレウカ", "パン・トゥログロディテス", "チャップマンシマウマ", "不明" };
		//出力
		System.out.println("コンソールに文字を入力してください");
		//animalsの数分ループする
		for (int i = 0; i < animals.length; i++) {
			//,で区切った文字列をさらに:で区切る
			String[] animal = animals[i].split(":");
			//出力
			System.out.println("動物名:" + animal[0]);
			System.out.println("体長:" + animal[1] + "m");
			System.out.println("速度:" + animal[2] + "km/h");
			System.out.println("学名:" + name[i] + "\n");

		}

	}

}