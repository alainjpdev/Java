
package web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet(name = "SesionesServlet", urlPatterns = {"/SesionesServlet"})
public class SesionesServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html;charset=UTF-8");
        
    }


}
