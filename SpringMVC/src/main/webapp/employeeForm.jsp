<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Form</title>
</head>
<body>
    <h2>Employee Details Form</h2>
    <form action="/SpringMVC/showEmployeeDetails" method="post">
        <label for="id">Employee ID:</label>
        <input type="text" id="id" name="id"><br><br>
        <label for="name">Name:</label>
        <input type="text" id="name" name="name"><br><br>
        <label for="gender">Gender:</label>
        <select id="gender" name="gender">
            <option value="Male">Male</option>
            <option value="Female">Female</option>
            <option value="Other">Other</option>
        </select><br><br>
        <label for="salary">Salary:</label>
        <input type="text" id="salary" name="salary"><br><br>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
