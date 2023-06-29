import React from 'react';
import "../src/styles/main.css";
import {styled} from "styled-components";
import LocalRoutes from './resources/routes/LocalRoutes';
import Navigation from './sites/Navigation';


function App() {
    return (
        <Main>
            <Navigation/>
            <section>
                <LocalRoutes/>
            </section>
        </Main>
    );
}

const Main = styled.div`display: flex; height: 100vh`;

export default App;
