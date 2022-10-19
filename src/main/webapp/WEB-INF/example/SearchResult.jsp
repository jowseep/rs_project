<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Search Result</title>
</head>

<body>
    <s:iterator value="eachStock" >
        <fieldset>
            <p>Ticker: <s:property value="ticker"/></p>
            <p>Company name: <s:property value="company_name"/></p>
            <p>Industry: <s:property value="company_type"/></p>
        </fieldset>
    </s:iterator>
</body>
</html>
