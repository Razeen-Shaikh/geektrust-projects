import React, { useState, useEffect } from 'react'
import { getPlanets } from '../services/API'
import Vehicles from './Vehicles'

const Planets = () => {
    const [error, setError] = useState(null)
    const [planets, setPlanets] = useState([])

    useEffect(() => {
        getPlanets().then(
            planets => {
                setPlanets(planets)
            },
            error => {
                setError(error)
            }
        )
    }, [])

    const showVehicles = () => {
        return (<Vehicles />)
    }

    if (error)
        return <div>Error: {error.message}</div>;
    else {
        return (
            <div className="Planets">
                {planets && planets.map(planet => (
                    <div key={planet.name} className="Planet" onClick={showVehicles}>
                        <img src={require("../images/" + planet.name + ".png")} className="App-logo" alt={planet.name + " Planet"} />
                        <h2>{planet.name}</h2>
                        <p>Distance - {planet.distance} megamiles</p>
                    </div>
                ))}
            </div>
        )
    }
}

export default Planets