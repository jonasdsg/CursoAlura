import React, { Component } from "react";
import "./FormularioCadastro.css";
import "../CardNota/CardNota.css"

export default class FormularioCadastro extends Component {
    
    card;
    constructor(){
        super();
        this.card = new Card();
    }

    infCard(event){
        this.card.mensagem = event.target.value;
    }

    render(){
        return (
            <form className="form-cadastro">
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

export class Card {
    titulo;
    mensagem;
}