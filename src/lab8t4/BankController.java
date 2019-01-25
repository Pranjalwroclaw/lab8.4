package lab8t4;


import lab8t4.Customer;
import lab8t4.CustomerData;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/BankController")
public class BankController extends HttpServlet{
    
	private static final long serialVersionUID = 1L;
	private static CustomerData customers = new CustomerData();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String customerId = req.getParameter("customerId");
        Customer customer = customers.getCustomerById(Integer.parseInt(customerId));
        req.setAttribute("customer", customer);
        RequestDispatcher rd = req.getRequestDispatcher("customer.jsp");
        rd.forward(req,resp);
    }
    
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
}