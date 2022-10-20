<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
</head>

<body>

    <s:form action="search">
        <s:textfield name ="keyword" placeholder="Search"/>
        <s:submit/>
    </s:form>

    <s:iterator value="eachStockOrWhatevah" >
    <fieldset>
        <p>Ticker: <s:property value="ticker"/></p>
        <p>Company name: <s:property value="company_name"/></p>
        <p>Industry: <s:property value="company_type"/></p>
    </fieldset>
</s:iterator>

<script type="text/JavaScript">
    var docTitle = document.title.replace("銘柄情報", "<s:property value = 'usStocksOrWhatevah.eachStockOrWhatevah.ticker'/>");
    document.title = docTitle;
</script>
</body>
</html>
