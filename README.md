


## 🍽️ Sistema de Gestão de Restaurantes

Projeto acadêmico para gerenciamento de pratos de um restaurante, com foco em uma experiência visual de cardápio.

---

## 🔧 Funcionalidades

- **Tela Inicial:** Exibe o logo do restaurante e links para navegação.
- **Cadastro de Prato:** Formulário com os seguintes campos:
  - Nome do prato
  - Descrição
  - Preço
  - Categoria (Entrada, Prato Principal, Sobremesa, Bebida)
  - Disponibilidade (Em estoque, Esgotado)
  - URL da imagem
- **Cardápio:** Lista todos os pratos cadastrados com imagem, nome e preço.
  - Filtro por categoria (opcional)

---

## 🛠️ Tecnologias Utilizadas

### Frontend
- React
- React Router DOM
- Axios
- CSS

### Backend
- Spring Boot
- MySQL

---

## 🗂️ Estrutura de Páginas

- `Home.js`: Página inicial com logo e navegação.
- `CadastroPrato.js`: Formulário para adicionar pratos.
- `Cardapio.js`: Visualização do cardápio com os pratos cadastrados.

---

## 🔄 Exemplo de Rotas (React)

```jsx
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "./Home";
import CadastroPrato from "./CadastroPrato";
import Cardapio from "./Cardapio";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/cadastro" element={<CadastroPrato />} />
        <Route path="/cardapio" element={<Cardapio />} />
      </Routes>
    </BrowserRouter>
  );
}
````

---

## 🗃️ Exemplo de Objeto de Prato

```json
{
  "id": 1,
  "nomePrato": "Salada Caesar",
  "descricao": "Alface americana, croutons, queijo parmesão e molho caesar.",
  "preco": 29.00,
  "categoria": "Entrada",
  "disponibilidade": "Em estoque",
  "urlImagem": "https://example.com/imagens/salada-caesar.jpg"
}
```

---

## 🛢️ Banco de Dados

* Banco de dados configurado com MySQL.
* A tabela de pratos inclui todos os campos, incluindo `urlImagem`.
* As configurações estão no arquivo `application.properties` do Spring Boot.

---

## ✅ Status do Projeto

✔️ Em desenvolvimento e funcional conforme os requisitos da atividade acadêmica.




