<%-- 
    Document   : calculadora
    Created on : 13/12/2018, 15:55:57
    Author     : thaysevscncls
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="GET" action="CalcThay/Calculador">
            <label>Número 1:</label><input id="val1" type="text" name="n1" >
            <label>Número 2:</label><input id="val2" type="text" name="n2" > <br><br>
            
             Resultado: <% request.getAttribute("result");%>
             <br> <br>
            <input type="submit" id="somar" name="op" value="Somar">
            <input type="submit" id="sub" name="op" value="Subtrair">
            <input type="submit" id="dividir" name="op" value="Dividir">
            <input type="submit" id="mult" name="op" value="Multiplicar">
            
        </form>
    </body>
</html>
