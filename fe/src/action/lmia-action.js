import { LIST_LMIA } from './action-types'

export const popLMIA = (listLMIA) => ({
    type: LIST_LMIA,
    lmias: listLMIA
})
