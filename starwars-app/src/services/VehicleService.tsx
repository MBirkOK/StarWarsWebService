import axios from 'axios';


export const get_all_vehicle = () => {
    return axios.get('/vehicle');
}