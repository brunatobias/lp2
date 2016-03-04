public class Aluno{
	String nome, numeroMatricula;
	int idade;
	public void ImprimirDadosCadastrais () {
		System.out.println( "Nome:" + this.nome + " Idade: " + this.idade + " Matricula: " + this.numeroMatricula);

	}

public static void main(String[] args) {
 Aluno aluno1 = new Aluno (); 
 Aluno aluno2 = new Aluno ();
 Aluno aluno3 = new Aluno ();
 Aluno aluno4 = new Aluno ();
 

 aluno1.nome = " Bruna ";
 aluno1.idade = 17;
 aluno1.numeroMatricula = "201418110035";
 aluno1.ImprimirDadosCadastrais();

 aluno2.nome = " Giovani ";
 aluno2.idade = 16;
 aluno2.numeroMatricula = "201418110123";
 aluno2.ImprimirDadosCadastrais();

 aluno3.nome = " Rafaela ";
 aluno3.idade = 17;
 aluno3.numeroMatricula = "201418110029";
 aluno3.ImprimirDadosCadastrais();

 aluno4.nome = " Sabrina ";
 aluno4.idade = 17;
 aluno4.numeroMatricula = "201418110511";
 aluno4.ImprimirDadosCadastrais();

}
}
