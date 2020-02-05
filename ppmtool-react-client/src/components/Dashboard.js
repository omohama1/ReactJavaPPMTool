import React, { Component } from "react";
import ProjectItem from "./project/ProjectItem";
import Header from "./Layout/Header";
import "bootstrap/dist/css/bootstrap.min.css";
import CreateProjectButton from "./project/CreateProjectButton";

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
              <CreateProjectButton></CreateProjectButton>
              <ProjectItem />
              <ProjectItem />
              <br />
              <hr />
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default Dashboard;
