package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		/* 1
		 * 下記9個をローカル変数として宣言のみしてください
		 */
		// バイト型
		byte b;
		// 短整数型
		short s;
		// 整数型
		int i;
		//長整数型
		long l;
		// 単精度浮動小数点数型
		float f;
		// 倍精度浮動小数点数型
		double d;
		// 文字型
		char c;
		// 文字列型
		String str;
		// ブーリアン型
		boolean bl;

		System.out.println("");

		/* 2
		 * それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください			
		 */
		b = 0;
		s = 0;
		i = 0;
		l = 0L;
		f = 0.0f;
		d = 0.0d;
		c = '\u0000';
		str = null;
		bl = false;
		System.out.println("");

		/* 3
		 * 初期化をしたそれぞれの変数に下記の値を代入してください			
		 */
		// バイト型		10
		b = 10;
		// 短整数型		100
		s = 100;
		// 整数型		1000
		i = 1000;
		// 長整数型		10000
		l = 10000l;
		// 単精度浮小数点数型		9.5
		f = 9.5f;
		// 倍精度浮動小数点数型		10.5
		d = 10.5d;
		// 文字型		a
		c = 'a';
		// 文字列型		ハロー
		str = "ハロー";
		// ブーリアン型		true	
		bl = true;
		System.out.println("");

		/* 4
		 * 3で指定した変数を用いて計算式を作成
		 */
		System.out.println(l + i + s + b);
		System.out.println(b + b);
		System.out.println(c + str + bl);
		System.out.println(b + s + i + l + f + d);
		System.out.println(l * i * s * b);
		System.out.println(d / s);
		System.out.println(b - s);
		System.out.println("");

		/* 5
		 * 文字列として宣言されていたものをint型で宣言しなおした
		 */
		int num = 20;
		int num1 = 23;
		//コンソール出力
		System.out.println("ハローJAVA" + (num + num1));
		System.out.println("");

		/* 6
		 * 	『山田太郎 18歳 170.5cm 62.2kg 寿司』			
			ローカル変数に代入して表示する
		 */
		String name = "山田太郎";
		int age = 18;
		float height = 170.5f;
		float weight = 62.2f;
		String food = "寿司";
		//コンソール出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("");

		/* 7
		 * BMIの計算
		 */
		float bmi = weight / ((height / 100) * (height / 100));
		//小数点第2位で四捨五入
		double d1 = ((double) Math.round(bmi * 10)) / 10;
		//コンソール出力
		System.out.println("BMIは" + d1 + "です");
		System.out.println("");

		/* 8
		 * 6で宣言した変数に再代入してコンソールに出力
		 */
		name = "鈴木一郎";
		age = 24;
		height = 168.5f;
		weight = 64.2f;
		food = "オムライス";
		//bmi計算
		bmi = weight / ((height / 100) * (height / 100));
		//小数点第2位で四捨五入
		d1 = ((double) Math.round(bmi * 10)) / 10;
		//コンソール出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + d1 + "です");
		System.out.println("");

		/* 9
		 * 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、コンソールに出力
		 */
		age += age;
		height += height;
		weight += weight;
		//bmi計算
		bmi = weight / ((height / 100) * (height / 100));
		//小数点第3位で四捨五入
		d1 = ((double) Math.round(bmi * 100)) / 100;
		//コンソール出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + d1 + "です");
		System.out.println("");

		/* 10
		 * 	8で使用した年齢が25歳以上ならtrueを出力
		 */
		age = 24;
		//条件式の指定
		boolean judge = (age >= 25);
		//コンソール出力
		System.out.println(judge);
		System.out.println("");

		/* 11
		 * 	8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力
		 */
		height = 168.5f;
		weight = 64.2f;
		//文字列型の宣言
		String strAge = String.valueOf(age);
		String strHeight = String.valueOf(height);
		String strWeight = String.valueOf(weight);
		//コンソール出力
		System.out.println("年齢:" + strAge);
		System.out.println("身長:" + strHeight);
		System.out.println("体重:" + strWeight);
		System.out.println("");

		/* 12
		 * 	11で変換した【年齢・身長】を整数型に変換して出力	
		 */
		//整数型の宣言
		int intAge = Integer.parseInt(strAge);
		int intHeight = (int) Float.parseFloat(strHeight);
		//コンソール出力
		System.out.println("年齢:" + intAge);
		System.out.println("身長：" + intHeight);
		System.out.println("");

		/* 13
		 * 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください			
		 */
		//条件式の指定
		judge = (age == 25 || height >= 160);
		//コンソール出力
		System.out.println(judge);
	}

}
