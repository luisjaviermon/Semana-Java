import java.util.Scanner;

public class CalComplejos{
	Scanner teclado = new Scanner(System.in);
	double real_1;
	double im_1;
	double real_2;
	double im_2;
	double real_f;
	double im_f;

	public void PedirZ1(){
		System.out.println("**********Primer numero complejo (Z1)************\n");
		System.out.println("Ingrese la parte real");
		this.real_1= this.teclado.nextDouble();
		System.out.println("Ingrese la parte imaginaria");
		this.im_1 = this.teclado.nextDouble();
	}

	public void PedirZ2(){
		System.out.println("**********Segundo numero complejo (Z2)************\n");
		System.out.println("Ingrese la parte real: ");
		this.real_2= this.teclado.nextDouble();
		System.out.println("Ingrese la parte imaginaria: ");
		this.im_2 = this.teclado.nextDouble();
	}

	public void impRes(){
		if(this.im_f < 0){
			System.out.println("Resultado: " + this.real_f + " " + this.im_f + "i");
			}else{
				System.out.println("Resultado: " + this.real_f + "+" + this.im_f + "i");
			}
	}

	public void Suma(){
		this.real_f = this.real_1 + this.real_2;
		this.im_f = this.im_1 + this.im_2;
	}

	public void Resta(){
		this.real_f = this.real_1 - this.real_2;
		this.im_f = this.im_1 - this.im_2;
	}

	public void Mult(){
		this.real_f = (this.real_1*this.real_2) - (this.im_1*this.im_2);
		this.im_f = (this.real_1*this.im_2) + (this.im_1*this.real_2); 
	}

	public void Div(){
		this.real_f = ((this.real_1*this.real_2) + (this.im_1*this.im_2)) / (Math.pow(real_2,2) + Math.pow(im_2,2));
		this.im_f = ((this.im_1*this.real_2) - (this.real_1*this.im_2)) / (Math.pow(real_2,2) + Math.pow(im_2,2));
	}

	public double Ang(){
		return ((Math.atan2(this.im_1, this.real_1)*180)/Math.PI);
	}

	public double Mod(){
		return Math.sqrt(Math.pow(this.real_1,2) + Math.pow(im_1,2));
	}
}