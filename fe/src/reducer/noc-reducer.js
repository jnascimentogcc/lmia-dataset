import { SET_NOC_SEARCH } from '../action/action-types'

export function setNOC(state = {id: '', title: ''}, action) {
    switch (action.type) {
        case SET_NOC_SEARCH:
            return action.noc;
        default:
            return state;
    }
}
