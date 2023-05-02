package lesson23data;

public class Data {
	private String name;
	private double size;
	private int speed;

	//name ゲッター
	public String getName() {
		return name;
	}

	//name セッター
	public void setName(String name) {
		this.name = name;
	}

	//size ゲッター
	public double getSize() {
		return size;
	}

	//size セッター
	public void setSize(double size) {
		this.size = size;
	}

	//speed ゲッター
	public int getSpeed() {
		return speed;
	}

	//speed セッター
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//出力
	public void imform() {
		String strSize = String.valueOf(size);
		String strSpeed = String.valueOf(speed);
		if(name != null&& strSize != null && strSpeed != null) {
			System.out.println("動物名：" + name);
			System.out.println("体長：" + size + "m");
			System.out.println("速度：" + speed + "km/h");
		}else {
			
			System.out.println("エラーです");
		}
		
	}

}
