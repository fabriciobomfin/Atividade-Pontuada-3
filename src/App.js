import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Cadastro from "./pages/Cadastro";
import CardapioLista from "./pages/Lista";
import "./App.css"; // Para estilos globais, se necessário
import Home from "./pages/Home";

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/cadastro" element={<Cadastro />} />
        <Route path="/lista" element={<CardapioLista />} />
      </Routes>
    </Router>
  );
}

export default App;
