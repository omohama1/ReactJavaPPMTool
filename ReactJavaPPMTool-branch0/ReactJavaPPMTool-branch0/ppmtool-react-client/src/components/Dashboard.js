import React, { Component } from "react";
<<<<<<< HEAD
import ProjectItem from "./project/ProjectItem";
import Header from "./Layout/Header";
import "bootstrap/dist/css/bootstrap.min.css";
class Dashboard extends Component {
  render() {
    return (
      //<!-- Dashboard Component (Project Item included) -->

      <div className="projects">
        <div className="container">
          <div className="row">
            <div className="col-md-12">
              <h1 className="display-4 text-center">Projects</h1>
              <br />
              <a href="ProjectForm.html" className="btn btn-lg btn-info">
                Create a Project
              </a>
              <ProjectItem />
              <ProjectItem />
              <br />
              <hr />
            </div>
          </div>
        </div>
      </div>
    );
=======

class Dashboard extends Component {
  render() {
    return <div></div>;
>>>>>>> dccdb48289ca6d3fe940241f42a1e1ac7d646bf6
  }
}

export default Dashboard;
