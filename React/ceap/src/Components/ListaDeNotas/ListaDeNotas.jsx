import React, { Component } from "react";
import CardNota from "../CardNota/CardNota";
import "./ListaDeNotas.css";

export default class ListaDeNotas extends Component {
    render(){
        return (
            <section className="lista_notas_section">
                <ul className="lista_notas">
                    {this.props.notas.map((nota,index)=>{
                        return (
                            <CardNota key={index} nota={nota}/>
                        );
                    })}
                </ul>
            </section>
        );
    }
}