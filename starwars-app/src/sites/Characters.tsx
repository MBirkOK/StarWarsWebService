import {Table} from "../components/Table";
import {TableHead} from "../components/TableHead";
import {TableHeadEntry} from "../components/TableHeadEntry";
import {BodyDiv} from "../components/BodyDiv";
import {TableBody} from "@mui/material";
import {SetStateAction, useEffect, useState} from "react";
import {get_all_character} from "../services/CharacterService";
import {TableBodyEntry} from "../components/TableBodyEntry";
import {BsFillPencilFill, BsFillTrashFill} from "react-icons/bs";
import {Character} from "../schemas/character";

export default function Characters() {
    const [characters, setCharacters] = useState([]);

    useEffect(() => {
        get_all_character().then((res: { data: SetStateAction<never[]>; }) => setCharacters(res.data))
    }, []);

    return (
        <BodyDiv>
            <h1> 1 coole nerdige Charaktere</h1>
            <Table>
                <TableHead>
                    <tr>
                        <TableHeadEntry text={"Name"}/>
                        <TableHeadEntry text={"Größe"}/>
                        <TableHeadEntry text={"Gewicht"}/>
                        <TableHeadEntry text={"Haarfarbe"}/>
                        <TableHeadEntry text={"Augenfarbe"}/>
                        <TableHeadEntry text={"Hautfarbe"}/>
                        <TableHeadEntry text={"Geburtstag"}/>
                        <TableHeadEntry text={"Geschlecht"}/>
                        <TableHeadEntry text={"Heimatplanet"}/>
                        <TableHeadEntry text={"Aktionen"}/>
                    </tr>
                </TableHead>
                <TableBody>
                    {characters.map((data: Character) => (
                        <tr key={data.id}>
                            <TableBodyEntry text={data.name}/>
                            <TableBodyEntry text={data.height + " m"}/>
                            <TableBodyEntry text={data.mass + " kg"}/>
                            <TableBodyEntry text={data.hair_color}/>
                            <TableBodyEntry text={data.eye_color}/>
                            <TableBodyEntry text={data.skin_color}/>
                            <TableBodyEntry text={data.birth_year}/>
                            <TableBodyEntry text={data.gender}/>
                            <TableBodyEntry text={data.homeworld.name}/>
                            <td className={"actionColumn"}>
                                <BsFillPencilFill size={25} color={"#165a72"} style={{cursor: "pointer"}}/>
                                <BsFillTrashFill size={25} color={"#165a72"} style={{cursor: "pointer"}}/>
                            </td>
                        </tr>
                    ))}
                </TableBody>
            </Table>
        </BodyDiv>
    )
}