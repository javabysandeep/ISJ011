<html>
<body>
<h1>This is an error handling page</h1>
<%@page isErrorPage="true" %>
<h1>Error occurred due to</h1>
<%=exception.getMessage()%>
Enter valid number.
</body>
</html>
