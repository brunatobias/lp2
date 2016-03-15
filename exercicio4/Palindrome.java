public class Palindrome{

	public static void main(String[] args){
	String parametro = args[0];
	String final;
	String verificar = parametro;
	final = verificar;
	int tmnh, a, b, tp, posi1=0, posi2=0,teste;
	boolean i = false;
		tp = verificar.length();
		tmnh = verificar.length();
	while (tp > 1 && i == false){
		a = tp;
		for(posi1=0; posi2 <= posi2; posi1++){
			b = posi1 + x;
			verificar = final.substring(posi1,b);
		
		StringBuffer recebe = new StringBuffer(verificar);
		recebe.reverse();
		String inverso = recebe.toString();
		if(verificar.equals(inverso)){
		teste = b - 1;
		System.out.println(verificar);
		System.out.println("Posição: " + posi1 + " a " + teste);
		i = true;
			}
		}
			posi2++;
			tp--;
		}
	}
}
