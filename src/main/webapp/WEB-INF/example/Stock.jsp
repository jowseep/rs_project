<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>
        <s:iterator value="eachStockOrWhatevah" >
           <s:property value="ticker"/>
        </s:iterator>
    </title>
</head>

<body>
    <s:form action="search">
        <s:textfield name ="keyword" placeholder="Search"/>
        <s:submit/>
    </s:form>
    
    <s:iterator value="eachStockOrWhatevah" >
        <h1>Ticker: <s:property value="ticker"/></h1>
        <p>Company name: <s:property value="company_name"/></p>
        <p>Industry: <s:property value="company_type"/></p>
    </s:iterator>

</body>
</html>
