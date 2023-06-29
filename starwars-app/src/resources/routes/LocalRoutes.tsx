import Home from "../../sites/Home";
import Planets from "../../sites/Planets";
import Characters from "../../sites/Characters";
import Starships from "../../sites/Starships";
import Species from "../../sites/Species";
import Vehicle from "../../sites/Vehicle";
import Movies from "../../sites/Movies";
import {Route, Routes} from "react-router-dom";

export default function LocalRoutes() {

    return (
        <Routes>
            <Route path="/" element={<Home/>}/>
            <Route path="/home" element={<Home/>}/>
            <Route path="/movie" element={<Movies/>}/>
            <Route path="/spaceship" element={<Starships/>}/>
            <Route path="/character" element={<Characters/>}/>
            <Route path="/planet" element={<Planets/>}/>
            <Route path="/spezies" element={<Species/>}/>
            <Route path="/vehicles" element={<Vehicle/>}/>
        </Routes>
    );
}