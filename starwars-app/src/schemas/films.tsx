import {Planet} from "./planets";
import {Character} from "./character";
import {Species} from "./species";
import {Starship} from "./starship";
import {Vehicle} from "./vehicles";

export interface Film {
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
    species: Species,
    url: string,
    created: string,
    edited: string
  }