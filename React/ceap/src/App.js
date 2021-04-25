import logo from './logo.svg';
import './App.css';
import ListaDeNotas from './Components/ListaDeNotas';

function App() {
  return (
    <section>
      <form>
        <input type="text"/>
        <textarea placeholder="Escreva sua nota"></textarea>
        <button>Criar nota</button>
      </form>
      <ListaDeNotas/>
    </section>
  );
}

export default App;
