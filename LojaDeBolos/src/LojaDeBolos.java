import java.util.Scanner;

public class LojaDeBolos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner entradaString = new Scanner(System.in);
		Estoque estoque = new Estoque();
		int menu;
		double vInicial;
		double vFinal;
		Produtos objProduto;
		
		String nome;
		String tipo;
		double preco;
		double peso;
		
		do {
			exibirMenu();
			menu = entrada.nextInt();
			
			switch(menu) {
			case 1: //cadastro de produto
				System.out.println("========= CADASTRO DE PRODUTOS =========");
				System.out.println("Digite o tipo: ");
				tipo = entradaString.nextLine();
				System.out.println("Digite o nome: ");
				nome = entradaString.nextLine();
				System.out.println("Digite o preço: ");
				preco = entrada.nextDouble();
				System.out.println("Digite o peso: ");
				peso = entrada.nextDouble();
				
				//objeto da classe
				objProduto = new Produtos(tipo, nome, preco, peso);
				
				//guardar na lista
				estoque.cadastrar(objProduto);
				
				break;
			case 2: //Lista os produtos
				System.out.println("========= LISTANDO PRODUTOS =========");
				System.out.println(estoque.listar());
				break;
			case 3: //pesquisa
				System.out.println("========= PESQUISANDO PRODUTOS =========");
				System.out.println("Digite o nome do produto: ");
				nome = entradaString.nextLine();
				System.out.println("Existem " + estoque.pesquisar(nome) + " Produtos no Estoque");
				break;
			case 4: //Exclui do estoque
				System.out.println("========= EXCLUINDO PRODUTOS =========");
				System.out.println("Digite o nome do produto: ");
				nome = entradaString.nextLine();
				
				if( ! estoque.getListaProdutos().isEmpty()) {
					if(estoque.excluir(nome)) {
						System.out.println("Produto Excluido com Sucesso!!");
					}else {
						System.out.println("Produto não encontrado!");
					}
				}else {
					System.out.println("Produto não Existe no Estoque!");
				}
				break;
			case 5: //calcula o total do estoque em R$
				System.out.println("========= TOTAL EM R$ DE PRODUTOS NO ESTOQUE =========");
				System.out.println("O Total é de: " + String.format("R$ %.2f \n", estoque.calcularTotalEstoque()));
				break;
			default:
				System.out.println("Opção Inválida!!");
			}
			
		}while(menu != 7);
		
	}
	//Barra de Menu que será exibida para o usuário
	static void exibirMenu() {
		System.out.println("========== CHOCOLATE COM CAFÉ ==========");
		System.out.println("1 - CADASTRAR");
		System.out.println("2 - LISTAR");
		System.out.println("3 - PESQUISAR");
		System.out.println("4 - EXCLUIR");
		System.out.println("5 - TOTAL DO ESTOQUE");
		System.out.println("=======> Escolha uma opção: ");
	}
}
