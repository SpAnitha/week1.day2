package week1.day2;

public class LearnMethods {
	public static void main(String[] args) {
	LearnMethods LM = new LearnMethods();
	LM.carName();
	int RegNumber= LM.getCarRegNumber();
	     System.out.println(RegNumber);
	     String Varient=LM.getCarVarient();
	          System.out.println(Varient);
	          int Multiply=LM.multiplyTwoNumbers(8,6);
	          System.out.println(Multiply);
	}
	
	
	
	public void carName() {
		System.out.println("kwid");
	}
	public int getCarRegNumber(){
		int CarRegNumber= 3333;
		return CarRegNumber;
	}
public String getCarVarient() {
	return "petrol";
}
public int multiplyTwoNumbers(int a,int b) {
	return a*b;
}
}
