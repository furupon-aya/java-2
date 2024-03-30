package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	
	public static void main(String[] args) {
		// 入力変数を用意
		Scanner sc1 = new Scanner(System.in);
		// 生徒数の入力
		System.out.print("生徒の人数を入力してください(2以上):");
		// 入力した値を読み取り
		int arraySize = sc1.nextInt();
		// 各科目の用意
		String[] sub = { "英語", "数学", "理科", "社会" };
		// 用意した科目を変数に入れていくつ入っているのかも表記する
		int[][] array = new int[arraySize][sub.length];
// 人数分の箱を用意
		for (int i = 0; i < arraySize; i++) {
			// 人数の箱の中に各科目の点数入力欄を用意
			for (int j = 0; j < sub.length; j++) {
				// 出力
				System.out.print((i + 1) + "人目の『" + sub[j] + "』の点数を入力してください：");
				// 一人一人の変数を用意
				int sca = sc1.nextInt();
				// 個人の科目ごとの点数を管理
				array[i][j] = sca;
			}
			// 改行
			System.out.println();
		}
		// スキャナーを閉じる
		sc1.close();

		// 一人ずつの平均点出力

		// 生徒の人数分繰り返す
		for (int q = 0; q < arraySize; q++) {
			double ave = 0d; // 平均点の変数を宣言
			double sumd = 0d; // 点数合計の変数を宣言

			// 教科の数分繰り返す
			for (int s = 0; s < sub.length; s++) {
				//人数の全科目の合計点数を算出
				ave += array[q][s];
			}
			//合計点を教科数で割る
			sumd = ave / sub.length;
			// 小数点第2位までで表示
			String studentAv = String.format("%.2f", sumd);
			System.out.println((q + 1) + "人目の平均点は" + studentAv + "点です。");

		}
		// 改行
		System.out.println();

		//	---------------------------各科目の平均点処理-----------------------------
		double[] kyouka; // 科目の変数を用意
		// 4つの科目を変数に入れる
		kyouka = new double[sub.length];
		// 科目を1つずつループする
		for (int w = 0; w < sub.length; w++) {
			double heikin = 0d; // 平均の変数
			double sumav = 0d; // 合計の変数
			// 科目ごとに点数を合計するループ文
			for (int p = 0; p < arraySize; p++) {
				heikin += array[p][w];
			}
			// 各科目の合計を人数で割る
			sumav = heikin / arraySize;
			// 小数点第2位までで表示
			String kamokuAv = String.format("%.2f", sumav);
			System.out.println(sub[w] + "の平均点は" + kamokuAv + "点です。");
			kyouka[w] = sumav;
		}
		//--------------------------------全体の平均---------------------------------
		double suma = 0d; // 合計の変数
		double zenAve = 0d; // 平均の変数
		// 各科目の平均点を足していくループ文
		for (int s = 0; s < sub.length; s++) {
			suma += kyouka[s];
		}
		// 合計点を科目数で割る
		zenAve = suma / sub.length;
		// 小数点第2位までで表示
		String zenbu = String.format("%.2f", zenAve);
		System.out.println("全体の平均点は" + zenbu + "点です。");

	}
}
