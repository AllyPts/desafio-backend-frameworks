const express = require('express');
const app = express();

// Rota direta para teste rápido
app.get('/test', (req, res) => {
    res.send("Node.js rodando localmente com sucesso!");
});

// IP 127.0.0.1 para Firewall não interferir
app.listen(3000, '127.0.0.1', () => {
    console.log('Servidor Node pronto! Acesse: http://127.0.0.1:3000/test');
});