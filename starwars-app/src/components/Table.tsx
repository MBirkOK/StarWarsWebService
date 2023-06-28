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