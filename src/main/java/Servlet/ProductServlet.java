package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ProductService;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/product")
public class ProductServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private ProductService service = new ProductService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
        Long codigo = Long.parseLong(request.getParameter("codigo"));
        String descricao = request.getParameter("descricao");
        Double valor = Double.parseDouble(request.getParameter("valor"));
        
        Product product = new Product(1l, codigo, descricao, valor);
        
        String sql = this.service.salvarProduct(product);
        System.out.println(sql);
        
		try(PrintWriter out = response.getWriter()){
		        out.println(String.format("Codigo: %d",codigo));
		        out.println(String.format("Descrição: %s",descricao));
		        out.println(String.format("Valor: %.2f",valor));
		        out.println(String.format("Valor: %s",sql));
		}
	}

}
