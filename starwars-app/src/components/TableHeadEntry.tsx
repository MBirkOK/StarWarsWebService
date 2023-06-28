import {styled} from "styled-components";
import {Label} from "./Label";

interface Props {
    text?: string,
    style?: string
}

const TableData = styled.th`
    border: 1px solid #AAAAAA;
    padding: 3px 2px;
    font-size: 18px;
    font-weight: bold;
    color: #FFFFFF;
`;

export const TableHeadEntry = (props: Props) => {
    return (
        <TableData className={props.style}>
            <Label text={props.text!}/>
        </TableData>
    )
}