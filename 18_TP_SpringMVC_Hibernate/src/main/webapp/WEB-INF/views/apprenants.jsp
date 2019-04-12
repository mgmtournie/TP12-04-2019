<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<h1 style="background-color: lightgreen; color: darkgreen">Liste
			des apprenants</h1>
	</div>

	<div align="center">
		<table align="center" width="80%" cellspacing="0" cellpadding="5">
			<tr>
				<td align="right"><a
					href="${pageContext.request.contextPath}/apprenant/addApprenant"
					style="background-color: lightblue;"> Ajouter un apprenant </a></td>
			</tr>
			<tr>
				<td>
					<table cellspacing="0" cellpadding="6" border="1" width="100%">
						<tr>
							<td colspan="7"
								style="background-color: lightblue; color: darkgreen; font-size: 16pt"
								align="center">Liste Des Apprenants</td>
						</tr>
						<tr bgcolor="grey" style="color: white">
							<th>No</th>
							<th>Nom</th>
							<th>Prenom</th>
							<th>Date de Naissance</th>
							<th>Cv</th>
							<th>Diplome</th>
						</tr>
						<c:forEach var="apprenant" items="${apprenantList}">
							<tr bgcolor="lightyellow">
								<td><b>${apprenant.id}</b></td>
								<td>${apprenant.nom}</td>
								<td>${apprenant.prenom}</td>
								<td>${apprenant.dateNaissance}</td>
								<td>${apprenant.cv}</td>
								<td>${apprenant.diplome}</td>
								<td><a
									href="deleteApprenant/${apprenant.id}">
										Supprimer l'apprenant </a></td>
								<td><a href="editApprenant?IdApprenant=${apprenant.id}">Edit</a></td>
							</tr>
						</c:forEach>
					</table>
				</td>
			</tr>
		</table>
	</div>
<a href="<c:url value="/j_spring_security_logout" />" >Se deconnecter</a>
</body>
</html>