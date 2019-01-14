
<%--
  Created by IntelliJ IDEA.
  User: Edward
  Date: 08.01.2019
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>

<form method="POST" action="${pageContext.request.contextPath}/volumeServlet">
    <table border="0">
        <tr>
            <td>введите длину стороны для куба</td>
            <td><label>
                <input type="text" name="cubeDimension" value= "" />
            </label></td>
        </tr>
        <tr>
            <td>введите радиус для сферы</td>
            <td><label>
                <input type="text" name="sphereRad" value= "" />
            </label></td>
        </tr>
        <tr>
            <td>введите стороны а, b и c для паралеллограмма</td>
            <td><label>
                <input type="text" name="cuboidA" value= "" /><input type="text" name="cuboidB" value= "" /><input type="text" name="cuboidC" value= "" />
            </label></td>
        </tr>

        <tr>
            <td>введите площадь основы и висоту к основе тетраэдера</td>
            <td><label>
                <input type="text" name="areaBase" value= "" /><input type="text" name="height" value= "" />
            </label></td>
        </tr>
        <tr>

        <tr>
            <td>задайте точность для результата</td>
            <td><label>
                <input type="number" name="accuracy" value= "" />
            </label></td>
        </tr>
        <tr>
            <td colspan ="2">
                <input type="submit" value= "Рассчитать" />

            </td>
        </tr>

    </table>
</form>




</body>
</html>