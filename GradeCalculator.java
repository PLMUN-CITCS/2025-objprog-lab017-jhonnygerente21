import java.util.Scanner;

public class GradeCalculator{
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.In) {
	
	System.out.print("Enter the student's  numerical score: ");
	double score = scanner.nextDouble();

	char grade = determineGrade(Score);
	displayGrade(score, grade);

	scanner.close();
		
}
	public static char determineGrade(Double score) {
	
	if (score >=90) {
	 return 'A';
}else if (score >= 80) {
	return 'B';
}else if ( score >= 70) {
	return 'C';
}else if (score >= 60) {
	return 'D';
}else {
	return 'F';
}

}
	public static void displayGrade(double score, char grade) {
	System.out.printIn("The student's score is: " + score);
	System.out.printIn("The corresponding grade: " +grade);

}
}

