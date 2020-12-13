import java.util.ArrayList;

public class Estoque {
	
		private ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();

		public Estoque() {
			
		}
		
		public Estoque(ArrayList<Produtos> listaProdutos) {
			super();
			this.listaProdutos = listaProdutos;
		}
		
		public ArrayList<Produtos> getListaProdutos() {
			return listaProdutos;
		}
		
		public void setListaProdutos(ArrayList<Produtos> listaProdutos) {
			this.listaProdutos = listaProdutos;
		}

		public void cadastrar ( Produtos p) {
			listaProdutos.add(p);
		}
		
		public String listar() {
			String saida ="";
			
			int i = 1;
			for(Produtos p : listaProdutos) {
				saida += "\n ========== Nº DE PRODUTOS " + (i++) + " ==========\n";
				saida += p.detalhes() + "\n";
			}
			
			return saida;
		}
		
		public int pesquisar(String nome) {
			int qtd = 0;
			
			for(Produtos p : listaProdutos) {
				if(p.getNome().equals(nome)) {
					qtd++;
				}
			}
		    
			return qtd;
		}
		
		public boolean excluir(String nome) {
			for(Produtos p : listaProdutos) {
				if(p.getNome().equals(nome)) {
					listaProdutos.remove(p);
					return true;
				}
			}
			return false;
		}
		
		public double calcularTotalEstoque() {
			double total = 0;
			
			for(Produtos p : listaProdutos) {
				total += p.getPreco();
			}
			return total;
		}
}		
