package basicClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Animal {
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		//Dogクラスの呼び出しと代入
		Dog d = new Dog();
		//出力
		System.out.println(d.name);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		//Dogクラスの呼び出しと代入
		Dog d2 = new Dog(4);
		//出力
		System.out.println(d2.animals);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		//Calendarクラスのオブジェクトを生成する
		Calendar cl = Calendar.getInstance();
		//SimpleDateFormatクラスでフォーマットパターンを設定する
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH:mm:ss");
		System.out.println(sdf.format(cl.getTime()));

	}
}
