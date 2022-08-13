import React from "react";
import {useEffect, useState} from "react";

import Login from './login'
import { BeatLoader} from 'react-spinners'

const Home = () => {

	const [loading, setLoading] = useState(true);
	
	useEffect(() => {

	const loadData = async () => {

		// Wait for half second
		await new Promise((r) => setTimeout(r, 500));

		setLoading((loading) => !loading);
	};
		loadData();
	}, [])
	
	
	if (loading) {
		return (
		<div style={{textAlign:"center" , margin:"250px 0 0 0px"}}>
  
			 <BeatLoader size ={40} color='#ED553B' loading/> <br/>
			 <h2>Welcome to XYZ ACADEMY </h2> <br/>
			 <h5> SHALL WE <a href="/sign-up"> START? </a></h5> 
           
        </div>
		)
	}
	
	else {
		return (
            <Login/>
			)	
		}
	}

export default Home;
