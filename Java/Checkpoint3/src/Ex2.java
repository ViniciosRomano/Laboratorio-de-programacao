
public class Ex2 {
	
	public static void main(String[] args) {
		int i, Cont,soma, n;
		Cont = 0;
		n = 0;
		while(Cont<3)
		{
			n++;
			soma = 0;
			for (i = 1; i < n; i++)
			{
				if(n % i == 0)
					soma = soma + i;
			}	
				if(soma == n)
				{
					Cont++;
					System.out.println(n +"\té um número perfeito!");	
				}
			
		}
		

	}

}
