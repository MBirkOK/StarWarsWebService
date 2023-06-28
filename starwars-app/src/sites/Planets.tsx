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

export default function Planets() {
    const [planets, setPlanets] = useState([]);

    useEffect(() => {
        get_all_planets().then((res: { data: SetStateAction<never[]>; }) => setPlanets(res.data))
    }, []);
    return (
        <BodyDiv>
            <h1>Planeten</h1>
            <div>
                <Table>
                    <TableHead>
                        <tr>
                            <TableHeadEntry text={"Name"}/>
                            <TableHeadEntry text={"Durchmesser"}/>
                            <TableHeadEntry text={"Rotation"}/>
                            <TableHeadEntry text={"Gravitation"}/>
                            <TableHeadEntry text={"Klima"}/>
                            <TableHeadEntry text={"Terrain"}/>
                            <TableHeadEntry text={"Wasser"}/>
                            <TableHeadEntry text={"Orbital"}/>
                            <TableHeadEntry text={"Population"}/>
                            <TableHeadEntry text={"Aktionen"}/>
                        </tr>
                    </TableHead>
                    <TableBody>
                        {planets.map((data: Planet) => (
                            <tr key={data.id}>
                                <TableBodyEntry text={data.name}/>
                                <TableBodyEntry text={data.diameter + " km"}/>
                                <TableBodyEntry text={data.rotation_period + " hours"}/>
                                <TableBodyEntry text={data.gravity}/>
                                <TableBodyEntry text={data.climate}/>
                                <TableBodyEntry text={data.terrain}/>
                                <TableBodyEntry text={data.surface_water + " %"}/>
                                <TableBodyEntry text={data.orbital_period + " days"}/>
                                <TableBodyEntry text={data.population + " beeings"}/>
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