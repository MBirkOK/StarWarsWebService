import {SetStateAction, useEffect, useState} from "react";
import {get_all_starships} from "../services/StarshipService";
import {BodyDiv} from "../components/BodyDiv";
import {Table} from "../components/Table";
import {TableHead} from "../components/TableHead";
import {TableHeadEntry} from "../components/TableHeadEntry";
import {TableBodyEntry} from "../components/TableBodyEntry";
import {BsFillPencilFill, BsFillTrashFill} from "react-icons/bs";
import {TableBody} from "@mui/material";
import {Starship} from "../schemas/starship";

export default function Starships() {
    const [ship, setShip] = useState([]);

    useEffect(() => {
        get_all_starships().then((res: { data: SetStateAction<never[]>; }) => {
            setShip(res.data)
        })
    }, []);

    return (
        <BodyDiv>
            <h1>Raumschiffe</h1>
            <div>
                <Table>
                    <TableHead>
                        <tr>
                            <TableHeadEntry text={"Name"}/>
                            <TableHeadEntry text={"Model"}/>
                            <TableHeadEntry text={"Preis"}/>
                            <TableHeadEntry text={"Länge"}/>
                            <TableHeadEntry text={"Max Geschwind."}/>
                            <TableHeadEntry text={"Max. Beladung"}/>
                            <TableHeadEntry text={"Hyperdrive"}/>
                            <TableHeadEntry text={"Klassifizierung"}/>
                            <TableHeadEntry text={"Crew Plätze"}/>
                            <TableHeadEntry text={"Passagier Plätze"}/>
                            <TableHeadEntry text={"MGLT"}/>
                            <TableHeadEntry text={"Aktionen"}/>
                        </tr>
                    </TableHead>
                    <TableBody>
                        {ship.map((data: Starship) => (
                            <tr key={data.id}>
                                <TableBodyEntry text={data.name}/>
                                <TableBodyEntry text={data.model}/>
                                <TableBodyEntry text={data.cost_in_credits + " Credits"}/>
                                <TableBodyEntry text={data.length}/>
                                <TableBodyEntry text={data.max_atmosphering_speed}/>
                                <TableBodyEntry text={data.cargo_capacity}/>
                                <TableBodyEntry text={data.hyperdrive_rating}/>
                                <TableBodyEntry text={data.starship_class}/>
                                <TableBodyEntry text={data.crew}/>
                                <TableBodyEntry text={data.passengers}/>
                                <TableBodyEntry text={data.MGLT}/>
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
    )
}