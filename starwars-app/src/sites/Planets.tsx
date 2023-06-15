import {SetStateAction, useEffect, useState} from "react";
import {get_all_planets} from "../services/PlanetService";
import {styled} from "styled-components";
import {TableBody} from "@mui/material";
import {BsFillTrashFill, BsFillPencilFill} from "react-icons/bs";
import "../styles/main.css";



const Table = styled.table`
    border: 1px solid #1C6EA4;
    background-color: #EEEEEE;
    width: 80vw;
    text-align: left;
    border-collapse: collapse;
`;

const TableHead = styled.thead`
    background: #165A72;
    background: -moz-linear-gradient(top, #508395 0%, #2d6a80 66%, #165A72 100%);
    background: -webkit-linear-gradient(top, #508395 0%, #2d6a80 66%, #165A72 100%);
    background: linear-gradient(to bottom, #508395 0%, #2d6a80 66%, #165A72 100%);
    border-bottom: 2px solid #444444;
    font-weight: bold;
    color: #FFFFFF;
    border-left: 2px solid #D0E4F5;
    `;
const TableHeadEntry = styled.th`
    border: 1px solid #AAAAAA;
    padding: 3px 2px;
    font-size: 18px;
    font-weight: bold;
    color: #FFFFFF;
    border-left: 2px solid #D0E4F5;
`;
const BodyDiv = styled.div`
    margin-left: 2%;
`;

const TableBodyEntry = styled.td`
font-size: 15px;
`;


export default function Planets() {
    const [planets, setPlanets] = useState([]);

    useEffect(() => {
        get_all_planets().then((res: { data: SetStateAction<never[]>; }) => setPlanets(res.data))
    }, []);

    return (
        <BodyDiv>
            <h2>Alle Planeten</h2>
            <div>
                <Table>
                    <TableHead>
                        <TableHeadEntry>Name</TableHeadEntry>
                        <TableHeadEntry>Durchmesser</TableHeadEntry>
                        <TableHeadEntry>Rotation</TableHeadEntry>
                        <TableHeadEntry>Gravitation</TableHeadEntry>
                        <TableHeadEntry>Klima</TableHeadEntry>
                        <TableHeadEntry>Terrain</TableHeadEntry>
                        <TableHeadEntry>Wasser</TableHeadEntry>
                        <TableHeadEntry>Orbital</TableHeadEntry>
                        <TableHeadEntry>Population</TableHeadEntry>
                        <TableHeadEntry>Aktionen</TableHeadEntry>
                    </TableHead>
                    <TableBody>
                        {planets.map((data: any) => (
                            <tr key={data.id}>
                                <TableBodyEntry>
                                    <label>{data.name}</label>
                                </TableBodyEntry>
                                <TableBodyEntry>
                                    <label> {data.diameter} </label>
                                </TableBodyEntry>
                                <TableBodyEntry>
                                    <label> {data.rotation_period} </label>
                                </TableBodyEntry>
                                <TableBodyEntry>
                                    <label> {data.gravity} </label>
                                </TableBodyEntry>
                                <TableBodyEntry>
                                    <label> {data.climate} </label>
                                </TableBodyEntry>
                                <TableBodyEntry>
                                    <label> {data.terrain} </label>
                                </TableBodyEntry>
                                <TableBodyEntry>
                                    <label> {data.surface_water} </label>
                                </TableBodyEntry>
                                <TableBodyEntry>
                                    <label> {data.orbital_period} </label>
                                </TableBodyEntry>
                                <TableBodyEntry>
                                    <label> {data.population} </label>
                                </TableBodyEntry>
                                <TableBodyEntry>
                                    <BsFillPencilFill />
                                    <BsFillTrashFill />
                                </TableBodyEntry>
                            </tr>
                        ))}
                    </TableBody>
                </Table>
            </div>
        </BodyDiv>
    );
}