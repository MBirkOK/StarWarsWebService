import axios from "axios";
import { Character } from "../schemas/character";

export const get_all_character = () => {
    return axios.get<Character[]>('/character');
}