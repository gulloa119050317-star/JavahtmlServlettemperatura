/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class TemperaturaServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TemperaturaServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TemperaturaServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String txttemperatura = request.getParameter("temperatura"); 
        String conversion = request.getParameter("conversion"); 
        
        double temperatura = Double.parseDouble(txttemperatura);
        ConversorTemperatura conversor = new ConversorTemperatura();
        double resultado = conversor.convertir(temperatura, conversion);

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado de la conversión</h1>");
            out.println("<p>Temperatura: " + temperatura + "</p>");
            out.println("<p>Conversión: " + conversion + "</p>");
            out.println("<p>Resultado: " + resultado + "</p>");
            out.println("</body>");
            out.println("</html>");

        }
    
    } 
        
    }

  


