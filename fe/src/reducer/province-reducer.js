import { LIST_PROVINCE } from '../action/action-types'

export function popProvince(state = [], action) {
    switch (action.type) {
        case LIST_PROVINCE:
            return action.provinces;
        default:
            return state;
    }
}
