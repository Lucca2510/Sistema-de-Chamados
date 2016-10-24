import Persistencia.ChamadoDAO;
import Persistencia.TecnicoDAO;
import controle.ControladorPrincipal;

public class SistemaChamadosMain {
	
	public static void main(String[] args){
		
		new ControladorPrincipal().start();
                
                TecnicoDAO t = new TecnicoDAO();
                System.out.println(t.gerarCodigo());
                
                
	}
	
}
