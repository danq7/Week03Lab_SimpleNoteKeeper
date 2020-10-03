<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Week3Lab</title>
    </head>
    <body>
        <form method="post">
            <h1>Simple Note Keeper</h1>
            <h2>Edit Note</h2>
            <label>Title: </label><input type="text" name="line_one" value="${inputTitle}">
            <br>
            <label>Contents: </label> <textarea name="line_two">${textAreaContents}</textarea>
            <br>
            <input type="submit" value="Save">
        </form>
    </body>
</html>