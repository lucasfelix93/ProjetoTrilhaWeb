package br.com.gcontato.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdicionaContatoServlet extends HttpServlet{
	
	public static final long serialVersionUID =1L;
	public AdicionaContatoServlet() {
		super();
	}
	
	@Override
	protected void service(HttpServletRequest request,
		HttpServletResponse response)
	throws ServletException, IOException{
		
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("txtNome");
		String endereco = request.getParameter("txtEndereco");
		String fone = request.getParameter("txtTelefone");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<fieldset>");
		out.println("<legend>Contato:</legend>");
		out.println("<table>");
		out.println("<td>" + nome + "</td>");
		out.println("</tr>");
		out.println("<td>" + endereco + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>" + fone + "</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</fieldset>");
		out.println("</body>");
		out.println("</html>");


	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		
	}
}