import java.util.ArrayList;
import java.util.List;

import exportador.ExportadorListaProduto;
import exportador.Produto;

public class Principal {
	
	public static void main(String[] args) {
		
		final List<Produto> produtos = new ArrayList<>();
		
        produtos.add(new Produto("TV", "LG", "1234-A", 1200));
        produtos.add(new Produto("Notebook", "Asus", "Predator", 850));
        produtos.add(new Produto("Geladeira", "Eletrolux", "Delux", 400));

        ExportadorListaProduto exportadorMarkdown = ExportadorListaProduto.newInstance("csv");
        System.out.println("Lista de Produtos em CSV\n");
        System.out.println(exportadorMarkdown.exportar(produtos));
		
	}

}
