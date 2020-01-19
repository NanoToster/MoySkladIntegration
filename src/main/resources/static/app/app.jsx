import React from "react";
import ReactDom from "react-dom";
import FindProductInput from "./FindProductInput";

// npm run build - сборка в бандл
// npm run dev - сборка в бандл в реалтайме

class App extends React.Component {
    render() {
        return <h1>Привет,</h1>;
    }
}

ReactDom.render(<FindProductInput/>, document.getElementById('react'));