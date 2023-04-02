import { combineReducers } from 'redux'

import { popProvince } from './province-reducer';
import { popLMIA } from './lmia-reducer';
import { openTreeNOC } from './tree-noc-reducer';
import { setNOC } from './noc-reducer';

export const allReducers = combineReducers({
    popProvince: popProvince,
    popLMIA: popLMIA,
    openTreeNOC: openTreeNOC,
    setNOC: setNOC
});