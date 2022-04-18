package week1.day2;

public class Calculator {
public static void main(String[]args) {
	Calculator KK= new Calculator();
	KK.MyCalculator();
	int Add=KK.addThreeNumbers(3,9,3);
	System.out.println(Add);
	int Sub=KK.subTwoNumbers(5,4);
	System.out.println(Sub);
	double Multiply=KK.multiplyTwoNumbers(9,9);
	System.out.println(Multiply);
	float Divide=KK.divideTwoNumbers(8,7);
	System.out.println(Divide);
}
public void MyCalculator() {
}
public int addThreeNumbers(int a,int b,int c) {
	return a+b;
}
public int subTwoNumbers(int a, int b) {
	return a-b;
}
public double multiplyTwoNumbers(double a, double b) {
	return a*b;
}
public float divideTwoNumbers(float a, float b) {
	return a/b;
}
}

