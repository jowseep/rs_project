<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Home</title>
</head>

<body>
<h1>US Stocks</h1>

<!-- this is the search button -->
<s:form action="search">
    <s:textfield name ="keyword" placeholder="Search"/>
    <s:submit/>
 </s:form>
<!-- this is where the preview of US stocks -->
<p>List of US Stocks</p>

<s:iterator value="us_stocks">
    <fieldset>
        <p>Item <a href="#"><s:property value="us_ranking"/></a></p>
        <!-- <p>Term <a href="#"><s:property value="term"/></a></p> -->
    </fieldset>
</s:iterator>

</body>
</html>