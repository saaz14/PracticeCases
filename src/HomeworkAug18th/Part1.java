package HomeworkAug18th;

public class Part1 {

	public static void main(String[] args) {

		String str[] = { "The quick brown fox jumps over the lazy dog." };

		System.out.println(
				"This is the actual statemet ----The quick brown fox jumps over the lazy dog\nWe now replace the word dog with cat using the codes.");

		for (int i = 0; i < str.length; i++) {
			str[i] = str[i].replaceAll("dog", "Cat");

		}
		for (String strr11 : str) {
			System.out.println("\n" + strr11);
		}
	}

}
