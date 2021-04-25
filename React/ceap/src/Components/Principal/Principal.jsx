import { Component } from "react";
import FormularioCadastro from "../FormularioCadastro/FormularioCadastro";
import ListaDeNotas from "../ListaDeNotas/ListaDeNotas";
import "./Principal.css";

export default class Principal extends Component {
    constructor(){
        super();
        this.state = {
            notas:[]
        }
    }

    criarNota(titulo,mensagem){
        const novoEstado = {
            notas: [...this.state.notas,{titulo,mensagem}]
        }
        this.setState(novoEstado);
    }

    render(){
        return (
            <div className="main">
                <ListaDeNotas notas={this.state.notas}/>
                <FormularioCadastro criarNota={this.criarNota.bind(this)}/>
            </div>
        );
    }
}