import axios from "axios";
import { Starship } from "../schemas/starship";

export const get_all_starships = () => {
    return axios.get<Starship[]>('/starship');
}