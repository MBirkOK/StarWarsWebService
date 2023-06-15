import {styled} from "styled-components";


const Bar = styled.nav`
  background: #63D471;
  display: flex;
  justify-content: space-between;
  `;

const Primary = styled.li`
    background: #000000;
    display: flex;
    justify-content: space-between;
    `;

export default function Navigation() {
    return (
        <div>
            <Bar>
                <Primary>Link1</Primary>
                <li>Link2</li>
                <li>Link3</li>
            </Bar>
        </div>
    );
}
