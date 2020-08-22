import java.util.*;
import java.io.*;
public class dfs  {
	static int n;
	public static void main (String [] args) throws Exception {
		File file = new File ("input1.txt");
		Scanner kb = new Scanner (file);
		
		n = kb.nextInt();
		
		int [] [] matrix = new int [n][n];
		for (int i=0; i<n; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			matrix[a][b]=c;
			matrix[b][a]=c;
		}
		dfsd(matrix);
	}
	public static void dfsd (int [] [] matrix) {
		boolean [] visited = new boolean [n];
		for (int i=0; i<n; i++) {
			visited[i] = false;
		}
		Stack stack = new Stack();
		
		stack.push(0);
		
		while (stack.isEmpty()==false) {
			int x = (int) stack.pop();
			
			if (visited[x]==false) {
				visited[x] = true;
				System.out.println("Next Node: " + x);
				
					for (int b=0; b<n; b++) {
						if (matrix[x][b]!=0 && visited[b]==false) {
							stack.push(b);
					}
				}
			}
		}
	}
	
	
	
}
