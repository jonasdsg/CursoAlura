import React, { Component } from "react";

export default class ListaDeNotas extends Component {
    render(){
        return (
            <section>
                <ul>
                    <li>
                        <header>Título</header>
                        <main><p>escreva sua nota!</p></main>
                    </li>
                </ul>
            </section>
        );
    }
}