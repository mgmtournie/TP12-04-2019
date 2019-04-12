<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ajout apprenant page</title>
</head>
<body>

	<div align="center">
		<h1 style="background-color: lightgreen; color: darkgreen">Page
			d'Ajout d'Un Nouveau Apprenant</h1>
	</div>

	<div align="center">

		<table cellspacing="0" cellpadding="6" border="1" width="60%">
			<tr>
				<td colspan="8"
					style="background-color: lightblue; color: darkgreen; font-size: 16pt"
					align="center">Information Apprenant</td>
			</tr>
			<tr>
				<td><form:form method="POST" action="insererApprenant"
						modelAttribute="apprenant">

						<table width="100%">
							<tr>
								<td><form:input type="hidden" path="id" /></td>
							</tr>
							<tr>
								<td><form:label path="nom">Nom</form:label></td>
								<td align="left" width="70%"><form:input path="nom" /></td>
							</tr>
							<tr>
								<td><form:label path="prenom">Prénom</form:label></td>
								<td align="left"><form:input path="prenom" /></td>
							</tr>
							<tr>
								<td><form:label path="dateNaissance">Date de Naissance</form:label></td>
								<td align="left"><form:input path="dateNaissance" /></td>
							</tr>
							<tr>
								<td><form:label path="cv">Cv</form:label></td>
								<td align="left"><form:input path="cv" /></td>
							</tr>
							<tr>
								<td><form:label path="diplome">Diplome</form:label></td>
								<td align="left"><form:input path="diplome" /></td>
							</tr>
							<tr>
								<td colspan="2"><input type="submit" value="Submit" /></td>
							</tr>
						</table>
					</form:form></td>
			</tr>
		</table>
	</div>
	<a href="<c:url value="/j_spring_security_logout" />">Se deconnecter</a>
</body>
</html>