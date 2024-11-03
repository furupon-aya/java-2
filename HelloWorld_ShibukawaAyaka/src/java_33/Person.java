package java_33;

public class Person {

	//人数カウントフィールド
	public static int count = 0;
	// インスタンスフィールドを定義
	public String firstName;
	public String lastName;
	public int age;
	public double height, weight;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String firstName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// コンストラクタのオーバーロード
	Person(String firstName, String lastName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// fullNameメソッドを定義
	public String fullName() {
		return this.firstName + this.lastName;
	}

	//printメソッドを定義
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + Math.floor(this.bmi()) + "です" + "\n");

	}

	//BMIメソッドを定義
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	//人数カウントのメソッドを定義
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です" + "\n");
	}

	// インスタンスメソッドbuyを定義
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が車を購入しました");
	}

	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が自転車を購入しました");
	}

}
