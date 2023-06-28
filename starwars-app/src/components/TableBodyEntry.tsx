import {styled} from "styled-components";
import {Label} from "./Label";
import "../styles/main.css";

interface Props {
    text?: string,
    style?: string
}

const TableData = styled.td`
    margin: 2%;
    font-size: 15px;
    text-align: right;
`;

export const TableBodyEntry = (props: Props) => {
    return (
        <TableData className={props.style}>
            <Label text={props.text!}/>
        </TableData>
    )
}
