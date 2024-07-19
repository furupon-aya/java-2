package java_23;

public class java_23 {
	
	//変数宣言
 	public String name;
 	public double height;
 	public int sokudo;

 	//動物名の取得
 	public String getName() {
 		return this.name;
 	}
 	//身長の取得
 	public double getDouble() {
 		return this.height;
 	}
 	//速度の取得
 	public int getInt() {
 		return this.sokudo;
 	}
 	//動物名を代入
 	public void setName(String name) {
 		this.name=name;
 	}
 	//身長を代入
 	public void setDouble(double height) {
 		this.height=height;
 	}
 	//速度を代入
 	public void setInt(int sokudo) {
 		this.sokudo=sokudo;
 	}

 	public static void main(String[] args) {
 		//代入したものを呼び出し
 		java_23 jikkou=new java_23();
 		//それぞれに代入
 		jikkou.setName("ライオン");
 		jikkou.setDouble(2.1);
 		jikkou.setInt(80);
 		//出力
 		System.out.println("動物名："+jikkou.name);
 		System.out.println("身長："+jikkou.height+"m");
 		System.out.println("速度："+jikkou.sokudo+"km/h");
 	}
}

