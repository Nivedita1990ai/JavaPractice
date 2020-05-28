package javaInterviewQuestions;

public class ComplexAddWithClass52 {
	double real;
	double img;

	public ComplexAddWithClass52(double real, double img) {
		this.real = real;
		this.img = img;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ComplexAddWithClass52 n1 = new ComplexAddWithClass52(3, -8);
	ComplexAddWithClass52 n2 = new ComplexAddWithClass52(2, 2);
	ComplexAddWithClass52 n= add(n1, n2);
	System.out.println("Result : "+n.real+" + ("+n.img+")i");
	}

	public static ComplexAddWithClass52 add(ComplexAddWithClass52 n1, ComplexAddWithClass52 n2) {
		ComplexAddWithClass52 n = new ComplexAddWithClass52(0, 0);
		n.real = n1.real + n2.real;
		n.img = n1.img + n2.img;
		return n;
	}

}
