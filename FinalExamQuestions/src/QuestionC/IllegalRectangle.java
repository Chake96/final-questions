package QuestionC;

public class IllegalRectangle extends Exception{
	
	private int x;
	private int y;
	
	public IllegalRectangle(int x, int y){
		this.x = x;
		this.y = y;
	}

}
