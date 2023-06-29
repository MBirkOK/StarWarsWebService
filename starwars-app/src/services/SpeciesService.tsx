import axios from 'axios';
import {Specie} from '../schemas/specie';


export const get_all_species = () => {
    return axios.get<Specie[]>('/species');
}