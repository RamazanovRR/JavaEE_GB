<%@ page import="ru.Ramazanov.enterprise.servlet.Constant" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="ru.Ramazanov.enterprise.servlet.product.Product" %><%--
  Created by IntelliJ IDEA.
  User: Cityk
  Date: 12.10.2018
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="header.jsp">
    <jsp:param name="title" value="Catalog" />
</jsp:include>
<%
    final Object productsObject = request.getAttribute(Constant.CATALOG);
    final ArrayList<Product> products = (ArrayList<Product>) productsObject;
%>
<table>
    <caption> Каталог товаров</caption>
<tr>
    <th>Id</th>
    <th>Name</th>
    <th>Cost</th>
</tr>
<% for (Product product : products) {%>
<tr>
    <td><%=product.getIdName() %></td>
    <td><%=product.getName() %></td>
    <td><%=product.getCost() %></td>
</tr>
<% } %>
</table>

<jsp:include page="/WEB-INF/views/footer.jsp"/>
