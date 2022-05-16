package ar.edu.unju.edm.model;


import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	private double n1, n2;
	public Calculadora() {	
	}
	public Calculadora(double n1, double n2) {
		this.n1=n1;
		this.n2=n2;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double Suma() {
		double resultadoS;
		resultadoS=n1+n2;
		return resultadoS;
	}
	public double Resta() {
		double resultadoR;
		resultadoR=n1-n2;
		return resultadoR;
	}
	public double Division() {
		double resultadoD;
		if (n2<0) {
		resultadoD=n1/n2;
		return resultadoD;
		}
		else {
			return 0;
		}
	}
	public double Multiplicacion() {
		double resultadoM;
		resultadoM=n1*n2;
		return resultadoM;
	}
	public double Potencia() {
		double resultadoP;
		resultadoP = Math.pow(n1, n2);
		return resultadoP;
	}
	public double Raiz() {
		double resultadoRA;
		resultadoRA = Math.sqrt(n1);
		return resultadoRA;
	}
}