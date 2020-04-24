package permuatation;

public class Permutation {
	
	public static boolean isPermutation(int[] A, int N) {
		byte[] map = new byte[N];
		for(int i = 0; i < N; map[i++] = 0);
		
		for(int i = 0; i < N; i++) {
			if(A[i] < 1 || A[i] > N || map[A[i]-1] == 1) return false;
			map[A[i]-1] = 1;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		int[] A = {2,5,1,3,4};
		System.out.println(isPermutation(A, 5));
	}

}
