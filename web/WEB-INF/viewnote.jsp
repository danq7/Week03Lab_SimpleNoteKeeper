<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Week3Lab</title>
    </head>
    <body>
        <form method="post">
            <h1>Simple Note Keeper</h1>
            <h2>View Note</h2>
            <label><b>Title: </b></label><span>${displayTitle}</span>
            <br><br>
            <label><b>Contents: </b></label>
            <p>${displayContents}</p>
            <br>
            <a href="note?edit">Edit</a>
        </form>
    </body>
</html>