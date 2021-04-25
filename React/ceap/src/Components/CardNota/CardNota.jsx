import React, { Component } from "react";
import "./CardNota.css";

export default class CardNota extends Component {
    render(){
        return (
            <li className="card-format">
                <header><h3>Título</h3></header>
                <main><p>escreva sua nota!</p></main>
            </li>
        );
    }
}