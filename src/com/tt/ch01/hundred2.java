package com.tt.ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class hundred2 extends HttpServlet

{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
int total = 0;
for (int i = 0; i <= 100; i++)
{
	
total += i; 
}
response.setContentType("text/html;charset=utf-8");
PrintWriter out = response.getWriter();

out.println("<html>");
out.println("<head><title>1부터 100의 합</title></head>");
out.println("<body>");
out.printf("1+2+3..teetwfsdfwef...100 = %d",total);
out.println("</body>");
out.println("</html>");
}


	
}
