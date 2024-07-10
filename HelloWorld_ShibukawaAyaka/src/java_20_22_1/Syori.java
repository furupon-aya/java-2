package java_20_22_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Syori {
	//変数宣言
	public String country,syoku,keitai;
	public Syori() {
		//country変数に日本を代入
		this.country="日本";
		//syoku変数に寿司を代入
		this.syoku="寿司";
		//keitai変数に和食を代入
		this.keitai="和食";
	}
	//オブジェクトを生成する
	public void CL() {
		Calendar cl = Calendar.getInstance();
		//フォーマットパターンを設定する
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//時刻表示
		System.out.println("今の現在日時は"+sdf.format(cl.getTime())+"です"+ "");
	}
}
