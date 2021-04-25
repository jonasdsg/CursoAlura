import React, { Component } from "react";
import CardNota from "../CardNota/CardNota";
import "./ListaDeNotas.css";

export default class ListaDeNotas extends Component {
    render(){
        return (
            <section className="lista_notas_section">
                <ul className="lista_notas">
                    <CardNota/>
                    <CardNota/>
                    <CardNota/>
                    <CardNota/>
                </ul>
            </section>
        );
    }
}