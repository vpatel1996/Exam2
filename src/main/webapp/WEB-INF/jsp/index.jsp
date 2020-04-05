<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"     %>


<!DOCTYPE html>
<html>
    <head>
        <title>Deadly Viruses</title>
        <style>
            table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            td, th {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even) {
                background-mortalityrate: #dddddd;
            }
        </style>
        <style><%@include file="../css/style.css"%></style>
    </head>
    <body>
        <h2>Virus List</h2>
        <table class="myCoolStyle">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Description</th>
                <th>Symptoms</th>
                <th>Duration</th>
                <th>Mortality Rate</th>
                <th>Imageaddress</th>
            </tr>
            <c:forEach var = "item" items = "${list}">
            <tr>
                <td>${item.id}</td>
                <td>${item.name}</td>
                <td>${item.description}</td>
                <td>${item.symptoms}</td>
                <td>${item.duration}</td>
                <td>${item.mortalityrate}</td>
                <td><img src="${item.imageaddress}" alt="Could Not Load Image" height = 150px></td>
            </tr>
            </c:forEach>
        </table>
    </body>
</html>
