import React, { Component } from "react";
import "./FormularioCadastro.css";
import "../CardNota/CardNota.css"

export default class FormularioCadastro extends Component {
    render(){
        return (
            <form>
                <div className="card-format">

                    <input type="text" id="titulo_nota" placeholder="Título" />
                    <div className="input-text">
                        <textarea rows="3" placeholder="Escreva sua nota"></textarea>
                        <button>Criar nota</button>
                    </div>
                
                </div>
            </form>
        );
    }
}