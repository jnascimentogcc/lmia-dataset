import { OPEN_TREE_NOC } from '../action/action-types'

export function openTreeNOC(state = false, action) {
    switch (action.type) {
        case OPEN_TREE_NOC:
            return action.open;
        default:
            return state;
    }
}
