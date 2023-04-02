import { LIST_LMIA } from '../action/action-types'

export function popLMIA(state = [], action) {
    switch (action.type) {
        case LIST_LMIA:
            return action.lmias;
        default:
            return state;
    }
}
