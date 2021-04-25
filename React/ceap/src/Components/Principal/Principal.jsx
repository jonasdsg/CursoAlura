import { Component } from "react";
import FormularioCadastro from "../FormularioCadastro/FormularioCadastro";
import ListaDeNotas from "../ListaDeNotas/ListaDeNotas";
import "./Principal.css";

export default class Principal extends Component {
    constructor(){
        super();
        this.notas = [];
    }

    criarNota(titulo,mensagem){
        const nota = {titulo,mensagem}
        this.notas.push(nota);
        console.log(this.notas.length)
    }

    render(){
        return (
            <div className="main">
                <ListaDeNotas notas={this.notas}/>
                <FormularioCadastro criarNota={this.criarNota.bind(this)}/>
            </div>
        );
    }
}