package exportador;

import java.util.Arrays;
import java.util.List;


public abstract class AbstractExportadorListaProduto implements ExportadorListaProduto{
	
	protected final List<String> TITULOS_COLUNAS = Arrays.asList("Id", "Descrição", "Marca", "Modelo", "estoque");
	
	
	@Override
	public String exportar(List<Produto> produtos) {
		
		final StringBuilder sb = new StringBuilder();
		
		sb.append(abrirTabela());

        sb.append(gerarColunasLinha(TITULOS_COLUNAS));
        
        sb.append(fecharLinhaTitulos());
        
        gerarLinhasProdutos(sb, produtos);

        sb.append(fecharTabela());
        
        return sb.toString();
        
	}
	
	
	 private void gerarLinhasProdutos(StringBuilder sb, List<Produto> listaProdutos) {
		 
	        for (Produto produto : listaProdutos) {
	        	
	            List<String> valoresCamposProduto =
	                    Arrays.asList(String.valueOf(produto.getId()),
	                                  produto.getDecricao(),
	                                  produto.getMarca(),
	                                  produto.getModelo(),
	                                  String.valueOf(produto.getEstoque()));
	            sb.append(gerarColunasLinha(valoresCamposProduto));
	            
	        }
	    }
	
	protected String gerarColunasLinha(List<String> valores) {
		
        StringBuilder sb = new StringBuilder();
        
        sb.append(abrirLinha());
        
        for (String valor : valores) {
        	
            sb.append(abrirColuna(valor));
            sb.append(fecharColuna());
            
            
        }
        
        sb.append(fecharLinha());
        
        return sb.toString();
    }

}
