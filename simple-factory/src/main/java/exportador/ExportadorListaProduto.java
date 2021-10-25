package exportador;

import java.util.List;

public interface ExportadorListaProduto {
	
	String abrirTabela();
	String fecharTabela();
	String abrirLinha();
	String fecharLinha();
	String fecharLinhaTitulos();
	String abrirColuna(String valor);
	String fecharColuna();
	
	
	String exportar(List<Produto> produtos);
	
	static ExportadorListaProduto newInstance() {
		
		return newInstance();
		
	}
	
	static ExportadorListaProduto newInstance(String extensaoArquivoExportacao) {
		
		switch (extensaoArquivoExportacao) {
			
		case "csv":
			
			return new ExportadorListaProdutoCsv();
			
		default:
			
			throw new UnsupportedOperationException("Formato de arquivo não suportado: " + extensaoArquivoExportacao);
			
		}
		
	}

}
