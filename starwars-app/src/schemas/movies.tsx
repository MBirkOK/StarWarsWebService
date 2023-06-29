import {Planet} from "./planets";
import {Character} from "./character";
import {Specie} from "./specie";
import {Starship} from "./starship";
import {Vehicle} from "./vehicles";

export interface Movie {
    title: string,
    episode_id: number,
    opening_crawl: string,
    director: string,
    producer: string,
    release_date: string,
    characters: Character,
    planets: Planet,
    starships: Starship,
    vehicles: Vehicle,
    species: Specie,
    url: string,
    created: string,
    edited: string
}