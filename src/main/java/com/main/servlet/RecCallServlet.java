/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.main.servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

public class RecCallServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fromNumber = request.getParameter("From");
        String toNumber = request.getParameter("To");

        // You can add more logic here to handle the call as per your requirements
        
        // Return TwiML response
        response.setContentType("text/xml");
        response.getWriter().write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<Response><Say>Hello, thank you for calling!</Say></Response>");
    }
}