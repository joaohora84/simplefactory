package exportador;

import java.util.List;

public class ExportadorListaProdutoCsv extends AbstractExportadorListaProduto{

	@Override
	public String fecharLinhaTitulo() {
		// TODO Auto-generated method stub
		return "\n";
	}

	@Override
	public String abrirColuna(String valor) {
		// TODO Auto-generated method stub
		return ";";
	}

	@Override
	public String fecharLinha() {
		// TODO Auto-generated method stub
		return "\n";
	}

	@Override
	public String exportar(List<Produto> produtos) {
		
		
		
		return null;
	}

}
