<html>
<body>
<h1>Calculator JSP Page</h1>
<%@page errorPage="error.jsp" %>
<%
    int number1 = Integer.parseInt(request.getParameter("number1"));
    int number2 = Integer.parseInt(request.getParameter("number2"));
    String operation = request.getParameter("operation");
    int output = switch (operation) {
        case "+" -> number1 + number2;
        case "-" -> number1 - number2;
        case "*" -> number1 * number2;
        case "/" -> number1 / number2;
        case "%" -> number1 % number2;
        default -> -1;
    };
    if (output == -1) {
        out.println("invalid operator");
    } else {
        out.println("Output is " + output);
    }
%>
</body>
</html>
