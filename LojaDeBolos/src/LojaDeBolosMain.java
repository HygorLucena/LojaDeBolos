
public class LojaDeBolosMain {

	public static void main(String[] args) {
		
		Produtos p = new Produtos("Bolo", "Bolo de chocolate", 20, 500);
		
		Estoque estoque = new Estoque();
		
		estoque.cadastrar(p);
		
		int i = 0;
		Produtos po[] = new Produtos[i];
	
		 po[0] = new Produtos("Bolo", "Bolo de cenoura", 14, 500);
		 
		 estoque.cadastrar(po[0]);
		 
			
	}

}
