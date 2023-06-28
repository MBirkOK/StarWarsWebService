import axios from "axios";

export const get_all_film = () => {
    return axios.get('/film');
}