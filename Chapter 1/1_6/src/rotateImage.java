import java.util.Random;


public class rotateImage {
	private int[][] image;
	
	public rotateImage(int n){
		image = new int[n][n];
		Random pixel = new Random();
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				image[i][j] = pixel.nextInt(7);
			}
		}
	}
	
	public int[][] rotateImageCW1(){
		//rotate 90 degree clock-wise
		//transpose image, then row.reverse
		for(int i = 0; i < image.length; i++){
			for(int j = i; j < image.length; j++){
				int tmp1 = image[i][j];
				image[i][j] = image[j][i];
				image[j][i] = tmp1;
			}
		}
		
		
		for(int i = 0; i < image.length; i++){
			for(int j = 0; j < image.length/2; j++){
				int tmp1 = image[i][j];
				image[i][j] = image[i][image.length-j-1];
				image[i][image.length-j-1] = tmp1;
			}
		}
		return image;
	}
	
	public int[][] rotateImageACW1(){
		//rotate 90 degree anti-clock-wise
		//transpose image, then column.reverse
		for(int i = 0; i < image.length; i++){
			for(int j = i; j < image.length; j++){
				int tmp1 = image[i][j];
				int tmp2 = image[j][i];
				image[i][j] = tmp2;
				image[j][i] = tmp1;
			}
		}
		
		for(int i = 0; i < image.length/2; i++){
			for(int j = 0; j < image.length; j++){
				int tmp1 = image[i][j];
				image[i][j] = image[image.length-1-i][j];
				image[image.length-1-i][j] = tmp1;
			}
		}
		return image;
	}
	
	public String toString() {
		String s = "";
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[0].length; j++) {
				s = s + image[i][j] + " ";
			}
			s = s + "\n";
		}
		return s;
	}

	
	public int[][] rotateImageCW2(){
		for(int i = 0; i < image.length/2; ++i){
			int first = i;
			int last = image.length-1-i;
			for(int j = first; j<last; ++j){
				int offset = i-first;
				int top = image[first][i];
				// left -> top
				image[first][i] = image[last-offset][i];
				// bottom -> left
				image[last-offset][i] = image[last][last-offset];
				// right -> bottom
				image[last][last-offset] = image[i][last];
				// top -> right
				image[i][last] = top;
			}
		}
		return image;
	}
	
	public int[][] rotateImageACW2(){
		for(int i = 0; i < image.length/2; ++i){
			int first = i;
			int last = image.length-1-i;
			for(int j = first; j<last; ++j){
				int offset = i-first;
				int top = image[first][i];
				// right -> top
				image[first][i] = image[i][last];
				// bottom -> right
				image[i][last] = image[last][last-offset];
				// left -> bottom
				image[last][last-offset] = image[last-offset][i];
				// top -> left
				image[last-offset][i] = top;
			}
		}
		return image;
	}
	
	public static void main(String[] args) {
		rotateImage test = new rotateImage(2);
		System.out.println(test);
		test.rotateImageACW2();
		System.out.println("-----------------");
		System.out.println(test.toString());
	}
}
