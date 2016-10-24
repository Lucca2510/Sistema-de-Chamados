import Persistencia.ClienteDAO;
import controle.ControladorPrincipal;

public class SistemaChamadosMain {
	
	public static void main(String[] args){
		
		new ControladorPrincipal().start();
                
                ClienteDAO c = new ClienteDAO();
                System.out.println(c.gerarCodigo());
	}
	
}
