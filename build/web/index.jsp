<%-- 
    Document   : index
    Created on : Oct 30, 2023, 9:26:33 PM
    Author     : luizleme
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Controle de Alunos</title>
        <script src="https://cdn.tailwindcss.com"></script>
        <style type="text/tailwindcss">
            @layer utilities {
                body {
                    @apply bg-zinc-900 text-gray-100 w-screen h-screen flex items-center justify-center;
                }
            }
        </style>
    </head>
    <body>
        <section class="flex flex-col bg-zinc-600 p-4 rounded-md">
            <h1 class="text-xl font-bold">Controle de Alunos</h1>
            <article class="mt-2">
                <p class="text-md">
                    Olá, seja bem-vindo(a) ao Controle de Alunos!<br/>
                    Acesse:
                </p>
            </article>
            <nav class="my-4">
                <ul>
                    <li>
                        <a 
                            class="text-cyan-500 hover:text-cyan-300 hover:cursor-pointer"
                            href="cadastrar_aluno.jsp">
                            Cadastro de Alunos
                        </a>
                    </li>
                    <li>
                        <a 
                            class="text-cyan-500 hover:text-cyan-300 hover:cursor-pointer"
                            href="ListarAlunos">
                            Lista de Alunos
                        </a>
                    </li>
                </ul>
            </nav>
            ${message}
        </section>
    </body>
</html>
