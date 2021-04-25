import { Component } from "react";
import FormularioCadastro from "../FormularioCadastro/FormularioCadastro";
import ListaDeNotas from "../ListaDeNotas/ListaDeNotas";
import "./Principal.css";

export default class Principal extends Component {
    render(){
        return (
            <div className="main">
                <ListaDeNotas/>
                <FormularioCadastro/>
            </div>
        );
    }
}