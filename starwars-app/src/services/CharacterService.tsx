import axios from "axios";

export const get_all_character = () => {
    return axios.get('/character');
}