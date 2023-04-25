package avaliacao_aluno;

public class Aluno {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade () {
		return grade1 + grade2 + grade3;
	}
	
	public double missingPoints() {
		if (finalGrade() < 60) {
			return 60 - finalGrade();
		}
		else {
			return 0;
		}
	}
}

/*	PROJETO DE CLASSE (UML): ALUNO
	- Name: String
	- Grade1: double
	- Grade2: double
	- Grade3: double
	
	+ finalGrade() : double
	+ missingPoints() : double 
*/
