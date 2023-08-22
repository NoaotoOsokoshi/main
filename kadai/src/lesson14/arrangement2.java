package lesson14;

public class arrangement2 {
	/*
	string型の配列を作成し、アルファベットa～jまでを格納してください。
	brake文を使用し、a～dまで表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	          
	cotinue文を使用し、i以外を表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	           e
	           f
	           g
	           h
	           j
	*/
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] word = new String[10];
		word[0] = "a";
		word[1] = "b";
		word[2] = "c";
		word[3] = "d";
		word[4] = "e";
		word[5] = "f";
		word[6] = "g";
		word[7] = "h";
		word[8] = "i";
		word[9] = "j";

		for (int i = 0; i < 10; i++) {
			System.out.println(word[i]);
			if (i > 2) {
				break;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			if (word[i].equals("i") ){
				continue;
			}
			System.out.println(word[i]);
		}
	}

}
