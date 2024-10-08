package java30;

class Person {
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	//人数カウントフィールド
	public static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		//人数カウント
		count++;
	}

	//BMIメソッドを定義
	public double bmi() {
		return this.weight / height / height;
	}

	//printメソッドを定義
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + Math.floor(this.bmi()) + "です" + "\n");
		System.out.println("合計" + count + "人です");
	}

}
