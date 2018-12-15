/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thaysevscncls
 */
@WebServlet(name = "Calculador", urlPatterns = {"/Calculador"})
public class Calculador extends HttpServlet {

    float resultado;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/calculadora.jsp").forward(request, response);
        String valor1 = request.getParameter("va11");
        String valor2 = request.getParameter("val2");
        String operacao = request.getParameter("op");

        float v1 = Float.parseFloat(valor1);
        float v2 = Float.parseFloat(valor2);

        switch (operacao) {
            case "soma":
                request.setAttribute("result", soma(v1, v2));
                break;
            case "sub":
                request.setAttribute("result", subtracao(v1, v2));
                break;
            case "mult":
                request.setAttribute("result", multiplicacao(v1, v2));
                break;
            case "div":
                request.setAttribute("result", divisao(v1, v2));
                break;
        }

    }

    private float soma(float v1, float v2) {
        resultado = v1 + v2;
        return resultado;
    }

    private float subtracao(float v1, float v2) {
        resultado = v1 - v2;
        return resultado;
    }

    private float multiplicacao(float v1, float v2) {
        resultado = v1 * v2;
        return resultado;
    }

    private float divisao(float v1, float v2) {
        resultado = v1 / v2;
        return (float) resultado;
    }
}
