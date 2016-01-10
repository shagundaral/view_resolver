<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Pizza JSP View</title>
</head>
<body>
    <table border="1">
        <tr>
        <td>NAME</td>
        <td>ID</td>
        <td>ORGANISATION</td>
        </tr>
        <tr>
            <td>${emp.name}</td>
            <td>${emp.id}</td>
            <td>
                <c:forEach var="item" items="${emp.departments}">
                    <c:out value="${item}"/>&nbsp; 
                </c:forEach>
            </td>
        </tr>
    </table>
</body>
</html>