package java_17_18;

import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	//文字列型と整数型の引数を呼び出し
	private static void add(String s, int num1) {
		//呼び出した値をくっつけて出力
		System.out.println(s + num1);
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	//整数型の引数を呼び出し
	private static void add2(int a, int b) {
		//掛け算して出力
		System.out.println(a * b);
	}
	
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	//整数の配列を呼び出し
	private static void add3(int[] i) {
		//配列の中身を順番に取り出す
		for (int j : i) {
			//出力
			System.out.println(j);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	//小数型の引数を呼び出し
	private static void add2(double a, double b) {
		//足し算して出力
		System.out.println(a + b);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。

	// ※0は出力＆格納しないようにしてください。
	//格納する回数を呼び出し
	private static int[] add5(int j) {
		//呼び出した数字を格納する配列を作成
		int[] nums = new int[j];
		//格納したい回数分ループする
		for (int i = 0; i < j; i++) {
			//ランダムな数字を生成
			Random rand = new Random();
			//1～100
			int n = rand.nextInt(100) + 1;
			//配列に格納
			nums[i] = n;
			//出力
			System.out.println(nums[i]);
		}
		//格納した値を戻り値として設定
		return nums;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	//Q5で格納された数値を呼び出し
	private static double add6(int[] a) {
		//平均
		double ave = 0;
		//合計
		double sum = 0;
		//格納された個数分ループ
		for (int i = 0; i < a.length; i++) {
			//呼び出して来た際に足し算を行う
			sum += a[i];
		}
		//平均の計算
		ave = sum / a.length;
		//出力
		System.out.println(ave);
		//戻り値として設定
		return ave;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	//Q6で出た平均を呼び出し
	private static boolean add7(double ave) {
		//判定式
		boolean judge = false;
		//値が50以上の場合
		if (ave >= 50) {
			//true
			judge = true;
			//それ以外の場合
		} else {
			//false
			judge = false;
		}
		//戻り値として設定
		return judge;
	}

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		//Q1
		String s;
		int num1;
		s = "Hello JavaSE";
		num1 = 11;
		add(s, num1);

		//Q2
		add2(1, 7);

		//Q3
		int[] i = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		add3(i);

		//Q4
		add2(1.3, 7.0);

		//Q5
		//Q6
		//Q7
		System.out.println(add7(add6(add5(5))));

	}

}
