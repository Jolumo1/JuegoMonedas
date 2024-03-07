package pack;

public class Moneda {

	public String valor;
	public String posicion;
	
	Moneda(String valor, String posicion){
		
		this.valor=valor;
		this.posicion=posicion;
		
	}

	
	
	
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		
		return "Moneda [valor=" + valor + ", posicion=" + posicion + "]";
	}
	
	public void imprimirMonedas() {
		System.out.println("Sale una moneda de " + valor + " y cae " + posicion);
	}
	
	
		
}
