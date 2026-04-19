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

        <form action="TinhTongServlet" method="POST">
            Number 1: <input type="text" name="nb1" /> <br/> 20
            Number 2: <input type="text" name="nb2" /> <br/> 30


            <input type="submit" name="action" value="TinhTong"/>

        ${GIA_TRI_SE_TRA_VE_JSP} : ${TONG}
        
        </form>
        
    </body>
</html>
