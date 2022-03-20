package Vetores;

public class Fila<T>  {

	protected T[] elementos;
	protected int topo=0;

	public Fila(){
		super();
	}

	public Fila(int capacidade){
		super();
	}

	//Empty(verifiacar se a pilha esta vazia)
	public boolean estaVazia() {
		return this.topo == 0;
	}

	//Enquere
	public void enfileirar(T elemento) {
		this.elementos[this.topo] = elemento;
		this.topo++;

	}

	//Front
	public T espiar() {
		if(this.estaVazia()) {
			return null;
		}
		return this.elementos[0];
	}

	//Dequeue ou remove
	public T desenfileirar() {

		if(this.estaVazia()) {
			return null;
		}
		T elementosASerRemovido = this.elementos[0];
		for(int i = 0; i < this.topo - 1 ; i++) {	
			this.elementos[i] = this.elementos[i+1];
		}
		this.topo--;

		return elementosASerRemovido;
	}
	
	//Size(tamanho da pilha)
		public int tamanho() {
			return this.topo;
		}
}
