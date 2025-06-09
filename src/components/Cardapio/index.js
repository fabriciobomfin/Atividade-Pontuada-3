// src\components\ListaDeUsuarios\index.js

import { useState, useEffect } from "react";
import axios from "axios";
import './styles.css'

function ListaDeUsuarios() {
    const [usuarios, setUsuarios] = useState([])

    useEffect(() => {
        const carregarUsuarios = async () => {
            try {
                const response = await axios.get('https://atividade-pontuada-3.onrender.com/pedidos')
                setUsuarios(response.data)
            } catch (error) {
                alert('Erro ao buscar usuários: ', error)
                setUsuarios([])
            }
        }
        carregarUsuarios()
    }, [])

    return (
        <ul id="listaUsurios" className="lista-usuarios">
            {usuarios.length === 0 ? (
                <li>Nenhum usuário encontrado.</li>
            ) : (
                usuarios.map( pedido => (
                    <div className = "cardapio">
                        <img src = {pedido.url} alt={pedido.nome} className="imagem-cardapio" />
                    <li key={pedido.id}>
                            
                        <strong>Nome: </strong> {pedido.nome}<br />
                        <strong>Descrição: </strong> {pedido.descricao}<br />
                        <strong>Preço: </strong> {pedido.preco}<br />
                        <strong>Categoria: </strong> {pedido.categoria}<br />
                        <strong>Disponibilidade: </strong> {pedido.disponibilidade}<br />
                       
                        
                    </li>
                   </div>
                ))
            )}
        </ul>
    )
    
}

export default ListaDeUsuarios