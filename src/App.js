import React from 'react'
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import './App.css'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
// import ProtectedRoute from './components/protected_routes'
import Login from './components/login'
import SignUp from './components/signup'
import Home from './components/home'
function App() {
  return (
    <Router>
      <div className="App"> 
        <div className="auth-wrapper">
          <div className="auth-inner">
            <Routes>
              <Route exact path="/" element={<Home />} />
              <Route path="/sign-in" element={<Login />} />
              {/* <ProtectedRoute exact path="/sign-up" component={SignUp} /> */}
              <Route path="/sign-up" element={<SignUp />} />
            </Routes>
          </div>
        </div>
      </div>
    </Router>
  );
}
export default App;