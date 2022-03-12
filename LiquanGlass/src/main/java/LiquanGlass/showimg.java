/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LiquanGlass;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class showimg extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        String img = request.getParameter("htmlImageFileName");
        String tmp[]=null;
        tmp=img.split("\\\\");
        tmp[0]=tmp[3].substring(0,tmp[3].length()-4);
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<!-- Required meta tags -->\n" +
"    <meta charset=\"utf-8\" />\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n" +
"\n" +
"    <!-- Bootstrap CSS -->\n" +
"    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\"\n" +
"        integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\" />\n" +
"    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.13.1/css/all.css\"\n" +
"        integrity=\"sha384-xxzQGERXS00kBmZW/6qxqJPyxW3UR0BPsL4c8ILaIWXva5kFi7TxkIIaMiKtqV1Q\" crossorigin=\"anonymous\" />\n" +
"\n" +
"    <link href=\"img/Logo.PNG\" rel=\"shortcut icon\" />\n" +
"    <link rel=\"stylesheet\" href=\"css/style.css\" />\n" +
"    <link rel=\"stylesheet\" href=\"css/responsive.css\" />\n" +
"\n" +
"    <link rel=\"stylesheet\" href=\"css/products/product_content.css\" />\n" +
"    <link rel=\"stylesheet\" href=\"css/products/hover-min.css\" />\n" +
"\n" +
"    <title>利銓玻璃</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='ifdiv'> <input class=\"color_control bimg\" value=\"#0000ff\" disabled />"+"<img class=\"bimg\" src='"+request.getParameter("htmlImageFileName")+"'>\n" +
"             \n" +
"            <div class=\"product_sidepanel-1 product_sidepanel\">\n" +
"                <div id=\"panelid\" class=\"panel_title col-lg-12\">\n" +
"                    <button class=\"panel_btn col-lg-6 hvr-underline-from-center\">\n" +
"                        樣式與品項\n" +
"                    </button>\n" +
"                </div>\n" +
"                <div id=\"panelid\" class=\"panel col-lg-12\">\n" +
"                    <div class=\"panel_content col-lg-12\">\n"
                    + "<div>"
                    + "<p >品名:"+tmp[0]+"</p>"
                    + "<p >顏色</p>" +
"                        <div><button class=\"co_set color1\"></button>"
                    + "<button class=\"co_set color2\"></button>"
                    + "<button class=\"co_set color3\"></button>"
                    + "<button class=\"co_set color4\"></button>"
                    + "<button class=\"co_set color5\"></button>"
                    + "<button class=\"co_set color6\"></button><div></div>"
                            + "<a  href=\""+img+"\" target=\"_blank\">\n" +
"                        <button  style=\"z-index: auto; background-color:black;\">\n" +
"                            <p >放大圖示</p>\n" +
"                        </button>\n" +
"                    </a>" +
                         
"                        \n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
           " </div>\n" +             
"                    \n" +
"            </div><script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"\n" +
"        integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\n" +
"        crossorigin=\"anonymous\"></script>\n" +
"    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.js\"></script>\n" +
"    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"\n" +
"        integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\"\n" +
"        crossorigin=\"anonymous\"></script>\n" +
"    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"\n" +
"        integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\"\n" +
"        crossorigin=\"anonymous\"></script>\n" +
"\n" +
"    <script src=\"js/products/product_content.js\"></script>");
            out.println("</body>");
            out.println("</html>");
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

    private String substring(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
