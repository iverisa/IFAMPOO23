public class Escola {

	public static void main(String[] args) {
		Aluno arianny;
		Aluno isadora;
		Aluno wallace;
		Aluno c;
		
		arianny = new Aluno();
		arianny.matricula = "2023008001";
		arianny.nome = "Arianny da Silva";
		arianny.curso = "TADS";
		
		isadora = new Aluno();
		isadora.matricula = "2023008002";
		isadora.nome = "Isadora Cidreira";
		isadora.curso = "Licenciatura em Quimica";
		
		wallace = new Aluno();
		wallace.matricula = "2023008003";
		wallace.nome = "William Wallace";
		wallace.curso = "Engenharia Civil";

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
				aluno.nome, aluno.matricula, aluno.curso);
	}
}

