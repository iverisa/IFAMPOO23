public class Escola {

	public static void main(String[] args) {
		Aluno arianny;
		Aluno isadora;
		Aluno wallace;
		Aluno c;
		
		Curso analiseSistemas;
		Curso quimica;
		Curso engenhariaCivil;
		
		analiseSistemas = new Curso(); //agora ele existe na memória, está instanciado
		//o objeto de uma classe só pode receber instancias da mesma classe;
		
		quimica = new Curso();

		engenhariaCivil = new Curso(); 
		
		arianny = new Aluno();
		arianny.matricula = "2023008001";
		arianny.nome = "Arianny da Silva";
		arianny.curso = analiseSistemas;
		
		isadora = new Aluno();
		isadora.matricula = "2023008002";
		isadora.nome = "Isadora Cerdeira";
		isadora.curso = quimica;
		
		wallace = new Aluno();
		wallace.matricula = "2023008003";
		wallace.nome = "William Wallace";
		wallace.curso = engenhariaCivil;

		c = wallace;
		
		
		/* 
		System.out.printf("%s, de matricula %s é aluno(a) do curso %s.\n",
				isadora.nome, isadora.matricula, isadora.curso);
		
		System.out.printf("%s, de matricula %s é aluno(a) do curso %s.\n",
				arianny.nome, arianny.matricula, arianny.curso);

		System.out.printf("%s, de matricula %s é aluno(a) do curso %s.\n",
				wallace.nome, wallace.matricula, wallace.curso);
		 */
		
		mostrarAluno(isadora);
		mostrarAluno(arianny);
		mostrarAluno(wallace);
		mostrarAluno(c);
	}
		
	
	public static void mostrarAluno(Aluno aluno) {
		System.out.printf("%s, de matricula %s é aluno(a) do curso %s.\n",
				aluno.nome, aluno.matricula, aluno.curso.nome);
	}
}

