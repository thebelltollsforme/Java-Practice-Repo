import textiogui.TextIO;

public class chapter2practice7 {

	public static void main(String[] args) {
		String name;
		int exam1, exam2, exam3;
		int loopCounter = 0;
		int studentCount = 0;
		//sets up variables for the name, counter loops, and exams
		
		TextIO.readFile("testdata.txt");
		//picks the file to read from
		studentCount = TextIO.getlnInt();
		
		while (loopCounter < studentCount){
		name = TextIO.getln();
		exam1 = TextIO.getlnInt();
		exam2 = TextIO.getlnInt();
		exam3 = TextIO.getlnInt();
		
		double average = (exam1 + exam2 + exam3)/3;
		
		System.out.printf("The average score of %s was %1.1f", name, average);
		System.out.println();
	
		loopCounter ++;
		}
		System.out.println("There are " + studentCount + " total students!");
	}

}
