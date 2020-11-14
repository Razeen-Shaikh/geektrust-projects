import React, { useState, useEffect } from 'react'
import { getVehicles } from '../services/API'
import Planets from './Planets'

const Vehicles = () => {
    const [error, setError] = useState(null)
    const [vehicles, setVehicles] = useState([])

    useEffect(() => {
        getVehicles().then(
            vehicles => {
                setVehicles(vehicles)
            },
            error => {
                setError(error)
            }
        )
    }, [])

    const showPlanets = () => {
        return <Planets />
    }

    if (error) return <div>Error: {error.message}</div>
    else {
        return (
            <div className="Vehicles">
                {vehicles && vehicles.map(vehicle => (
                    <div key={vehicle.name} className="Vehicle" onClick={showPlanets}>
                        <img src={require("../images/" + vehicle.name + ".png")} className="VehicleImg" alt={vehicle.name + " Vehicle"} />
                        <h2>{vehicle.name}</h2>
                        <p>units = {vehicle.total_no} <span>max_distance = {vehicle.max_distance} megamiles</span></p>
                        <p>speed = {vehicle.speed} megamiles/hour</p>
                    </div>
                ))}
            </div>
        )
    }
}

export default Vehicles