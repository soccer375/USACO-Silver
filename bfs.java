import java.util.*;
import java.io.*;


public class bfs {
	static int n;
	
	 
	
	public static void main(String[] args) throws Exception {
		File file = new File("input1.txt");
		Scanner kb = new Scanner (file);
		
		n = kb.nextInt();
		
		int [] [] matrix = new int [n][n];
		for (int i=0; i<n; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			matrix[a][b] = c;
		}
		 
			 bfsd(matrix);
		
	}

	public static void bfsd (int [] [] matrix) {
		Queue<Integer> q = new LinkedList<Integer>();
		 
		
		
		
		boolean [] visited = new boolean [n];
		for (int i=0; i<n; i++) {
			visited[i] = false;
		}
		q.add(0);
		while (!q.isEmpty()) {
			int nextNode;
			
			nextNode = q.remove();  
			
			if (visited[nextNode]==false) {
				visited[nextNode] = true;
				System.out.println("nextNode = " + nextNode);
				
				for (int i=0; i<n; i++) {
					if (matrix[nextNode][i] != 0 && !visited[i]) {
						q.add(i);
					}
				}
			}
		}
	}
	 
}
