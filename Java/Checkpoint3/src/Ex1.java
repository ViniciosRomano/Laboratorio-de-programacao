
public class Ex1 {

	public static void main(String[] args) {
		int a, b, c,trios;
		trios = 0;
		
		for(a = 1; a<= 100;a++){
			for(b = 1; b<= 100;b++){
				for(c = 1; c<= 100;c++){
					if(b > c && Math.pow(a,2) == Math.pow(b, 2)+ Math.pow(c, 2)){
						trios++;
						System.out.println("("+ a + ","+ b +","+c+")");
						
					}
					
				}
			}
		}
	System.out.println("\ntrios= "+ trios);

	}
}
