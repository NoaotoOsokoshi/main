package lesson29process;

import java.util.Arrays;

public class Process {
	static String[] place;
	static int[] num;

	// getter num
	public int[] getNum() {
		return num;
	}

	// setter num
	public void setNum(int[] num) {
		this.num = num;
	}

	// getter place
	public String[] getPlace() {
		return place;
	}

	// setter place
	public void setPlace(String[] place) {
		this.place = place;
	}

	public void result() {
		// インストラクタ
		Print print = new Print();
	}

}

class Sort {
	int[] num = Process.num;
	String[] place = Process.place;
	String[] sortPlace = new String[num.length];

	public Sort() {

		//並び替え
		Arrays.sort(num);

		//並び替えた順でplaceを格納
		for (int i = 0; i < num.length; i++) {
			sortPlace[i] = place[num[i]];
		}
	}
}

//  継承　サブ　　分割,表示
class Data extends Sort {
	// 都道府県名
	String[] prefecture = new String[sortPlace.length];

	// 県庁所在地
	String[] capital = new String[sortPlace.length];

	// 面積
	Double[] size = new Double[sortPlace.length];

	public Data() {
		//nullチェック
		if (sortPlace != null) {
			for (int j = 0; j < sortPlace.length; j++) {
				// ":"で分ける　[0]都道府県　[1]県庁所在地　[2]面積
				String[] data = sortPlace[j].split(":");
				prefecture[j] = data[0];
				capital[j] = data[1];
				size[j] = Double.parseDouble(data[2]);
			}
		} else {
			System.out.println("エラー");
		}

	}

}

//表示

/*例
都道府県名：山形県
県庁所在地：山形市
面積：9323.0km2
 */
class Print extends Data {
	public Print() {
		//Dataで分けたものを表示
		for (int k = 0; k < prefecture.length; k++) {
			System.out.println("都道府県名：" + prefecture[k]);
			System.out.println("県庁所在地:" + capital[k]);
			System.out.println("面積:" + size[k] + "km2");
			System.out.println("");

		}
	}
}
