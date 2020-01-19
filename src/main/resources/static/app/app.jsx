import React from "react";
import ReactDom from "react-dom";
import FindProductInput from "./FindProductInput";

class App extends React.Component {
    render() {
        return <h1>Привет,</h1>;
    }
}

ReactDom.render(<FindProductInput/>, document.getElementById('react'));