import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.text.StringEscapeUtils;

@WebServlet("/")
public class HelloServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()) {
			out.println("<html><body>");
			out.println("<h3>Wie lautet dein Name?</h3>");
			out.println("<form method='post'>");
			out.println("Nachname:");
			out.println("<input type='text' name='nachname'>");
			out.println("Vorname:");
			out.println("<input type='text' name='vorname'>");
			out.println("<input type='submit' value='So heiße ich!'>");
			out.println("</form>");
			out.println("</body></html>");
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()) {
			out.println("<html><body>");
			String nachname = StringEscapeUtils.escapeHtml4(request.getParameter("nachname"));
			String vorname = StringEscapeUtils.escapeHtml4(request.getParameter("vorname"));
			out.println("Herzlich willkommen, " + vorname + " " + nachname + "!");
			out.println("</body></html>");
		}
	}
}
