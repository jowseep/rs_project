<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head><title>No Result</title></head>

<body>
<p>I'm sorry, there is no match. Try again. </p>

<s:form action="search">
    <s:textfield name ="keyword" placeholder="Search"/>
    <s:submit/>
</s:form>
</body>
</html>
