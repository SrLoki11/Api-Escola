const express = require('express');
const app = express();
const port = 3000;

app.use(express.json());

let clientes = [];
let produtos = [];

// Rota para adicionar um cliente
app.post('/clientes', (req, res) => {
    const { id, nome, endereco, estado, pais } = req.body;
    const novoCliente = { id, nome, endereco, estado, pais };
    clientes.push(novoCliente);
    res.status(201).json({ message: 'Cliente inserido com sucesso', cliente: novoCliente });
});

// Rota para adicionar um produto
app.post('/produtos', (req, res) => {
    const { id, nome, custo, venda, quantidade } = req.body;
    const novoProduto = { id, nome, custo, venda, quantidade };
    produtos.push(novoProduto);
    res.status(201).json({ message: 'Produto inserido com sucesso', produto: novoProduto });
});

// Listar clientes
app.get('/clientes', (req, res) => {
    res.json(clientes);
});

// Listar produtos
app.get('/produtos', (req, res) => {
    res.json(produtos);
});

app.listen(port, () => {
    console.log(`Servidor rodando em http://localhost:${port}`);
});
