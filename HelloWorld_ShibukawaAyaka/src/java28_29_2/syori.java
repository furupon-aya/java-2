package java28_29_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class syori {

	//配列を用意
	public String[] name = {
			"北海道:札幌市:83424", "青森県:青森市:9646", "岩手県:盛岡市:15275", "宮城県:仙台市:7282", "秋田県:秋田市:11638",
			"山形県:山形市:9323", "福島県:福島市:13784", "茨城県:水戸市:6097", "栃木県:宇都宮市:6408", "群馬県:前橋市:6362", "埼玉県:さいたま市:3798"
	};

	public void narabekae() {
		//スキャナー用意
		Scanner sc1 = new Scanner(System.in);
		//出力
		System.out.println("数字の入力(0～10)の際,(カンマ)で区切ってください。");
		//スキャナー読み取り
		String line = sc1.nextLine();
		//,区切り
		String[] nums = line.split(",");
		//出力
		System.out.println("昇順で並べ替えの場合は1を、それ以外場合は好きな数字を入力してください。");
		//スキャナーの数値読み取り
		int i = sc1.nextInt();
		//入力された数値が１の場合
		if (i == 1) {
			//昇順
			Arrays.sort(nums);
			//それ以外
		} else {
			//降順
			Arrays.sort(nums, Collections.reverseOrder());
		}
		//0から順に配列と紐づけ
		for (String str : nums) {
			//：で区切る
			String[] ken = name[Integer.parseInt(str)].split(":");
			//出力
			System.out.println("都道府県名：" + ken[0]);
			System.out.println("県庁所在地：" + ken[1]);
			System.out.println("面積：" + ken[2] + "㎢");
		}
	}

}