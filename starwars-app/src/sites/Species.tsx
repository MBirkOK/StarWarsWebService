import {useEffect, useState} from "react";
import {BodyDiv} from "../resources/styled-components/BodyDiv";
import {Table, TableHead} from "../resources/styled-components/Table";
import {TableHeadEntry} from "../components/TableHeadEntry";
import {TableBodyEntry} from "../components/TableBodyEntry";
import {BsFillPencilFill, BsFillTrashFill} from "react-icons/bs";
import {TableBody} from "@mui/material";
import {get_all_species} from "../services/SpeciesService";
import {Specie} from "../schemas/specie";

export default function Species() {
    const [spezies, setSpezies] = useState<Specie[]>([]);

    useEffect(() => {
        get_all_species().then((res) => setSpezies(res.data))
    }, []);
    return (
        <BodyDiv>
            <h1>Spezien</h1>
            <div>
                <Table>
                    <TableHead>
                        <tr>
                            <TableHeadEntry text={"Name"}/>
                            <TableHeadEntry text={"Klassifizierung"}/>
                            <TableHeadEntry text={"Bezeichnung"}/>
                            <TableHeadEntry text={"Sprache"}/>
                            <TableHeadEntry text={"Durch. Höhe"}/>
                            <TableHeadEntry text={"Durch. Lebenszeit"}/>
                            <TableHeadEntry text={"Augenfarbe"}/>
                            <TableHeadEntry text={"Haarfarbe"}/>
                            <TableHeadEntry text={"Heimatplanet"}/>
                            <TableHeadEntry text={"Hautfarben"}/>
                            <TableHeadEntry text={"Aktionen"}/>
                        </tr>
                    </TableHead>
                    <TableBody>
                        {spezies.map((data: Specie) => (
                            <tr key={data.id}>
                                <TableBodyEntry text={data.name}/>
                                <TableBodyEntry text={data.classification}/>
                                <TableBodyEntry text={data.designation}/>
                                <TableBodyEntry text={data.language}/>
                                <TableBodyEntry text={data.average_height}/>
                                <TableBodyEntry text={data.average_lifespan}/>
                                <TableBodyEntry text={data.eye_colors}/>
                                <TableBodyEntry text={data.hair_colors}/>
                                <TableBodyEntry text={data.homeworld}/>
                                <TableBodyEntry text={data.skin_colors}/>
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