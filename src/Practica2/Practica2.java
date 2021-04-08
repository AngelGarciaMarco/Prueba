package Practica2;

public class Practica2 {
	



	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public double getT() {
		return t;
	}
	public void setT(double t) {
		this.t = t;
	}
	public double getL() {
		return l;
	}
	public void setL(double l) {
		this.l = l;
	}
	public double getM() {
		return m;
	}
	public void setM(double m) {
		this.m = m;
	}
	public double getN() {
		return n;
	}
	public void setN(double n) {
		this.n = n;
	}
	public double getF() {
		return f;
	}
	public void setF(double f) {
		this.f = f;
	}
	public double getBa() {
		return ba;
	}
	public void setBa(double ba) {
		this.ba = ba;
	}
	public double getAl() {
		return al;
	}
	public void setAl(double al) {
		this.al = al;
	}
	public double getL1() {
		return l1;
	}
	public void setL1(double l1) {
		this.l1 = l1;
	}
	public double getL2() {
		return l2;
	}
	public void setL2(double l2) {
		this.l2 = l2;
	}
	public double getL3() {
		return l3;
	}
	public void setL3(double l3) {
		this.l3 = l3;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	int a=0;
	int b=0;
	int e=0; 

	double t=0;
	double l=0;
	double m=0;
	double n=0;
	double f=0;
	double ba=0;
	double al=0;
	double l1=0;
	double l2=0;
	double l3=0;
	double r=0;

	double pi=3.14;

	public void areacuadrado() {
		t = getL() * getL();
		System.out.println("El area es : " + t);
	}
	public void pcuadrado() {
		t = getL() + getL() + getL()+ getL();
		System.out.println("El perimetro es : " + t);
	}
	public void areatriangulo() {
		t = (getBa() * getAl())/2 ;
		System.out.println("El area es : " + t);
	}
	public void ptriangulo() {
		t = getL1() + getL2() + getL3() ;
		System.out.println("El perimetro es : " + t);
	}
	public void areaciruclo() {
		t = pi * (getR() *getR());
		System.out.println("El area es : " + t);
	}
	public void pcirculo() {
		t = (2*pi) * getR() ;
		System.out.println("El perimetro es : " + t);
	}
	
	public void mayormenor() {
		if(l>m && m>n) {
			System.out.println("El orden sería: "+l+">"+m+">"+n+"\n");
		}
		else if(l>n && n>m){
			System.out.println("El orden sería: "+l+">"+n+">"+m+"\n");
		}
		else if(m>l && l>n){
			System.out.println("El orden sería: "+m+">"+l+">"+n+"\n");
			}
		else if(m>n && n>l){
			System.out.println("El orden sería: "+m+">"+n+">"+l+"\n");
		}
		else {
			System.out.println("El orden sería: "+n+">"+m+">"+l+"\n");
		}
		
	}
	public void elevar() {
		if(e>=0){
			for(int i=1; i<=e; i++){
				r=r*b;	
				}
				System.out.println("El número "+b+" elevado a "+e+" es: "+r+"\n");
				}

			else {
				System.out.println("Solo números positivos y enteros"+"\n");
				}
	}	
	
	
	
}
