// import "./App.css";
import React from "react";

import Login from "./components/login/Login";
import Register from "./components/register/Register";
import Header from "./components/Navbar/Header";


import { Routes, Route } from "react-router-dom";



const App = () => {
  return (
    <>
        
        
        <div>
          <Routes>
            <Route path="/" element={<Login />}></Route>
            
            
            <Route path="*" element={<PageNotFound />} />
          </Routes>
          
        </div>
      
    </>
  );
};
function PageNotFound() {
  return (
    <div className="pagenot">
      <h2>404 Page not found</h2>
    </div>
  );
}

export default App;
