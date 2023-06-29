import axios from 'axios';
import { Vehicle } from '../schemas/vehicles';


export const get_all_vehicle = () => {
    return axios.get<Vehicle[]>('/vehicle');
}