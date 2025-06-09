// src\pages\Lista\index.js

import ListaDeUsuarios from "../../components/Cardapio";
import { useNavigate } from "react-router-dom";
import "./styles.css";

function Cardapio() {
  const navigate = useNavigate();

  
  return (
    <div className="pagina-lista-usuarios">
      <div className="container">
        <h2>Cardapio</h2>
        <ListaDeUsuarios />
        <button onClick={() => navigate("/")} className="link-voltar">
          Pagina incial
        </button>
      </div>
    </div>
  );
}

export default Cardapio;
