<<<<<<< HEAD
import React from "react";
import logo from "./logo.svg";
import "./App.css";
import Dashboard from "./components/Dashboard";
import Header from "./components/Layout/Header";
import "bootstrap/dist/css/bootstrap.min.css";
=======
import React from 'react';
import logo from './logo.svg';
import './App.css';
>>>>>>> dccdb48289ca6d3fe940241f42a1e1ac7d646bf6

function App() {
  return (
    <div className="App">
<<<<<<< HEAD
      <Header />
      <Dashboard />
=======
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
>>>>>>> dccdb48289ca6d3fe940241f42a1e1ac7d646bf6
    </div>
  );
}

export default App;
