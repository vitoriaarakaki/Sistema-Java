package Cad.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Cad.Cliente.Cliente;
import Cad.Cliente.ClienteDAO;
import Cad.Cliente.Endereco;


@WebServlet("/cadastrar")
public class CadastroServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try(PrintWriter out = response.getWriter()) {
		String nome = request.getParameter("txtnome");
		String sobrenome = request.getParameter("txtsobrenome");
		Date dataNasc = converterDate(request.getParameter("txtdataNasc"));
		String documento = request.getParameter("txtdocumento");
		String telefone = request.getParameter("txttelefone");
		Endereco endereco = request.getParameter("txtendereco");
		String email = request.getParameter("txtemail");
		String user = request.getParameter("txtuser");
		String senha = request.getParameter("txtsenha");
		
		Cliente cliente = new Cliente(null, nome, sobrenome, dataNasc, documento, telefone, endereco, email, user, senha);
		ClienteDAO cDao = new ClienteDAO();
		cDao.cadastrar(cliente);
		
		out.println("<script type=\"text/javascript\">");  
		out.println("alert('Olhe o seu terminal e digite suas credenciaias do banco de dados ');"); 
		out.print("window.location.href = 'Index.html';");
		out.println("</script>");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private Date convereterDate(String dataString) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dataNova = null;
		
		try {
			dataNova = sdf.parse(dataString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dataNova;
	}
}
