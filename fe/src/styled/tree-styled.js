import styled from "styled-components"

export const TreeLevelDiv = styled.div`
    display: flex;
    flex-direction: column;
    justify-content: flex-start;
    align-items: flex-start;
    color: red;
    padding: 10px 0 5px 10px;
    font-size: 10px;

    @media only screen and (min-width: 480px) {
      font-size: 10px;
    }

    @media only screen and (min-width: 740px) {
        font-size: 12px;
    }

    @media only screen and (min-width: 1024px) {
        font-size: 14px;
    }
`

export const TreeLevelOne = styled.div`
    display: flex;
    flex-direction: row;
    justify-content: flex-start;
    align-items: center;
    padding: 5px 0 5px 0;
    cursor: pointer;

    &:hover {
        color: #cf3a3a;
    }
`

export const TreeLevelTwo = styled.div`
    display: flex;
    flex-direction: row;
    justify-content: flex-start;
    align-items: center;
    padding: 5px 0 5px 20px;
    cursor: pointer;

    &:hover {
        color: #cf3a3a;
    }
`

export const TreeLevelThree = styled.div`
    display: flex;
    flex-direction: row;
    justify-content: flex-start;
    align-items: center;
    padding: 5px 0 5px 40px;
    cursor: pointer;

    &:hover {
        color: #cf3a3a;
    }
`

export const TreeLevelFour = styled.div`
    display: flex;
    flex-direction: row;
    justify-content: flex-start;
    align-items: center;
    padding: 5px 0 5px 60px;
    cursor: pointer;

    &:hover {
        color: #cf3a3a;
    }
`

