export let planet_distance, vehicle_distance, planet_name, vehicle_name;
let planets_chosen = []
let show_vehicles = false

export const onClick = (planet_name, vehicle_name) => {
    show_vehicles = showVehicles()
    console.log(show_vehicles)
    return (event => {
        console.log(event.target.querySelector('h2').textContent)
        return show_vehicles
    })
//     if(event.target.className === "Planet") {
//         planet_name = event.target.querySelector('h2').textContent
//         planet_distance = event.target.querySelector('p').textContent
//         planet_distance = planet_distance.match(/\d+/g)
//         if (planets_chosen.length < 4) {
//             planets_chosen.forEach((planet) => {
//                 if (planet_name !== planet) {
//                     planets_chosen.push(planet_name)
//                     showVehicles()
//                 }
//             })
//         }
//     }
//     if(event.target.className === "Vehicle") {
//         vehicle_name = event.target.querySelector('h2').textContent
//         vehicle_distance = event.target.querySelector('span').textContent
//         vehicle_distance = vehicle_distance.match(/\d+/g)
//         if (planet_distance <= vehicle_distance) {
//     }
//     console.log(planet_distance, planets_chosen, vehicle_distance)
//     return true
// }
}

const showVehicles = () => {
    return !show_vehicles
}
