<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../styles.css">
    <title>Resultado do Dado</title>
</head>
<body style="background-color : #FFA07A;">
	<header>
	     <nav class="navbar navbar-expand-sm navbar-toggleable-sm navbar-light bg-white border-bottom box-shadow mb-3">
	         <div class="container-fluid">
	            <h1 class="display-4">Rolador de Dados Online</h1>
	        </div>
	    </nav>
	</header>
    <div class="container mt-5 bloco-fofinho">
        <div class="row">
            <div class="col-12 text-center">
                <% int resultado = (int)session.getAttribute("resultadoDado"); %>
                <p class="display-6">O resultado do dado é: <%= resultado %></p>
            </div>
        </div>
    </div>
	<footer class="border-top footer text-muted bg-white fixed-bottom">
		<div class="container">
			<a>2023 - Rolador de Dados</a>
	    </div>
	</footer>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>