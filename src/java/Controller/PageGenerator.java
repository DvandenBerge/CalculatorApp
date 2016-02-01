/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CircleAreaService;
import Model.RectangleAreaService;
import Model.TriangleAreaService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dvandenberge
 */
@WebServlet(name = "PageGenerator", urlPatterns = {"/PageGenerator"})
public class PageGenerator extends HttpServlet {

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
        try {
            
            String calcType=request.getParameter("calculator");
            double result=0;
            
            switch(calcType){
                case("rectangle"):
                    RectangleAreaService ras=new RectangleAreaService();
                    String userLen=request.getParameter("rectLength");
                    String userWid=request.getParameter("rectWidth");
                    result=ras.getArea(userLen, userWid);
                    break;
                case("circle"):
                    CircleAreaService cas=new CircleAreaService();
                    String userRad=request.getParameter("circleRadius");
                    result=cas.getArea(userRad);
                    break;
                case("triangle"):
                    TriangleAreaService tas=new TriangleAreaService();
                    String userBase=request.getParameter("triBase");
                    String userHeight=request.getParameter("triHeight");
                    result=tas.getArea(userBase, userHeight);
                    break;
            }
            
            request.setAttribute("result", result);
            RequestDispatcher view=request.getRequestDispatcher("/AreaResult.jsp");
            view.forward(request,response);
        }catch(Exception e){
            
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
