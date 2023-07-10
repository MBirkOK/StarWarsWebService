import {useEffect, useState} from "react";
import {TableBody} from "@mui/material";
import {BsFillPencilFill, BsFillTrashFill} from "react-icons/bs";
import "../styles/main.css";
import {BodyDiv} from "../resources/styled-components/BodyDiv";
import {Table, TableHead} from "../resources/styled-components/Table";
import {TableHeadEntry} from "../components/TableHeadEntry";
import {TableBodyEntry} from "../components/TableBodyEntry";
import {get_all_movies} from "../services/MovieService";
import {Movie} from "../schemas/movies";

export default function Movies() {
    const [movie, setMovie] = useState<Movie[]>([]);

    useEffect(() => {
        get_all_movies().then((res) => setMovie(res.data))
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
                        {movie.map((data: Movie) => (
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