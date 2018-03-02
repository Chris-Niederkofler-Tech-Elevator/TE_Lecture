<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>MVC Views Part 1 - Example: Hello, Internet!</title>
		<style>
			.red {
				color: red;
				}
			.blue {
				color: blue;
			}
		</style>
	</head>
	<body>
		
		
		
		<c:choose>
			<%-- We can reference the values of request parameters
			(e.g. from the query string) by using the "param" map.
			
			Here we are testing to see whether a query string 
			parameter called "name" was provided, and if it wasn't
			(i.e. it's empty) we're defaulting the name to "Internet" --%>
			<c:when test="${empty param.name}">
<<<<<<< HEAD
				<c:set var="name" value= "Global Thermonuclear War" />
=======
				<c:if test="${1=1}">
				</c:if>
				<c:set var="name" value="Internet" />
				<c:set var="className" value="red" />
>>>>>>> 3db1b506e1e790e85e25e30f7e8a557fe474efac
			</c:when>
			<c:otherwise>
				<c:set var="name" value="${param.name}" />
				<c:set var="className" value="blue" />
			</c:otherwise>
		</c:choose>
	
<<<<<<< HEAD
		<h1>Let's play a game. How about, ${name}!</h1>
=======
		<c:forEach var="count" begin="1" end="${param.count}">
			<h1 class="${className}">Hello, ${name}!</h1>
		</c:forEach>
>>>>>>> 3db1b506e1e790e85e25e30f7e8a557fe474efac
	</body>
</html>