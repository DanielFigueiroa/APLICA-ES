package recursao;

public class Ancestral {
	public static void imprimeFilhos(Pessoa pai) {
		if(pai !=null) {
			System.out.println("Pai1:"+pai.nome1);
			System.out.println("Pai2:"+pai.nome2);
			if(pai.filhoA!=null) {
				System.out.println("FilhoA:"+pai.filhoA.nome);
				System.out.println("FilhoB:"+pai.filhoB.nome);
				imprimeFilhos(pai.filhoA);
				
			}
		}
	}

	 //teste
	public static void main(String[]args) {
		Pessoa p7=new Pessoa();
		p7.ancestral=null;
		

		Pessoa p0=new Pessoa();
		p0.nome1="A";
		p0.nome2="B";
		p0.filhoA=null;
		p0.filhoB=null;
		p7.filhoA=p0;
		p7.filhoB=p0;
		

		Pessoa p8=new Pessoa();
		p8.ancestral=null;
		
		Pessoa p01=new Pessoa();
		p01.nome1="C";
		p01.nome2="D";
		p01.filhoA=null;
		p01.filhoB=null;
		p8.filhoA=p01;
		p8.filhoB=p01;
		p01.ancestral1=p7;
		p01.ancestral2=p7;

		Pessoa p0012=new Pessoa();
		p0012.nome1="E";
		p0012.nome2="F";
		p0012.filhoA=null;
		p0012.filhoB=null;
		p0012.ancestral1=p01;
		p0012.ancestral2=p01;

		p01.filhoA=p0012;
		p01.filhoB=p0012;

		Pessoa p00123=new Pessoa();
		p00123.nome1="G";
		p00123.nome2="H";
		p00123.filhoA=null;
		p00123.filhoB=null;
		p00123.ancestral2=p0012;
		p00123.ancestral2=p0012;

		p0012.filhoA=p00123;
		p0012.filhoB=p00123;

		imprimeFilhos(p7);
		imprimeFilhos(p8);
	}
}
