import React from 'react'
import '../App.css'

const Description = props => {
	return (
		<>
			<h1>Finding Falcone</h1>
			<p>a coding challenge by www.geektrust.in</p>
			<button onClick={() => props.setDisplay(true)}>Start</button>
		</>
	)
}

export default Description