import axios from "axios";

export const get_all_starships = () => {
    return axios.get('/starship');
}