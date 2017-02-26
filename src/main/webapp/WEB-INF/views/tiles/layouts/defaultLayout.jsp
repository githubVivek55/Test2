<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Blog</title>

<!-- Bootstrap Core CSS -->
<link href="<c:url value='/static/bootstrap/css/bootstrap.min.css'/>" rel="stylesheet"/>

<!-- Theme CSS -->
<link href="<c:url value='/static/css/clean-blog.min.css'/>"
	rel="stylesheet" />
</head>

<body>
	<header id="header">
		<tiles:insertAttribute name="header" />
	</header>
	<section id="site-content">
		<tiles:insertAttribute name="body" />
	</section>
	<footer id="footer">
		<tiles:insertAttribute name="footer" />
	</footer>
	<!-- jQuery -->
    <script src="<c:url value='/static/js/jquery.min.js'/>"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<c:url value='/static/bootstrap/js/bootstrap.min.js' />"></script>

    <!-- Contact Form JavaScript -->
    <script src="js/jqBootstrapValidation.js"></script>
    <script src="js/contact_me.js"></script>

    <!-- Theme JavaScript -->
    <script src="<c:url value='/static/js/clean-blog.min.js'/>"></script>
</body>
</html>