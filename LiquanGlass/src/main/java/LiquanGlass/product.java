/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LiquanGlass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class product extends HttpServlet {

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
        
        
        model a = new model();
        int i = 0;
        String ac = "",tmp="",projectDirectory = "", projectName = "",filename="",filepath="",status="",str="",k,strReadline=null,path;
        String s[] = null;
        String y[] = null;
        String z[] = null;
        File f = null;
        String q="";
        String[] Foldername = {"動物造型","器皿","藝術花容器"};
        
        k=request.getServletContext().getRealPath("/");
        s=k.split(".war");
        k=s[0];
        s=k.split("\\\\");
        projectName=s[s.length-1];
        k=request.getServletContext().getRealPath("/");
        s=k.split(projectName);
        projectDirectory=s[0];
        filepath=projectDirectory+projectName+"\\src\\main\\";
        for(String b:Foldername)
        {
            q=a.splitpath(filepath,b);
            a.savefile(q, filepath,b);
        }
        
        
       
        
        for(String x:Foldername)
        {
            filename=filepath+"java\\LiquanGlass\\"+x+".csv";
            f = new File(filename);
            status=f.exists() && f.isFile()? "Opening file succeeded":"Failed";

            if(f.isFile() && f.exists())
            {
                InputStreamReader readDevice = new InputStreamReader (new FileInputStream(f),"UTF-8"); // UTF-8 must be declared in Java
                BufferedReader bufferReader=new BufferedReader(readDevice);
                while ((strReadline=bufferReader.readLine()) != null) { // data row
                    y=strReadline.split(",");
                    str+="<div  class='list-1 morebutton2 bcmore img"+i+"'><form action='showimg' target='video'>"
                                    + "<input type='hidden' name='htmlImageFileName' value='"+y[0]+"'>"
                                    + "<input  type='image' class='morebutton2  img' name='submit' src='"
                                    + y[0]+"' />"+"</form></div> ";


                }

                bufferReader.close();
                if(f.exists() && f.isFile()) f=null; // close file
            }
            i++;
        }
        
       
            
            
        
        
        
        
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println(" <!-- Required meta tags -->\n" +
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
            out.println(" <!--================Header Menu Area =================-->\n" +
"    <header class=\"header_area\">\n" +
"        <div class=\"main_menu\">\n" +
"            <nav class=\"navbar navbar-expand-lg navbar-light\">\n" +
"                <div class=\"container box_1620\">\n" +
"                    <!-- Brand and toggle get grouped for better mobile display -->\n" +
"                    <a class=\"navbar-brand logo_h\" href=\"index.html\"><img src=\"img/Logo.PNG\"\n" +
"                            style=\"width: 50px; height: 50px;\" alt=\"\" />利銓玻璃</a>\n" +
"                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\n" +
"                        data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\n" +
"                        aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"                        <span class=\"icon-bar\"></span>\n" +
"                        <span class=\"icon-bar\"></span>\n" +
"                        <span class=\"icon-bar\"></span>\n" +
"                    </button>\n" +
"                    <!-- Collect the nav links, forms, and other content for toggling -->\n" +
"                    <div class=\"collapse navbar-collapse offset\" id=\"navbarSupportedContent\">\n" +
"                        <ul class=\"nav navbar-nav menu_nav ml-auto\">\n" +
"                            <li class=\"nav-item active\">\n" +
"                                <a class=\"nav-link\" href=\"index.html\">首頁</a>\n" +
"                            </li>\n" +
"                            <li class=\"nav-item\">\n" +
"                                <a class=\"nav-link\" href=\"concept.html\">理念</a>\n" +
"                            </li>\n" +
"                            <li class=\"nav-item\">\n" +
"                                <a class=\"nav-link\" href=\"news.html\">最新消息</a>\n" +
"                            </li>\n" +
"                            <li class=\"nav-item submenu dropdown\">\n" +
"                                <a href=\"product.html\" class=\"nav-link dropdown-toggle\" role=\"button\"\n" +
"                                    aria-haspopup=\"true\" aria-expanded=\"false\">產品</a>\n" +
"                                <ul class=\"dropdown-menu\">\n" +
"                                </ul>\n" +
"                            </li>\n" +
"                            <li class=\"nav-item\"><a class=\"nav-link\"  href=\"Academics.html\">技術與認證</a> </li>\n" +
"\n" +
"                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"Admission.html\">客戶服務</a></li>\n" +
"                        </ul>\n" +
"                        <ul class=\"nav navbar-nav navbar-right\">\n" +
"                            <li class=\"nav-item\">\n" +
"                                <a href=\"#\" class=\"search\"><i class=\"fas fa-search\"></i></a>\n" +
"                            </li>\n" +
"                        </ul>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </nav>\n" +
"        </div>\n" +
"    </header>\n" +
"\n" +
"    <div class=\"top\"></div>\n" +
"    <!-- ==================== Hero start====================  -->\n" +
"    <section>\n" +
"       \n" +
"        <div class=\"product_area col-lg-12\">\n" +
"             \n" +
"            \n" +
"            <div class=\"product_view_wrap col-lg-12\">\n" +
"                \n" +
"\n" +
"                \n" +
"                    <input class=\"color_control\" value=\"#0000ff\" disabled />\n" +
"                    \n" +
"                    <iframe name=\"video\" src=\"https://www.youtube.com/embed/uJwQVS00oGg\"  class=\"video\"  allowfullscreen=\"\" loading=\"lazy\" >\n" +
"                        \n" +
"                     </iframe>\n" +
"\n" +
"               \n" +
"\n" +
"               \n" +
"                \n" +
"            \n" +
"            </div>\n" +
"            \n" +
"            \n" +
"\n" +
"           \n" +
"\n" +
"\n" +
"            <div class=\"product_sidepanel  product_sidepanel ps-move product_sidepanel-2\" id=\"a11\">\n" +
"                <div id=\"start\" class=\"panel_btn \"><p id=\"s\" class=\"selectword\">全部</p></div>\n" +
"                <ul class=\"ul\">\n" +
"                    <li><div id=\"option1\" class=\" sel\"style=\"z-index: 10;\"><p>全部</p></div></li>\n" +
"                    <li><div id=\"option2\" class=\" sel\"><p>動物造型</p></div></li>\n" +
"                    <li><div id=\"option3\" class=\" sel\"><p>器皿類</p></div></li>\n" +
"                    <li><div id=\"option4\" class=\" sel\"><p>藝術花容器</p></div></li>\n" +
"                </ul>\n" +
"                <div class=\"panel_title col-lg-12\">\n" +
"                    \n" +
"                    \n" +
"                    \n" +
"                    <div class=\"panel_btn col-lg-6 hvr-underline-from-center morebutton\">商品</div>"+
"                        <button id=\"btncontent\" class=\"panel_btn col-lg-6 hvr-underline-from-center morebutton\">\n" +
"                            顯示更多\n" +
"                        </button>\n" +
"\n" +
"\n" +
"                    </div>\n" +
"                </form>\n" +
"                \n" +
"                    <div class=\"panel_content col-lg-12\" >\n" +
"                        \n" +
                         str +
"                        \n" +
"                        \n" +
"                    </div>\n" +
"                \n" +
"            </div> \n" +
"            <button class=\"btn_control btn_control-2 bc-move bcmore\" id=\"ggg33\">&lt</button>\n" +
"\n" +
"            \n" +
"        </div>\n" +
"    </section>\n" +
"    <!-- ==================== Hero end====================  -->\n" +
"    <!-- ==================== product List area start====================  -->\n" +
"    \n" +
"    <!-- ==================== product List area end====================  -->\n" +
"\n" +
"    <!-- Footer section -->\n" +
"    <footer class=\"footer-section\">\n" +
"        <div class=\"container\">\n" +
"            <div class=\"row\">\n" +
"                <div class=\"col-lg-5 col-md-2 col-sm-12\">\n" +
"                    <div class=\"footer-widget\">\n" +
"                        <a class=\"\" style=\"font-size: 1.5rem; color: #fff; text-decoration: none;\"\n" +
"                            href=\"index.html\"><img src=\"img/Logo.PNG\" class=\"mr-2\" style=\"width: 80px; height: 80px;\"\n" +
"                                alt=\"\" />利銓玻璃</a>\n" +
"                    </div>\n" +
"                </div>\n" +
"                <div class=\"col-lg-2 col-md-3 col-sm-4\">\n" +
"                    <div class=\"footer-widget\">\n" +
"                        <h5>連接</h5>\n" +
"                        <ul>\n" +
"                            <li><a href=\"\">首頁</a></li>\n" +
"                            <li><a href=\"\">理念</a></li>\n" +
"                            <li><a href=\"\">客戶服務</a></li>\n" +
"                        </ul>\n" +
"                    </div>\n" +
"                </div>\n" +
"                <div class=\"col-lg-2 col-md-3 col-sm-4\">\n" +
"                    <div class=\"footer-widget\">\n" +
"                        <h5>聲明</h5>\n" +
"                        <ul>\n" +
"                            <li><a href=\"\">網站聲明</a></li>\n" +
"                            <li><a href=\"\">隱私權聲明</a></li>\n" +
"                        </ul>\n" +
"                    </div>\n" +
"                </div>\n" +
"                <div class=\"col-lg-3 col-md-4 col-sm-4\">\n" +
"                    <div class=\"footer-widget\">\n" +
"                        <h5>社群</h5>\n" +
"                        <div class=\"footer-social\">\n" +
"                            <a href=\"\"><i class=\"fab fa-facebook\"></i></a>\n" +
"                            <a href=\"\"><i class=\"fab fa-linkedin\"></i></a>\n" +
"                            <a href=\"\"><i class=\"fab fa-twitter\"></i></a>\n" +
"                            <a href=\"\"><i class=\"fab fa-youtube\"></i></a>\n" +
"                            <a href=\"\"><i class=\"fab fa-instagram\"></i></a>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"copyright\">\n" +
"                利銓玻璃 &copy;\n" +
"                <script>\n" +
"                    document.write(new Date().getFullYear());\n" +
"                </script>\n" +
"                <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> 版權所有\n" +
"            </div>\n" +
"        </div>\n" +
"    </footer>\n" +
"    <!-- Footer section end-->\n" +
"\n" +
"    <!-- Optional JavaScript -->\n" +
"    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n" +
"    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"\n" +
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
"    <script src=\"js/products/product_content.js\" charset=\"UTF-8\"></script>");
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

}
