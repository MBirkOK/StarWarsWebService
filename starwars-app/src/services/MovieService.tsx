import axios from "axios";
import { Movie } from "../schemas/movies";

export const get_all_movies = () => {
    return axios.get<Movie[]>('/movie');
}