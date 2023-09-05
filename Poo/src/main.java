

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println( calcular(100) );


	}
	
	
	public static String calcular(int a){
	int   c = 0,ca  = a;
	int [] valor = new int[100];
	while (ca != 0) {
		if ((ca % 2 != 0)&&(ca % 4 != 0)) {

			valor[ca] = ca;  
		} else {
			ca--; continue;
		}

		ca--;

	}
	while(c < 100) {           
		if(valor[c]== 0 ) {
			
		}else {
		System.out.println(valor[c]);
		}
		c++;
		
	}                  
	 	String f = "Fim!";
		return f;
	}
}
