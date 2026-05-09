<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.NumberDto"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b" %>
<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
        <title>trang jsp</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>

        <form action="TinhTongServlet" method="GET">
            Number 1: <input type="text" name="nb1" /> <br/>
            Number 2: <input type="text" name="nb2" /> <br/>



            <input type="submit" name="action" value="TinhTong"/>

            ${GIA_TRI_SE_TRA_VE_JSP} : ${TONG}
            ${LIST_NUMBER}
        </form>

        <h1>Scriptlet</h1>
        <%
            ArrayList<NumberDto> numberdtoList = (ArrayList<NumberDto>) request.getAttribute("LIST_NUMBER");
            if (numberdtoList == null || numberdtoList.isEmpty()) {
        %>
        <p> Danh sách tr?ng </p>
        <%
        } else {
            for (NumberDto numberDto : numberdtoList) {
        %>

        This is number 1: <p><%= numberDto.getNumber1()%></p>
        This is number 2: <p><%= numberDto.getNumber2()%></p>

        <%

                }
            }
        %>

        <h1>JSTL</h1>
        <b:if test="${empty LIST_NUMBER}">
            <p> Danh sách tr?ng </p>
        </b:if>

        <b:forEach items="${LIST_NUMBER}" var="number">
            This is number 1: <p>${number.number1}</p>
            This is number 2: <p>${number.number2}</p>

        </b:forEach>

    </body>
</html>
