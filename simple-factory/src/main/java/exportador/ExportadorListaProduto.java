package exportador;

import java.util.List;

public interface ExportadorListaProduto {
	
	
	String fecharLinhaTitulo();
	String abrirColuna(String valor);
	String fecharLinha();
	
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
