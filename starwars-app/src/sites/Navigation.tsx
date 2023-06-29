import {Menu, MenuItem, Sidebar} from "react-pro-sidebar";
import {Link} from "react-router-dom";
import HomeIcon from '@mui/icons-material/Home';
import TheatersIcon from '@mui/icons-material/Theaters';
import RocketIcon from '@mui/icons-material/Rocket';
import PeopleIcon from '@mui/icons-material/People';
import PublicIcon from '@mui/icons-material/Public';
import BiotechIcon from '@mui/icons-material/Biotech';
import DirectionsCarIcon from '@mui/icons-material/DirectionsCar';

export default function Navigation() {

    return (
        <Sidebar className="app">
            <Menu>
                <MenuItem className="menu1" icon={<HomeIcon/>}
                          component={<Link to={"home"}/>}>
                    Home
                </MenuItem>
                <MenuItem className="menu1" icon={<TheatersIcon/>}
                          component={<Link to={"movie"}/>}>
                    Filme
                </MenuItem>
                <MenuItem className="menu1" icon={<PeopleIcon/>}
                          component={<Link to={"character"}/>}>
                    Charaktere
                </MenuItem>
                <MenuItem className="menu1" icon={<BiotechIcon/>}
                          component={<Link to={"spezies"}/>}>
                    Spezien
                </MenuItem>
                <MenuItem className="menu1" icon={<PublicIcon/>}
                          component={<Link to={"planet"}/>}>
                    Planeten
                </MenuItem>
                <MenuItem className="menu1" icon={<RocketIcon/>}
                          component={<Link to={"spaceship"}/>}>
                    Raumschiffe
                </MenuItem>
                <MenuItem className="menu1" icon={<DirectionsCarIcon/>}
                          component={<Link to={"vehicles"}/>}>
                    Fahrzeuge
                </MenuItem>
            </Menu>
        </Sidebar>
    );
}
