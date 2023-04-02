import styled from "styled-components";

export const SearchFrame = styled.div`
    display: flex;
    flex-direction: column;
    border-radius: 5px;
    border: 1px solid red;
    width: 100%;
    margin-bottom: 10px;
`

export const SearchButtonDiv = styled.div`
    display: flex;
    flex-direction: row;
    justify-content: center;
    align-items: center;
    width: 100%;
    padding: 10px 0 10px 0;
    cursor: pointer;
`

export const ButtonSearch = styled.div`
    background-color: red;
    color: white;
    font-size: 12px;
    font-weight: 600;
    border-radius: 3px;
    padding: 5px 10px 5px 10px;
    margin-right: 10px;

    &:hover {
        background-color: #cf3a3a;
    }

    @media only screen and (min-width: 480px) {
      font-size: 14px;
    }

    @media only screen and (min-width: 740px) {
        font-size: 16px;
        padding: 8px 14px 8px 14px;
    }

    @media only screen and (min-width: 1024px) {
        font-size: 18px;
    }
`

export const Divider = styled.div`
    display: flex;
    justify-content: center;
`

export const DividerRow = styled.div`
    display: flex;
    justify-content: center;
    align-items: center;
    width: 90%;
    border: 1px solid gray;
`

export const InputDiv = styled.div`
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    padding: 5px 0 5px 0;
    width: 100%;
`

export const InputSearch = styled.input`
    font-weight: 600;
    font-size: 10px;
    color: red;
    padding: 10px 10px;
    border-radius: 3px;
    border: 1px solid #D9D9D9;
    outline: none;
    width: 90%;

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

export const SelectSearch = styled.select`
    font-weight: 600;
    font-size: 10px;
    color: red;
    padding: 10px 10px;
    border-radius: 3px;
    border: 1px solid #D9D9D9;
    outline: none;
    width: 90%;

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

export const SelectLanguage = styled.select`
    font-size: 10px;
    color: red;
    padding: 5px 5px;
    border-radius: 3px;
    border: 1px solid #D9D9D9;
    outline: none;
    width: 100%;

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

export const InfoDiv = styled.div`
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    padding: 0 5px 5px 5px;
    font-size: 10px;
    color: red;
`