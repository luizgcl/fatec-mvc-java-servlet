<%-- 
    Document   : listar_alunos
    Created on : Nov 13, 2023, 9:24:30 PM
    Author     : luizleme
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Alunos</title>
        <script src="https://cdn.tailwindcss.com"></script>
    </head>
    <body>
        <main class="flex flex-col items-center justify-center bg-stone-500 h-screen w-screen">
            <h1 class="text-white font-bold text-2xl">Alunos</h1>
            <table class="w-80 text-sm text-left rtl:text-right text-gray-500 dark:text-gray-400">
                <thead class="text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400">
                    <th>Nome</th>
                    <th>Idade</th>
                    <th colspan="2">Ações</th>
                </thead>
                <tbody>
                    <c:forEach var="aluno" items="${alunos}">
                        <tr class="bg-white border-b dark:bg-gray-800 dark:border-gray-700">
                            <th scope="row" class="px-6 py-4">${aluno.nomeAluno}</th>
                            <td class="px-6 py-4">${aluno.idadeAluno}</td>
                            <td class="px-6 py-4"><a href="${pageContext.request.contextPath}/CarregarAluno?id_aluno=${aluno.idAluno}">Editar</a></td>
                            <td class="px-6 py-4"><a href="${pageContext.request.contextPath}/DeletarAluno?id_aluno=${aluno.idAluno}">Deletar</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            ${message}
        </main>
    </body>
</html>
