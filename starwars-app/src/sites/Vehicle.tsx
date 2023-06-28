import {SetStateAction, useEffect, useState} from "react";
import {BodyDiv} from "../components/BodyDiv";
import {Table} from "../components/Table";
import {TableHead} from "../components/TableHead";
import {TableHeadEntry} from "../components/TableHeadEntry";
import {TableBodyEntry} from "../components/TableBodyEntry";
import {BsFillPencilFill, BsFillTrashFill} from "react-icons/bs";
import {TableBody} from "@mui/material";
import {get_all_vehicle} from "../services/VehicleService";
import {Vehicle} from "../schemas/vehicles";

export default function Vehicles() {
    const [vehicle, setVehicle] = useState([]);

    useEffect(() => {
        get_all_vehicle().then((res: { data: SetStateAction<never[]>; }) => {
            setVehicle(res.data)
        })
    }, []);
    return (
        <BodyDiv>
            <h1>Fahrzeuge</h1>
            <div>
                <Table>
                    <TableHead>
                        <tr>
                            <TableHeadEntry text={"Name"}/>
                            <TableHeadEntry text={"Model"}/>
                            <TableHeadEntry text={"Klasse"}/>
                            <TableHeadEntry text={"Hersteller"}/>
                            <TableHeadEntry text={"Preis"}/>
                            <TableHeadEntry text={"Länge"}/>
                            <TableHeadEntry text={"Max. Geschw."}/>
                            <TableHeadEntry text={"Cargo"}/>
                            <TableHeadEntry text={"Treibstoff"}/>
                            <TableHeadEntry text={"Passagier Plätze"}/>
                            <TableHeadEntry text={"Aktionen"}/>
                        </tr>
                    </TableHead>
                    <TableBody>
                        {vehicle.map((data: Vehicle) => (
                            <tr key={data.id}>
                                <TableBodyEntry text={data.name}/>
                                <TableBodyEntry text={data.model}/>
                                <TableBodyEntry text={data.vehicle_class}/>
                                <TableBodyEntry text={data.manufacturer}/>
                                <TableBodyEntry text={data.cost_in_credits + " Credits"}/>
                                <TableBodyEntry text={data.length}/>
                                <TableBodyEntry text={data.max_atmosphering_speed}/>
                                <TableBodyEntry text={data.cargo_capacity}/>
                                <TableBodyEntry text={data.consumables}/>
                                <TableBodyEntry text={data.crew.length.toString()}/>
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