package JavaQuirks;

public class NestedMath {
        public static void main(String [] args)
        {
        int [] a = {4};
		int [] b = {3};
		int [] c = {8};
		int [] d = {2};
		
		
		int min = Math.min(
		    Math.min(a[0],b[0]),
		    Math.min(c[0],d[0])
		    
		    );
		    
		    System.out.println(min);
        }
}
