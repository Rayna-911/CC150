import java.util.Random;


public class setRowColumnZero {
	private int[][] matrix;
	
	public setRowColumnZero(int m, int n){
		matrix = new int[m][n];
		Random val = new Random();
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j<n; j++){
				matrix[i][j] = val.nextInt(7);
			}
		}
	}
	
	public int[][] setZero1(){
		boolean[] row = new boolean[matrix.length];
		boolean[] col = new boolean[matrix[0].length];
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j<matrix[0].length; j++){
				if(matrix[i][j]==0){
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j<matrix[0].length; j++){
				if(row[i] || col[j]){
					matrix[i][j] = 0;
				}
			}
		}
		return matrix;
	}
	
	public String toString(){
		String s = "";
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j<matrix[0].length; j++){
				s += matrix[i][j]+" ";
			}
			s += "\n";
		}
		return s;
	}
	
	public static void main(String[] args) {
		setRowColumnZero test = new setRowColumnZero(3,2);
		System.out.println(test);
		test.setZero1();
		System.out.println("-----------------");
		System.out.println(test.toString());
	}
}
