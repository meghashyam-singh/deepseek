package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greet")
public class GreetingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String button = request.getParameter("button");
        String message = "";
        
        if ("shaym".equals(button)) {
            message = "hi meghashyam";
        } else if ("maa".equals(button)) {
            message = "hi amma";
        } else if ("nishi".equals(button)) {
            message = "hi nishi";
        } else if ("daa".equals(button)) {
            message = "hi dada";
        } else {
            message = "hi unknown";
        }
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Greeting</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; margin: 40px; text-align: center; }");
        out.println(".message { font-size: 24px; color: #333; margin: 20px; padding: 20px; border: 2px solid #4CAF50; border-radius: 10px; display: inline-block; }");
        out.println(".back-btn { margin-top: 20px; padding: 10px 20px; background-color: #4CAF50; color: white; border: none; border-radius: 5px; cursor: pointer; }");
        out.println(".back-btn:hover { background-color: #45a049; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"message\">" + message + "</div>");
        out.println("<br>");
        out.println("<button class=\"back-btn\" onclick=\"window.location.href='index.html'\">Back to Home</button>");
        out.println("</body>");
        out.println("</html>");
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}
