import axios from 'axios';


export const get_all_spezies = () => {
    return axios.get('/species');
}