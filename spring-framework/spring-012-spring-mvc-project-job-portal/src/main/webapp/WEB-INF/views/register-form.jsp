<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register User Form</title>
</head>
<body>
<form action="register" method="post">
    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="email" name="email"/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td>Role Name</td>
            <td><select name="role">
                <option value="JOB_SEEKER">Job Seeker</option>
                <option value="EMPLOYER">Employer</option>
                <option value="ADMIN">Admin</option>
            </select></td>
        </tr>
        <tr>
            <td><input type="submit" value="Register"/></td>
        </tr>

    </table>
</form>

</body>
</html>
