<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Home</title>
</head>

<body>
<h1>US Stocks</h1>

<s:form action="search">
    <s:textfield name ="keyword" placeholder="Search"/>
    <s:submit/>
 </s:form>
<p>List of US Stocks</p>

<s:iterator value="us_stocks">
    <s:iterator value="us_ranking" var="index">
        <fieldset>
            <s:property value="#index"/>
        </fieldset>
    </s:iterator>
</s:iterator>

</body>
</html>