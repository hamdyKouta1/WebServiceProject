/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.main.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.twilio.twiml.voice.Say;
import com.twilio.twiml.TwiMLException;
import com.twilio.twiml.VoiceResponse;




 import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RecSMSServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String from = request.getParameter("From");
        String body = request.getParameter("Body");

        // Handle the incoming SMS
        System.out.println("Received SMS from: " + from);
        System.out.println("Message body: " + body);

        // Send a response (optional)
        response.setContentType("text/xml");
        response.getWriter().println("<Response><Message>Hello, you sent: " + body + "</Message></Response>");
    }
}
