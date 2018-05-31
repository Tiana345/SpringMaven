<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="Header.jsp" %>

	<c:forEach items="${maListe }" var="monvar">

	 <c:out value = "${monvar.getNom()}"/><p>

</c:forEach>



