import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App';
import {BrowserRouter} from "react-router-dom";
import axios from 'axios';

axios.defaults.baseURL='http://localhost:8080';
axios.defaults.headers.post['Content-Type']='application/json';


const root = ReactDOM.createRoot(
    document.getElementById('root') as HTMLElement
);
root.render(
    <React.StrictMode>
        <BrowserRouter>
                <App/>
        </BrowserRouter>
    </React.StrictMode>
);
