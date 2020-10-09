
public class Q11_Pattern_Numbers2 {

	public static void main(String[] args) {

		int k=4;
		
		 
		for(int i=1; i<=4;i++) {
			
			for(int x=1; x<i;x++) 	{
				System.out.print("  "); 
				}     
			
			for(int l=k; l>=1; l--) { 
				System.out.print(l + "   ");
			}
			System.out.println(); 
			k--;  
			}

	}

}
