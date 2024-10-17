package java_32;

class Main {
	public static void main(String[] args) {
		//値の入力
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		//メソッド呼び出し
		person1.print();
		//値の入力
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		//メソッド呼び出し
		person2.print();
		//メソッド呼び出し
		Person.printCount();
	}
}
