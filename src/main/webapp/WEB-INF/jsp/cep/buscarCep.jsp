<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>TP3 Java Cloud</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

        <h4>Pesquise o CEP de seu endereço</h4>
        <form action="/cep" class="form-group" method="post">
            <div class="form-group">
                <label>Cep:</label>
                <input type="text" class="form-control" name="cep">
                <button type="submit" class="btn btn-primary">Buscar Dados do CEP</button>
            </div>
        </form>
    </div>
</div>

</div>
</body>
</html>