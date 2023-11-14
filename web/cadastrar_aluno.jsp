<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aluno</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://cdn.tailwindcss.com"></script>
    </head>
    <body>
        <main class="w-screen h-screen bg-stone-800 text-gray-100 p-4 flex flex-col items-center justify-center">
            <h1 class="text-2xl font-black mb-2">Cadastrar Aluno</h1>
            <form name="CadastrarAluno" action="CadastrarAluno" method="post">
                <label for="nome_aluno">Nome do Aluno</label>
                <input
                    id="nome_aluno"
                    name="nome_aluno"
                    placeholder="Informe o Nome..."
                    class="block rounded-md border-0 py-1.5 pl-2 pr-20 text-gray-900 ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6"/>
                <label for="idade_aluno">Idade do Aluno</label>
                <input
                    type="text"
                    id="idade_aluno"
                    name="idade_aluno"
                    placeholder="Informe a Idade..."
                    class="block rounded-md border-0 py-1.5 pl-2 pr-20 text-gray-900 ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6"/>
                <footer class="flex flex-row justify-end gap-2 mt-4">
                    <input 
                        type="reset" 
                        value="Limpar"
                        class="px-2 py-1 bg-red-500 text-gray-100 rounded-md capitalize cursor-pointer"/>
                    <input 
                        type="submit" 
                        value="enviar" 
                        name="enviar"
                        class="px-2 py-1 bg-green-500 text-gray-100 rounded-md capitalize cursor-pointer"/>
                </footer>
            </form>
            ${mensagem}
        </main>
    </body>
</html>
