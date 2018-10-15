package ru.Ramazanov.enterprise.servlet.servlets;

import ru.Ramazanov.enterprise.servlet.Constant;
import ru.Ramazanov.enterprise.servlet.product.Product;
import ru.Ramazanov.enterprise.servlet.product.ProductBase;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/catalog")
public class CatalogServlet extends HttpServlet {


    private ProductBase productBase = ProductBase.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final ArrayList<Product> products = productBase.getListProduct();
        req.setAttribute(Constant.CATALOG, products);
        req.getRequestDispatcher("/WEB-INF/views/catalog.jsp").forward(req, resp);
    }
}
