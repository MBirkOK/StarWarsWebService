import {Movie} from "./movies";
import {Character} from "./character";

export interface Vehicle {
    id: string,
    name: string,
    model: string,
    vehicle_class: string,
    manufacturer: string,
    cost_in_credits: string,
    length: string,
    crew: string,
    passengers: string,
    max_atmosphering_speed: string,
    cargo_capacity: string,
    consumables: string,
    films: Movie,
    pilots: Character,
    url: string,
    created: string,
    edited: string
}