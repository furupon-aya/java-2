package java_20_22_2;

import java_20_22_1.Syori;

public class Jikkou {
	 public static void main(String[] args){
		 //syoriパッケージの呼び出しと代入
		 Syori s = new Syori();
		 //出力
		 System.out.println("こんにちは！ここは"+s.country+"です！");
		 System.out.println("この"+s.syoku+"はうまい");
		 System.out.println(s.syoku+"は"+s.keitai+"です");
		 //syoriパッケージの時刻呼び出し
		 s.CL();
	 }
}