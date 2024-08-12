package java_24_25_2;

//処理クラスの継承
public class kyara extends syori {
	//コンストラクタの作成
	public kyara(String name, int hp, int mp) {
		super(name, hp, mp);
	}

	//実行のためのコンストラクタ
	public kyara() {

	}

	//変数宣言
	public int attack;
	public int speed;
	public int defense;

	//攻撃力の取得
	public int getAttack() {
		return attack;
	}

	//素早さの取得
	public int getSpeed() {
		return speed;
	}

	//防御力の取得
	public int getDefense() {
		return defense;
	}

	//攻撃力の代入
	public void setAttack(int attack) {
		this.attack = attack;
	}

	//素早さの代入
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//防御力の代入
	public void setDefense(int defense) {
		this.defense = defense;
	}
}
