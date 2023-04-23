package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet("/today")
public class TodayServlet extends HttpServlet {

    public TodayServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.print("<a href=\"index.html\">메인화면</a>");
        out.print("<br><br><br><br>");

        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/M/d HH:mm"));
        out.print("<h1>현재시간 : " + now + "</h1>");
    }
}
