import React, { Component } from "react";

export default class Login extends Component {
    render() {
        return (
          <div className="Container">
          <form className="RegForm">
            <div className="RegFormContents">
              <h3 className="title">XYZ Academy</h3>
              <div className="form-group mt-3">
                <label>Enter Name</label>
                <input
                  type="text"
                  className="form-control mt-1"
                  placeholder="Enter email"
                />
              </div>
          
          <div className="form-group mt-3">
            <label>Enter Password</label>
            <input
              type="password"
              className="form-control mt-1"
              placeholder="Enter password"
            />
          </div>
        

        <div className="d-grid gap-2 mt-3">
            <button type="submit" className="button" >
              Lets Get Started!
            </button>
        </div>

        <p className="forgot-password text-right"  style={{marginTop:"10px"}}>
          Don't have an account? Click <a href="/sign-up">here </a>
        </p>

       </div>
      </form>
    </div>
    
        );
    }
}