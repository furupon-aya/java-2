package java_24_25_1;
//ランダム変数の挿入
import java.util.Random;
//スキャナーの挿入
import java.util.Scanner;

//パッケージの挿入
import java_24_25_2.kyara;
import java_24_25_2.syori;

public class main {
	public static void main(String[] args) {
		//ランダム変数の宣言
		Random rand = new Random();
		//スキャナーの宣言
		Scanner sc1 = new Scanner(System.in);
		//スキャナーの読み取り
		String name=sc1.nextLine();
		//ランダム変数への代入
		int i=rand.nextInt(1000);
		//syoriのコンストラクタに代入し呼び出し
		syori s = new syori(name,i,i+50);
		//kyaraのコンストラクタに代入し呼び出し
		kyara k = new kyara();
		//それぞれに代入
		k.setAttack(rand.nextInt(1000));
		k.setSpeed(rand.nextInt(1000));
		k.setDefense(rand.nextInt(1000));
		
		// コンソールに出力
		System.out.println("こんにちは " + s.getName() + " さん");
		System.out.println("ステータス");
		System.out.println("HP：" + s.getHp());
		System.out.println("MP：" + s.getMp());
		System.out.println("攻撃力：" + k.getAttack());
		System.out.println("素早さ：" + k.getSpeed());
		System.out.println("防御力：" + k.getDefense());
		System.out.println("\nさあ冒険に出かけよう！");
	}
}
