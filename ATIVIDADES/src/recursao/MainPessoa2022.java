package recursao;

public class MainPessoa2022 {
	public static void imprimeFilhos(Pessoa pai) {
		if(pai !=null) {
			System.out.println("Pai:"+pai.nome);
			if(pai.filhoA!=null) {
				System.out.println("Filho:"+pai.filhoA.nome);
				if(pai.filhoB!=null) {
					System.out.println("Filho:"+pai.filhoB.nome);
					imprimeFilhos(pai.filhoA);
					imprimeFilhos(pai.filhoB);
				}
			}	
		}
	}
	
	//teste
		public static void main(String[]args) {
			Pessoa p7=new Pessoa();
			Pessoa p8=new Pessoa();
			p7.ancestral1=null;
			p8.ancestral2=null;
			
			Pessoa p0=new Pessoa();
			p0.nome1="Cain";
			p0.nome2="Link";
			p0.filhoA=null;
			p0.filhoB=null;
			p0.ancestral1=p7;
			p0.ancestral2=p8;
			p7.filhoA=p0;
			p8.filhoB=p0;

			Pessoa p01=new Pessoa();
			p01.nome1="Cain Filho";
			p01.nome2="Abel";
			p01.filhoA=null;
			p01.filhoB=null;
			p01.filhoA=p01;
			p01.filhoB=p01;
			p01.ancestral1=p0;
			p01.ancestral2=p0;

			Pessoa p0012=new Pessoa();
			p0012.nome1="Noé";
			p0012.nome2="Abiel";
			p0012.filhoA=null;
			p0012.filhoB=null;
			p0012.ancestral1=p01;
			p0012.ancestral2=p01;

			p01.filhoA=p0012;
			p01.filhoB=p0012;

			Pessoa p00123=new Pessoa();
			p00123.nome1="Thor";
			p00123.nome2="LOKI";
			p00123.filhoA=null;
			p00123.filhoB=null;
			p00123.ancestral1=p0012;
			p00123.ancestral2=p0012;

			p0012.filhoA=p00123;
			p0012.filhoB=p00123;

			imprimeFilhos(p7);
			imprimeFilhos(p8);
			
		}
}
