import axios from 'axios'

export const baseUrl = "https://findfalcone.herokuapp.com"
export const planetsUrl = `${baseUrl}/planets`
export const vehiclesUrl = `${baseUrl}/vehicles`
export const tokenUrl = `${baseUrl}/token`
export const findUrl = `${baseUrl}/find`

export const getPlanets = async () => {
	const planets = await axios.get(planetsUrl)
		.then(({ data }) => data)

	return planets
}

export const getVehicles = async () => {
	const vehicles = await axios.get(vehiclesUrl)
		.then(({ data }) => data)

	return vehicles
}

export const getToken = async () => {
	const token = await axios.get(tokenUrl)
		.then(({ data }) => data)

	return token
}

export const findFalcone = async (token, planets, vehicles) => {
	const config = {
		method: 'post',
		url: findUrl,
		headers: { 'Accept': 'application/json', 
				   'Content-Type': 'application/json' }
	}
	const params = {
		token: token,
		planets: planets,
		vehicles: vehicles
	}
	const result = await axios.post(config, params)
}