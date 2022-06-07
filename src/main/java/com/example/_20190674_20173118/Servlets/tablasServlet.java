package com.example._20190674_20173118.Servlets;

import com.example._20190674_20173118.Beans.celebridadBean;
import com.example._20190674_20173118.Daos.CelebridadDaos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "tablasServlet", value = "/tablasServlet")
public class tablasServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<celebridadBean> listaCelebridad = CelebridadDaos.listarCelebridad();

        request.setAttribute("listaCelebridad",listaCelebridad);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("tabla.jsp");
        requestDispatcher.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
