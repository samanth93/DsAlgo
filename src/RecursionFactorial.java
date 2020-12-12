
public class RecursionFactorial {
	public static void main(String[] args) {
		int num =3;
		System.out.println(recusiveFunc(num));
	}

	private static int recusiveFunc(int num) {
		if(num==0) {
			return 1;
		}
		return num*recusiveFunc(num-1);
	}
}
