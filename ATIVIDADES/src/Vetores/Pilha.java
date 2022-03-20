package Vetores;

public class Pilha<T>  {

	protected T[] elementos;
	protected int topo = 0;

	public Pilha() {
		super();
	}

	@SuppressWarnings("unchecked")
	public Pilha(int capacidade) {
		this.elementos = ((T[])new Object[capacidade]);
		this.topo = 0;
	}

	//Empty(verifiacar se a pilha esta vazia)
	public boolean estaVazia() {
		return this.topo == 0;
	}

	//Push(empilhar)
	protected boolean adiciona1(T elemento) {

		if(this.topo < this.elementos.length) {
			this.elementos[this.topo] = elemento;
			this.topo++;
			return true;
		} 
		return false;
	}

	//Stackpop (elemento superior da pilha sem remover)
	public T topo() {

		if(this.estaVazia()) {
			return null;
		} 
		return this.elementos[topo];
	}

	// Pop (desempilha)
	public T desempilha() {

		if(this.estaVazia()) {
			return null;
		}

		T elemento = this.elementos[topo-1];
		topo--;
		return elemento;
	}

	//Size(tamanho da pilha)
	public int tamanho() {
		return this.topo;
	}

}
