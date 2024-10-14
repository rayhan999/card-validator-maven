

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ClientWS.CreditCardService;

/**
 * Servlet implementation class NC_convertor_servlet
 */
@WebServlet("/CreditCardValidationServlet")
public class CreditCardValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreditCardValidationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String cardNumber = request.getParameter("cardNumber");
	        String expDate = request.getParameter("expDate");

	       
	        int validationResult = CreditCardService.validateCard(cardNumber, expDate);



	   
	        String message;
	        switch (validationResult) {
	            case 0:
	                message = "Valid card.";
	                break;
	            case 1001:
	                message = "No card number provided.";
	                break;
	            case 1002:
	                message = "No expiration date provided.";
	                break;
	            case 1003:
	                message = "Invalid card type.";
	                break;
	            case 1004:
	                message = "Invalid card length.";
	                break;
	            case 1005:
	                message = "Failed Mod 10 checksum.";
	                break;
	            case 1006:
	                message = "Invalid expiration date.";
	                break;
	            default:
	                message = "Unknown error.";
	        }

	     
	        PrintWriter out = response.getWriter();
			if(cardNumber.equals("")||expDate.equals("")){
				out.write("error: Please, provide a value!");  
			}else{
				String result = "";
				
					result= message;
				
				out.write(result); 			
			}
						 
			out.flush();
		    out.close();
					 
		
	}

}
