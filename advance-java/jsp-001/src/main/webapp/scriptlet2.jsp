<html>
<body>
<h2>Expression tag : we can print any expression</h2>
<%=10 + 20%>
<%="this is an expression tag"%>
<%=10 * 20 + 30%>
<%="Addition of two numbers is :" + add(100, 200)%>

<h2>Declaration tag</h2>
<%!
    public static int add(int a, int b) {
        return a + b;
    }
%>
</body>
</html>
