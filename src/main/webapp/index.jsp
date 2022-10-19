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

<s:iterator value="eachStock" >
    <fieldset>
        <p>Ticker: <s:property value="ticker"/></p>
        <p>Company name: <s:property value="company_name"/></p>
        <p>Industry: <s:property value="company_type"/></p>
    </fieldset>
    <s:property />
</s:iterator>

</body>
</html>