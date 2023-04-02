import styled from "styled-components";

export const Container = styled.div`
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
`

export const ContainerPage = styled.div`
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    width: 352px;

    @media only screen and (min-width: 480px) {
        width: 472px;
    }

    @media only screen and (min-width: 740px) {
        width: 732px;
    }

    @media only screen and (min-width: 1024px) {
        width: 1016px;
    }
`

export const FooterDiv = styled.div`
    display: flex;
    flex-direction: row;
    justify-content: center;
    align-items: center;
    margin-top: 10px;
    font-size: 10px;
    width: 100%;

    @media only screen and (min-width: 480px) {
        font-size: 12px;
    }

    @media only screen and (min-width: 740px) {
        font-size: 14px;
    }

    @media only screen and (min-width: 1024px) {
        font-size: 16px;
    }
`

export const FooterContact = styled.div`
    display: flex;
    justify-content: flex-start;
    align-items: center;
    font-weight: 600;
`

export const FooterLanguage = styled.div`
    display: flex;
    justify-content: flex-end;
    align-items: center;
`