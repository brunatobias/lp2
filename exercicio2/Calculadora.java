	public class Calculadora{
 
int x,y,soma,subtracao, multiplicacao;
float divisao;

public void soma(){
	soma=(x+y);
	System.out.println("A soma é " + this.soma);
}

public void subtracao(){
	
	subtracao = (x-y);	
	System.out.println("A subtração é " + this.subtracao);
	
}
	
	public void multiplicacao(){
	
	multiplicacao = (x*y);	
	System.out.println("A multiplicação é " + this.multiplicacao);
	
}
	
	public void divisao(){
	
	divisao = (x/y);	
	System.out.println("A divisão é " + this.divisao);
	
}
	
	public static void main (String [] args){
	Calculadora calc1 = new Calculadora();
	Calculadora calc2 = new Calculadora();
	Calculadora calc3 = new Calculadora();


	calc1.x = 6;
	calc1.y = 2;
	calc1.soma();
	calc1.subtracao();
	calc1.multiplicacao();
	calc1.divisao();

	calc2.x = 10;
	calc2.y = 2;
	calc2.soma();
	calc2.subtracao();
	calc2.multiplicacao();
	calc2.divisao();

	calc3.x = 15;
	calc3.y = 2;
	calc3.soma();
	calc3.subtracao();
	calc3.multiplicacao();
	calc3.divisao();


	}


}
