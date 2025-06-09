// src\pages\Lista\index.js

import Cardapio from "../../components/Cardapio";
import { useNavigate } from "react-router-dom";
import "./styles.css";

function CardapioLista() {
  const navigate = useNavigate();

  
  return (
    <div className="pagina-lista-usuarios">
      <div className="container">
        <h2>Cardápio</h2>
        <Cardapio />
        <button onClick={() => navigate("/")} className="link-voltar">
          Pagina incial
        </button>
      </div>
    </div>
  );
}

export default CardapioLista;
