package HomeworkAug24th;

public class BooleanMethod {
	

public static boolean isEven(int n1 , int n2) {
	int x1 = n1 % 2;
	int x2 = n2 % 2;
	if (x1 == 0 && x2 == 0) {
        return true;
    } else {
        return false;
    }
}

	public static void main(String[] args) {
		
		System.out.println(isEven(24 , 11));
	

	}
}
