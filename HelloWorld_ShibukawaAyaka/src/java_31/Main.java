package java_31;

class Main {
	public static void main(String[] argos) {
		//値の入力
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		//メソッド呼び出し
		person1.print();
		//値の入力
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		//メソッド呼び出し
		person2.print();

		//メソッド呼び出し
		Person.printCount();

	}

}
