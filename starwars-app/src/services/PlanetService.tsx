import axios from 'axios';


export const get_all_planets = () => {
    return axios.get('/planet');
}

