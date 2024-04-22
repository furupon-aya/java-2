package curriculum_B;

//挿入
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {
		//スキャナーを用意
		Scanner sc1 = new Scanner(System.in);
		//スキャナーで読みとったものを名前として登録
		String name = sc1.nextLine();
		//半角英数字を用意
		Pattern p = Pattern.compile("^[A-Za-z0-9]+$");
		//入力されたもの文字を照合
		Matcher m = p.matcher(name);
		//入力された文字が半角英数字ではなかった場合
		if (!m.find()) {
            System.out.println("半角英数字のみで入力してください");
        } 
		//入力された文字が10文字以上だった場合
		if (name.length() >= 10) {
			System.out.println("名前を10文字以内にしてください");
		//入力がなかった場合
		} else if (name.isEmpty()) {
			System.out.println("名前を入力してください");
		}
		
		// スキャナーを閉じる
		sc1.close();
		
		//1-3じゃんけんシステム
		//手を用意
		String[] hands = { "グー", "チョキ", "パー" };
		//自分の手
		String myHand = hands[2];
		//相手の手
		String cpu = hands[0];
		//ユーザー名の出力
		System.out.println("ユーザー名「" + name + "」を登録しました");
		//自分の手の出力
		System.out.println("nameの手は「" + myHand + "」");
		//相手の手の出力
		System.out.println("相手の手は「" + cpu + "」");
		//結果
		String result;
		//勝った回数を数える
		int win = 0;
		//自分の手と相手の手を比べる
		if (myHand == cpu) {
			result = "DRAW あいこ もう一回しましょう！";
			//自分の手がチョキかつ相手の手がグー
		} else if (myHand == hands[1] && cpu == hands[0]) {
			result = "俺の勝ち！負けは次につながるチャンスです！ネバーギブアップ！";
			//自分の手がパーがつ相手の手がチョキ
		} else if (myHand == hands[2] && cpu == hands[1]) {
			result = "俺の勝ち！たかがじゃんけん、そう思ってないですか？それやったら次も、僕が勝ちますよ";
			//自分の手がグーかつ相手の手がパー
		} else if (myHand == hands[0] && cpu == hands[2]) {
			result = "俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです";
		} else {
			result = "やるやん。" + "次は僕にリベンジさせて";
			//勝利回数
			win++;
		}
		//結果の表示
		System.out.println(result);
		System.out.println("勝つまでにかかった合計回数は" + win + "回です");
	}
}
