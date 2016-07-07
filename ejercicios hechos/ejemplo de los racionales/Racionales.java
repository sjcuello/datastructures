public class Racionales {
	private int numerador;
	private int denominador;
	//constructores 
	public Racionales(int n,int d){
		numerador=n;
		denominador=d;
	}
	//metodos
	public Racionales sumar(Racionales other){
		Racionales r= new Racionales((this.numerador*other.denominador)+(other.numerador*this.denominador),(this.denominador*other.denominador));
		return r;
	}
	
		public Racionales restar(Racionales other){
		Racionales r= new Racionales((this.numerador*other.denominador)-(other.numerador*this.denominador),(this.denominador*other.denominador));
		return r;
	}
	
	public Racionales dividir(Racionales other){
		Racionales r= new Racionales((this.numerador*other.denominador),(this.denominador*other.numerador));
		return r;
	}
	public String toString(){
		return (this.numerador+"/"+this.denominador);
	}
}