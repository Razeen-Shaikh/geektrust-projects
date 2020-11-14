import React, { useState } from 'react'
import { planet_name, vehicle_name } from '../helper/Helper'
import Planets from './Planets'
import Vehicles from './Vehicles'

const Game = () => {
    const [showVehicles, setShowVehicles] = useState(false)
    const [showNotification, setShowNotification] = useState(false)

    // const handleClick = event => {
    //     const response = onClick()
    //     console.log(response)
    //     setShowVehicles(response.show_vehicles)
    // }

    return (
        <div className="Main">
            <h1>{`Select a planet to search ${showVehicles}`}</h1>
            {!showVehicles ? (
                <Planets />
            ) : (
                    <Vehicles />
                )}
            {showNotification &&
                <p>You have already sent {vehicle_name} to {planet_name}</p>}
        </div>
    )
}

export default Game