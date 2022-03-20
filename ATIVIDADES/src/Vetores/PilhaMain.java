package Vetores;

import java.util.Stack;

public class PilhaMain {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		
		 System.out.println(stack.isEmpty()); //esta vazia
		 
		 stack.push(1); //emplihar
		 stack.push(2);
		 stack.push(3);
		 
		 System.out.println(stack.isEmpty());
		 System.out.println(stack.size()); //tamanho
		 System.out.println(stack); //toString
		
		 System.out.println(stack.peek()); //topo da pilha
		 
		 System.out.println(stack.pop()); //desempilha
		 
		 System.out.println(stack);

	}

}


