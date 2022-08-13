import React, { Component } from 'react'
//import {useNavigate, Navigate} from 'react-router-dom';

export default class SignUp extends Component {
  
  render() {
    // const navigateToNotes = () => {
    //   // 👇️ navigate to /SignUp
    //   navigate('/sign-in');
    // };

    return (
      <div className="Container">
      <form className="RegForm">
        <div className="RegFormContents">
        <h3 className="title">XYZ Academy</h3>
        <div className="form-group mt-3">
          <label>Enter First Name</label>
          <input
            type="text"
            className="form-control mt-1"
            placeholder="First Name"
          />
        </div>

        <div className="form-group mt-3">
          <label>Enter Last Name</label>
          <input
            type="text"
            className="form-control mt-1"
            placeholder="Last Name"
          />
        </div>

        <div className="form-group mt-3">
          <label>Enter Email Address</label>
          <input
            type="email"
            className="form-control mt-1"
            placeholder="Email"
          />
        </div>
        <div className="form-group mt-3">
          <label>Enter Password</label>
          <input
            type="password"
            className="form-control mt-1"
            placeholder="Password"
          />
        </div>

        <div className="form-group mt-3">
          <label>Confirm Password</label>
          <input
            type="password"
            className="form-control mt-1"
            placeholder="Re-enter Password"
          />
        </div>

       <div className="d-grid gap-2 mt-3">
            <button type="submit" className="button" >
              Lets Get Started!
            </button>
        </div>

        <p className="forgot-password text-right" style={{marginTop:"10px"}}>
          Already registered? <a href="/sign-in">Sign in</a>
        </p>
        </div>
      </form>
      </div>
    )
  }
}