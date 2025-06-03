import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Cadastro from "./pages/Cadastro";
import Lista from "./pages/Lista";
import "./App.css"; // Para estilos globais, se necessário
import Welcome from "./pages/Welcome";

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Welcome />} />
        <Route path="/cadastro" element={<Cadastro />} />
        <Route path="/lista" element={<Lista />} />
      </Routes>
    </Router>
  );
}

export default App;
