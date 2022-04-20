import axios from 'axios'

export const HttpAllOffers = axios.create({
    baseURL: `${'http://localhost:8081/'}`,
    headers: {
        // Authorization: 'Bearer {token}'
    }
})

export const HttpDetailsOffer = axios.create({
    baseURL: `${'http://localhost:8081/offre/'}`,
    headers: {
        // Authorization: 'Bearer {token}'
    }
})
