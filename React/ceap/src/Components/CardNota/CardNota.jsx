import React, { Component } from "react";
import "./CardNota.css";

export default class CardNota extends Component {
    render(){
        return (
            <li className="card-format">
                <header><h3>{this.props.nota.titulo}</h3></header>
                <main><p>{this.props.nota.mensagem}</p></main>
            </li>
        );
    }
}