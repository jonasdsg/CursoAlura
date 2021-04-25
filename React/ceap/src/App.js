import logo from './logo.svg';
import './reset.css';
import './App.css';
import ListaDeNotas from './Components/ListaDeNotas/ListaDeNotas';
import FormularioCadastro from './Components/FormularioCadastro/FormularioCadastro';

function App() {
  return (
    <section className="main-section">
      <FormularioCadastro/>
      <ListaDeNotas/>
    </section>
  );
}

export default App;
