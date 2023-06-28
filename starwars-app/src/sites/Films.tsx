import {SetStateAction, useEffect, useState} from "react";
import {get_all_planets} from "../services/PlanetService";
import {TableBody} from "@mui/material";
import {BsFillPencilFill, BsFillTrashFill} from "react-icons/bs";
import "../styles/main.css";
import {Table} from "../components/Table";
import {TableHead} from "../components/TableHead";
import {TableHeadEntry} from "../components/TableHeadEntry";
import {TableBodyEntry} from "../components/TableBodyEntry";
import {BodyDiv} from "../components/BodyDiv";
import {Planet} from "../schemas/planets";
import {get_all_film} from "../services/FilmService";
import {Film} from "../schemas/films";
import {Character} from "../schemas/character";
import {Starship} from "../schemas/starship";
import {Vehicle} from "../schemas/vehicles";
import {Species} from "../schemas/species";

export default function Films() {
    const [film, setFilm] = useState([]);

    useEffect(() => {
        get_all_film().then((res: { data: SetStateAction<never[]>; }) => setFilm(res.data))
    }, []);
    return (
        <BodyDiv>
            <h1>Filme</h1>
            <div>
                <Table>
                    <TableHead>
                        <tr>
                            <TableHeadEntry text={"Title"}/>
                            <TableHeadEntry text={"Direktor"}/>
                            <TableHeadEntry text={"Producer"}/>
                            <TableHeadEntry text={"Veröffentlichung"}/>
                            <TableHeadEntry text={"Aktionen"}/>
                        </tr>
                    </TableHead>
                    <TableBody>
                        {film.map((data: Film) => (
                            <tr key={data.episode_id}>
                                <TableBodyEntry text={data.title}/>
                                <TableBodyEntry text={data.director}/>
                                <TableBodyEntry text={data.producer}/>
                                <TableBodyEntry text={data.release_date}/>
                                <td className={"actionColumn"}>
                                    <BsFillPencilFill size={25} color={"#165a72"} style={{cursor: "pointer"}}/>
                                    <BsFillTrashFill size={25} color={"#165a72"} style={{cursor: "pointer"}}/>
                                </td>
                            </tr>
                        ))}
                    </TableBody>
                </Table>
            </div>
        </BodyDiv>
    );
}