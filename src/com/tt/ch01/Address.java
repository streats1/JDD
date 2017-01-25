package com.tt.ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tt.ch01.Address.address;
@WebServlet("/Address")
public class Address extends HttpServlet
{
public class address {

	}
second a = null;
	@Override

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
		 a = new second();
a.setName(request.getParameter("setName"));
a.setAddress(request.getParameter("setAddress"));
a.setAge(request.getParameter("setAge"));
a.setPhoneNum(request.getParameter("setPhoneNum"));
 


PrintWriter out = response.getWriter();
out.println("<html>");
out.println("<head><title>question book</title></head>");
out.println("<body>");
out.printf("이름 : %s<br>",a.getName());
out.printf("주소 : %s<br>",a.getAddress());
out.printf("나이 : %s<br>",a.getAge());
out.printf("전화번호 : %s<br>",a.getPhoneNum());

out.println("</body>");
out.println("</html>");


}
}