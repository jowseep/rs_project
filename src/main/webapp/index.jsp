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
        <s:url action="tickerChosen" var="chosenTicker">
            <s:param name="keyword" value="ticker"/>
        </s:url>
        <h3><s:a href="%{chosenTicker}" style="text-decoration: none;"><s:property value="ticker"/></s:a></h3>
        <p>Company name: <s:property value="company_name"/></p>
        <p>Industry: <s:property value="company_type"/></p>
    </fieldset>
</s:iterator>

</body>
</html>