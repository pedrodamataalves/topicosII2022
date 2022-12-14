/*
 * Arquivo JavaScript para acessar a API de clientes,
 * exibindo e manipulando os dados do DOM da página HTML
 */

//Constantes
const ALTERAR = 1;
const EXCLUIR = 2;

const URL_API = "http://localhost:8080/clientes"

const STATUS_OK = 200;
const STATUS_CREATED = 201;

const IDX_STORAGE_ID = 'idCliente';
const IDX_STORAGE_MSG_SUCESSO = 'msgSucesso';
const IDX_STORAGE_MSG_ERRO = 'msgErro';

//Função para carregar a lista de clientes da API
function carregarClientes() {
    //Carregar os clientes a partir da API
    

    //Criar o body na tabela
    

    //Criar as linhas com os clientes
    
}

//Função para carregar os dados de um único cliente a partir da API
function carregarDadosCliente() {
    
}

//Função para iniciar a inclusão de um cliente
function incluirCliente() {
    window.location = "clientes_form.html";
}

//Função para iniciar a alteração de um cliente
function alterarCliente(id) {
    window.location = 'clientes_form.html';
}

//Função para salvar um cliente (inclusão ou alteração)
function salvarCliente() {
    //Capturar os valores do formulário e criar o JSON para enviar a API
    

    //Salvar o cliente a partir da API
    
}

//Função para excluir um cliente
function excluirCliente(id) {
    //Confirma a exclusão
    if(! confirm('Confirma a exclusão do cliente?'))
        return;

    console.log("Excluindo cliente pela API...");

    //Exclui o cliente a partir da API
}

//Função AUXILIAR que cria um botão no HTML
function criarBotao(texto, classeEstilo, acao, id) {
    var btn = document.createElement('button');
    btn.type = 'button';
    btn.innerHTML = texto;
    btn.className = classeEstilo;
    
    if(acao == ALTERAR)
        btn.addEventListener("click", function() {
            alterarCliente(id);
        });
    else if(acao == EXCLUIR)
        btn.addEventListener("click", function() {
            excluirCliente(id);
        });

    return btn;
}

//Função AUXILIAR para retornar uma mensagem de erro extraida de um JSON
function retornaMsgErro(jsonErro) {
    var objErro = JSON.parse(jsonErro);
    return objErro.titulo;
}

//Função AUXILIAR para exibir uma mensagem em um componente HTML da tela
function exibeMsgTela(idComponente, mensagem) {
    document.getElementById(idComponente).innerHTML = mensagem;
    document.getElementById(idComponente).style.display = "block";    
}
