<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${requestScope.DOC.experience >10}">
          <c:out value="He is Experienced"/>
          </c:if>
<c:if test="${requestScope.DOC.experience <= 10}">
          <c:out value="He is New"/>
          </c:if>
<br>
<c:if test="${requestScope.DOC.gender == 'FEMALE'}">
          <c:out value="she is female"/>
          </c:if>
<c:if test="${requestScope.DOC.gender != 'FEMALE'}">
          <c:out value="he is male"/>
          </c:if>
<br>
<c:if test="${requestScope.DOC.fees >1000}">
          <c:out value="she is bad doctor"/>
          </c:if>
<c:if test="${requestScope.DOC.fees < 1000}">
          <c:out value="she is good doctor"/>
          </c:if>
<br>   
 <c:if test="${requestScope.DOC.Qualifiaction == 'MBBS'}">
          <c:out value="she is doctor"/>
          </c:if>
<c:if test="${requestScope.DOC.Qualifiaction != 'MBBS'}">
          <c:out value="she is not a doctor"/>
          </c:if>
<br>      
</body>
</html>