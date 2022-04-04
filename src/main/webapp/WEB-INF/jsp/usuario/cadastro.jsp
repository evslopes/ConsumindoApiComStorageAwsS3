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

    <form action="/usuario/incluir" method="post">
        <h1>Cadastramento de Usuários</h1>

        <div class="form-group">
            <label>Nome:</label>
            <input type="text" class="form-control" name="nome">
        </div>

        <div class="form-group">
            <label>E-mail:</label>
            <input type="phone" class="form-control" name="telefone">
        </div>

        <div class="form-group">
            <label>E-mail:</label>
            <input type="email" class="form-control" name="email">
        </div>

        <div class="form-group">
            <label>Senha:</label>
            <input type="password" class="form-control" name="senha">
        </div>

        <c:import url="/WEB-INF/jsp/endereco.jsp"/>

        <button type="submit">Cadastrar</button>
    </form>

</div>
</body>
</html>