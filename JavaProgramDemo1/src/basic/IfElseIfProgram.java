package basic;

public class IfElseIfProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks =1010;
		
		if(marks<40)
		{
			System.out.println("Fail");
		}
		else if(marks>=40 && marks<60)
		{
			System.out.println(" D grade");
		}
		else if(marks>=60 && marks< 70)
		{
			System.out.println(" C grade");
		}
		else if(marks>=70 && marks<80)
		{
			System.out.println("B grade");
		}
		else if(marks>=80 && marks<90)
		{
			System.out.println("A grade");
		}
		else if(marks>=90 && marks<100)
		{
			System.out.println("A+ grade");
		}
		else
		{
			System.out.println(" Invalid Marks");
		}
	}

}
