import java.util.*;
import java.io.*;


public class primary {
	 
	 
	
	public static void main(String[] args) throws Exception {
		File file = new File("div7.in");
		Scanner kb = new Scanner (file);
		FileWriter writer = new FileWriter("div7.out");
		
		int n = (int) kb.nextLong();
		int [] arr = new int [n];
		for (int i=0; i<n; i++) {
			int temp = (int) (kb.nextLong() % 7);
			
			arr[i] = temp;
			
		}
		ArrayList<Integer> sols = new ArrayList<Integer>(); 
	
		
		
			for (int k=n; k>=0; k--) {
			
				int windowsum = 0;
		
				for (int i=0; i<k; i++) {
					windowsum+=arr[i];
				}
			if (windowsum%7==0) {
				sols.add(k);
			}
				for (int a=k; a<n; a++) {
					
					
					if (windowsum%7==0) {
						
						sols.add(k);
							break;
					}
					
					windowsum+=(arr[a]-arr[a-k]);
					
					
					
					
				}
				System.out.println();
				
			
				
			
		 
			
		 
			}
			Collections.sort(sols);
			if (sols.size()==0) {
				writer.write("0");
			}
			else {
			writer.write(String.valueOf(sols.get(sols.size()-1)));
			}
		
	
		
		writer.close();
		kb.close();
		 
	}

	
}