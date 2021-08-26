/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.dao.ContactoDAO;
import modelo.dto.ContactoDTO;

/**
 *
 * @author Edgar
 */
public class ContactoCTO extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("AQUI SI LLEGA");
        String accion = request.getParameter("accion");
        switch (accion){
            case "crear":{
                String nombre = request.getParameter("txtNombre");
                String correo = request.getParameter("txtCorreo");
                String asunto = request.getParameter("txtAsunto");
                String mensaje = request.getParameter("txtMensaje");
                //
                ContactoDTO dto = new ContactoDTO(nombre,correo,asunto,mensaje);
        
                ContactoDAO dao = new ContactoDAO();
                boolean rest = dao.crear(dto);
                if(rest){
                    PrintWriter out = response.getWriter();
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>respuesta</title>");
                    out.println("</head>");
                    out.println("<body>"
                            + "<h1>Su comentario fue enviado con éxito</h1><a href='index.jsp'>Volver</a>"
                            + "</body>");
                    out.println("</html>");
                }
        
                break;
            }
            case "listar":{
                ContactoDAO dao = new ContactoDAO();
                List<ContactoDTO> list = dao.readAll();
                PrintWriter out = response.getWriter();
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>respuesta</title>");
                    out.println("<style>"
                                +"table,th,td{"
                                +"border: 1px solid black;"
                                +"border-collapse: collapse;"
                                + "}"
                                +"</style>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<table>");
                    out.println("<th>Nombre</th>");
                    out.println("<th>Correo</th>");
                    out.println("<th>Asunto</th>");
                    out.println("<th>Comentario</th>");
                    
                    for(ContactoDTO i : list){
                        out.println("<tr>");
                        out.println("<td>"+i.getNombre()+"</td>");
                        out.println("<td>"+i.getCorreo()+"</td>");
                        out.println("<td>"+i.getAsunto()+"</td>");
                        out.println("<td>"+i.getComentario()+"</td>");
                        out.println("</tr>");
                    }  
                    out.println("</table>");
                    out.println("</body>");
                    out.println("</html>");
               
                break;
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
