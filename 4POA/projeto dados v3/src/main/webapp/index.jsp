<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="styles.css">
    <title>Rolar</title>
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
	    <form action="ModificaServlet" method="post">
	        <div class="mb-3">
	            <label for="tipoDado" class="form-label display-6">Escolha o tipo de dado:</label>
	            <select id="tipoDado" name="tipoDado" class="form-select">
	                <option value="4">Dado de 4 lados</option>
	                <option value="6">Dado de 6 lados</option>
	                <option value="8">Dado de 8 lados</option>
	                <option value="10">Dado de 10 lados</option>
	                <option value="14">Dado de 14 lados</option>
	                <option value="20">Dado de 20 lados</option>
	            </select>
	        </div>
	        <button type="submit" class="btn btn-outline-create">Rolar Dado</button>
	    </form>
	</div>
	<footer class="border-top footer text-muted bg-white fixed-bottom">
		<div class="container">
			<a>2023 - Rolador de Dados</a>
	    </div>
	</footer>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
