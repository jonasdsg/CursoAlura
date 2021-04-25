import React, { Component } from "react";
import "./FormularioCadastro.css";
import "../CardNota/CardNota.css"

export default class FormularioCadastro extends Component {
    
    constructor(props){
        super(props);
        this.card = new Card();
    }
    
    adicionarTitulo(evento){
        this.card.titulo = evento.target.value;
    }
    
    adicionarMensagem(evento){
        this.card.mensagem = evento.target.value;
    }
    criarNota(evento){
        evento.preventDefault();
        this.props.criarNota(this.card.titulo,this.card.mensagem);

    }

    render(){
        return (
            <form className="form-cadastro">
                <div className="card-format">

                    <input type="text" id="titulo_nota" placeholder="Título"  onChange={this.adicionarTitulo.bind(this)}/>
                    <div className="input-text">
                        <textarea rows="3" placeholder="Escreva sua nota" onChange={this.adicionarMensagem.bind(this)}></textarea>
                        <button onClick={this.criarNota.bind(this)}>Criar nota</button>
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