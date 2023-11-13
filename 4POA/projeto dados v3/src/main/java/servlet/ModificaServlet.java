package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Random;

/**
 * Servlet implementation class ModificaServlet
 */
public class ModificaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tipoDado = request.getParameter("tipoDado");

        if (tipoDado != null && !tipoDado.isEmpty()) {
            int numeroLados = Integer.parseInt(tipoDado);
            int resultado = rolarDado(numeroLados);

            HttpSession session = request.getSession();
            session.setAttribute("resultadoDado", resultado);

            response.sendRedirect("pag/res.jsp");
        } else {
            // Trate o caso em que o tipo de dado não foi selecionado adequadamente
            response.sendRedirect("pag/error.jsp");
        }
    }

    private int rolarDado(int numeroLados) {
        // Use a classe Random para gerar um número aleatório entre 1 e o número de lados do dado
        Random random = new Random();
        return random.nextInt(numeroLados) + 1;
    }

}