import axios from 'axios';
import { Planet } from '../schemas/planets';


export const get_all_planets = () => {
    return axios.get<Planet[]>('/planet');
}

