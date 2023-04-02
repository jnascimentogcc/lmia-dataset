import React from 'react';
import ReactDOM from 'react-dom';
import { Provider } from 'react-redux'
import { BrowserRouter } from 'react-router-dom'
import { Routes, Route } from "react-router-dom";

import './i18n';
import HomePage from './page/home-page/home-page';
import confStore from './store/conf-store';

const store = confStore()

ReactDOM.render(
  <Provider store={store}>
    <BrowserRouter>
      <Routes>
        <Route path="/home.page" element={<HomePage />} />
        <Route path="/" element={<HomePage />} />
        <Route path="*" element={<HomePage />} />
      </Routes>
    </BrowserRouter>
  </Provider>,
  document.getElementById('root')
)