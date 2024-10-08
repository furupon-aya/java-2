package java30;

class Main {
	public static void main(String[] args) {
		//値の入力
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		
		//出力
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height + "\n");
		
		//printメソッド呼び出し
		person1.print();

	}
}
