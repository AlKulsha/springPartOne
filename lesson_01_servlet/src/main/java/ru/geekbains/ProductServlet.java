package ru.geekbains;

import ru.geekbains.persist.Product;
import ru.geekbains.persist.ProductRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/product")
public class ProductServlet extends HttpServlet {

    private ProductRepository productRepository;

    @Override
    public void init() throws ServletException {
        this.productRepository = new ProductRepository();
        productRepository.insert(new Product("prod1", 1000));
        productRepository.insert(new Product("prod2", 2000));
        productRepository.insert(new Product("prod3", 2300));
        productRepository.insert(new Product("prod4", 2040));
        productRepository.insert(new Product("prod5", 2004));
        productRepository.insert(new Product("prod6", 2004));
        productRepository.insert(new Product("prod7", 2008));
        productRepository.insert(new Product("prod8", 2040));
        productRepository.insert(new Product("prod9", 2009));
        productRepository.insert(new Product("prod10", 2010));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.println("<table>");
        pw.println("<tr>");
        pw.println("<th>Id<th/>");
        pw.println("<th>Title<th/>");
        pw.println("<th>Cost<th/>");
        pw.println("</tr>");
        for (Product product : productRepository.findAll()){
            pw.println("<tr>");
            pw.println("<td>" + product.getId() + "</td>");
            pw.println("<td>" + product.getTitle() + "</td>");
            pw.println("<td>" + product.getCost() + "</td>");
            pw.println("</tr>");
        }
        pw.println("</table>");
    }
}


