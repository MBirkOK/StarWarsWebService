import {styled} from "styled-components";

export const Table = styled.table`
    border: 1px solid #AAAAAA;
    background-color: #EEEEEE;
    width: 80vw;
    border-collapse: collapse;
    & tr:nth-child(even){
        background-color: #d6d6d6;
    }
`;

export const TableHead = styled.thead`
    background: #165A72;
    background: -moz-linear-gradient(top, #508395 0%, #2d6a80 66%, #165A72 100%);
    background: -webkit-linear-gradient(top, #508395 0%, #2d6a80 66%, #165A72 100%);
    background: linear-gradient(to bottom, #508395 0%, #2d6a80 66%, #165A72 100%);
    border-bottom: 2px solid #444444;
    font-weight: bold;
    color: #FFFFFF;
    `;