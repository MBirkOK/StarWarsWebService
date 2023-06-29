import {Planet} from "./planets";
import {Specie} from "./specie";

export interface Character {
    "id": number,
    "name": string,
    "height": string,
    "mass": string,
    "hair_color": string,
    "skin_color": string,
    "eye_color": string,
    "birth_year": string,
    "gender": string,
    "homeworld": Planet,
    "species": Specie
}
