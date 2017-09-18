<%@ page contentType="text/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Equipe société Objis</title>
</head>
<body>
	<h2 align="center">Liste des Personnes</h2>
	<ul>
		<c:forEach items="${liste}" var="personne">
			<li><c:out value="${personne.nom}" /> <c:out
					value="${personne.prenom}" /> <br></li>
		</c:forEach>
	</ul>
</body>

</html>
