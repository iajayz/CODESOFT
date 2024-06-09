import java.util.Scanner;

public class GradeCalculater{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of subjects");
		int n=sc.nextInt();
		
		int[] marks=new int[n];
		int totalMarks=0;
		
		for(int i=0;i<n;i++){
			System.out.print("Enter the marks of the subject "+(i+1)+":");
			marks[i]=sc.nextInt();
			totalMarks += marks[i];
		}
		
		double avg=(double)totalMarks/n;
		char grade= calculateGrade(avg);
		
		System.out.println("\nRESULTS");
		System.out.println("TOTAL MARKS: "+totalMarks);
		System.out.println("Aversge Percentage: "+avg+"%");
		System.out.println("Grade: "+grade);
		
		sc.close();
	}
	
	private static char calculateGrade(double avg){
		if(avg>=90){
			return 'O';
		}
		else if(avg>=80 && avg<90){
			return 'A';
		}
		else if(avg>=70 && avg<80){
			return 'B';
		}
		else if(avg>=60 && avg<70){
			return 'C';
		}
		else if(avg>=50 && avg<60){
			return 'D';
		}
		else{
			return 'F';
		}
	}
}
