import React from 'react';
import {Menu, MenuItem, Sidebar} from "react-pro-sidebar";
import HomeIcon from '@mui/icons-material/Home';
import TheatersIcon from '@mui/icons-material/Theaters';
import RocketIcon from '@mui/icons-material/Rocket';
import PeopleIcon from '@mui/icons-material/People';
import PublicIcon from '@mui/icons-material/Public';
import {Link, Route, Routes} from "react-router-dom";
import Home from "./sites/Home";
import "../src/styles/main.css";
import {styled} from "styled-components";
import {SidebarHeader} from "./components/SidebarHeader";
import Planets from "./sites/Planets";


function App() {
    return (
        <Main>
            <Sidebar className="app">
                <SidebarHeader rtl={false}></SidebarHeader>
                <Menu>
                    <MenuItem className="menu1" icon={<HomeIcon/>}
                              component={<Link to={"home"}/>}
                    >Home</MenuItem>
                    <MenuItem className="menu1" icon={<TheatersIcon/>}
                              component={<Link to={"film"}/>}
                    >Filme</MenuItem>
                    <MenuItem className="menu1" icon={<RocketIcon/>}
                              component={<Link to={"spaceship"}/>}
                    >Raumschiffe</MenuItem>
                    <MenuItem className="menu1" icon={<PeopleIcon/>}
                              component={<Link to={"character"}/>}
                    >Charaktere</MenuItem>
                    <MenuItem className="menu1" icon={<PublicIcon/>}
                              component={<Link to={"planet"}/>}
                    >Planeten</MenuItem>
                </Menu>
            </Sidebar>
            <section>
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/home" element={<Home/>}/>
                    <Route path="/film" element={<Home/>}/>
                    <Route path="/spaceship" element={<Home/>}/>
                    <Route path="/character" element={<Home/>}/>
                    <Route path="/planet" element={<Planets/>}/>
                </Routes>
            </section>
        </Main>
    );
}

const Main = styled.div`display: flex; height: 100vh`;

export default App;
