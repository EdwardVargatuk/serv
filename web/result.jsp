

<%--
  Created by IntelliJ IDEA.
  User: Edward
  Date: 14.01.2019
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>result</title>
</head>
<body>
<br /><hr />
<h3>Volume of the cube: <fmt:formatNumber value="${cube}" maxFractionDigits="${accuracy}" minFractionDigits="${accuracy}"/></h3>
<h3>Volume of the sphere: <fmt:formatNumber value="${sphere}" maxFractionDigits="${accuracy}" minFractionDigits="${accuracy}"/></h3>
<h3>Volume of the cuboid: <fmt:formatNumber value="${cuboid}" maxFractionDigits="${accuracy}" minFractionDigits="${accuracy}"/></h3>
<h3>Volume of the tetrahedron: <fmt:formatNumber value="${tetr}" maxFractionDigits="${accuracy}" minFractionDigits="${accuracy}"/></h3>
</body>
</html>
