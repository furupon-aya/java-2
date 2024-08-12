package java_24_25_2;

public class syori {
	//変数宣言
	public String name;
	public int hp;
	public int mp;

	//コンストラクタの作成
	public syori(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	//実行のためのコンストラクタ
	public syori() {

	}

	//名前の取得
	public String getName() {
		return name;
	}

	//hpの取得
	public int getHp() {
		return hp;
	}

	//mpの取得
	public int getMp() {
		return mp;
	}

	//名前の代入
	public void setName(String name) {
		this.name = name;
	}

	//hpの代入
	public void setHp(int hp) {
		this.hp = hp;
	}

	//mpの代入
	public void setMp(int mp) {
		this.mp = mp;
	}
}
