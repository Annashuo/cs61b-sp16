public class DrawTriangle{
	public static void main(String[] args){
		DrawTriangle(6);
		
	}
	public static void DrawTriangle(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

