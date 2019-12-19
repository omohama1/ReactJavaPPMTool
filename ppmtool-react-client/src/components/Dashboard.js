import React, { Component } from "react";
import ProjectItem from "./project/ProjectItem";
import Header from "./Layout/Header";
import "bootstrap/dist/css/bootstrap.min.css";
class Dashboard extends Component {
  render() {
    return (
      <div>
        <Header />
        <h1 className="alert alert-warning">Welcome to the Dashboard</h1>

        <ProjectItem />
      </div>
    );
  }
}

export default Dashboard;
