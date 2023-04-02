import styled from "styled-components";

export const TableFrame = styled.div`
    display: flex;
    flex-direction: column;
    width: 100%;
    border-top-left-radius: 5px;
    border-top-right-radius: 5px;
    box-shadow: rgba(0, 0, 0, 0.16) 0px 2px 4px;
`

export const TableHeader = styled.div`
    display: flex;
    flex-direction: row;
    width: 100%;
    background-color: red;
    height: 28px;
    border-top-left-radius: 5px;
    border-top-right-radius: 5px;

    @media only screen and (min-width: 480px) {
        height: 34px;
    }

    @media only screen and (min-width: 740px) {
        height: 46px;
    }

    @media only screen and (min-width: 1024px) {
        height: 60px;
    }
`

export const HeaderProvince = styled.div`
    display: flex;
    justify-content: flex-start;
    align-items: center;
    color: white;
    font-size: 12px;
    font-weight: 600;
    width: 45%;
    padding-left: 10px;

    @media only screen and (min-width: 480px) {
        height: 34px;
        font-size: 14px;
    }

    @media only screen and (min-width: 740px) {
        width: 30%;
        height: 46px;
        font-size: 16px;
    }

    @media only screen and (min-width: 1024px) {
        width: 20%;
        height: 60px;
        font-size: 18px;
    }
`

export const HeaderEmployer = styled.div`
    display: flex;
    justify-content: flex-start;
    align-items: center;
    color: white;
    font-size: 12px;
    font-weight: 600;
    width: 45%;

    @media only screen and (min-width: 480px) {
        height: 34px;
        font-size: 14px;
    }

    @media only screen and (min-width: 740px) {
        width: 30%;
        height: 46px;
        font-size: 16px;
    }

    @media only screen and (min-width: 1024px) {
        width: 20%;
        height: 60px;
        font-size: 18px;
    }
`

export const HeaderAddress = styled.div`
    display: none;
    justify-content: flex-start;
    align-items: center;
    color: white;
    font-size: 12px;
    font-weight: 600;

    @media only screen and (min-width: 740px) {
        display: flex;
        width: 30%;
        height: 46px;
        font-size: 16px;
    }

    @media only screen and (min-width: 1024px) {
        width: 20%;
        height: 60px;
        font-size: 18px;
    }
`

export const HeaderNoc = styled.div`

    display: none;
    justify-content: flex-start;
    align-items: center;
    color: white;
    font-size: 12px;
    font-weight: 600;

    @media only screen and (min-width: 1024px) {
        display: flex;
        width: 20%;
        height: 60px;
        font-size: 18px;
    }
`

export const HeaderQty = styled.div`
    display: flex;
    justify-content: flex-end;
    align-items: center;
    color: white;
    font-size: 12px;
    font-weight: 600;
    width: 10%;
    padding-right: 10px;

    @media only screen and (min-width: 480px) {
        height: 34px;
        font-size: 12px;
    }

    @media only screen and (min-width: 740px) {
        height: 46px;
        font-size: 16px;
    }

    @media only screen and (min-width: 1024px) {
        height: 60px;
        font-size: 18px;
    }
`

export const HeaderPeriod = styled.div`
    display: none;
    justify-content: flex-end;
    align-items: center;
    color: white;
    font-size: 12px;
    font-weight: 600;
    width: 10%;
    padding-right: 10px;

    @media only screen and (min-width: 1024px) {
        display: flex;
        height: 60px;
        font-size: 18px;
    }
`

export const TableRowOdd = styled.div`
    display: flex;
    flex-direction: row;
    align-items: center;
    width: 100%;
    background-color: white;
    min-height: 28px;
    border-top-left-radius: 5px;
    border-top-right-radius: 5px;
    border-bottom: 1px solid #dddddd;
    color: black;
    padding: 3px 0 3px 0;

    @media only screen and (min-width: 480px) {
        min-height: 34px;
    }

    @media only screen and (min-width: 740px) {
        min-height: 46px;
    }

    @media only screen and (min-width: 1024px) {
        min-height: 80px;
    }
`

export const TableRowEven = styled.div`
    display: flex;
    flex-direction: row;
    align-items: center;
    width: 100%;
    background-color: #f3f3f3;
    min-height: 28px;
    border-top-left-radius: 5px;
    border-top-right-radius: 5px;
    border-bottom: 1px solid #dddddd;
    color: red;
    padding: 3px 0 3px 0;

    @media only screen and (min-width: 480px) {
        min-height: 34px;
    }

    @media only screen and (min-width: 740px) {
        min-height: 46px;
    }

    @media only screen and (min-width: 1024px) {
        min-height: 80px;
    }
`

export const TableFooter = styled.div`
    display: flex;
    border-bottom: 2px solid red;
`

export const ColumnProvince = styled.div`
    display: flex;
    justify-content: flex-start;
    align-items: center;
    font-size: 10px;
    width: 45%;
    padding-left: 10px;

    @media only screen and (min-width: 480px) {
        height: 34px;
        font-size: 12px;
    }

    @media only screen and (min-width: 740px) {
        width: 30%;
        height: 46px;
        font-size: 14px;
    }

    @media only screen and (min-width: 1024px) {
        width: 20%;
        height: 60px;
        font-size: 16px;
    }
`

export const ColumnEmployer = styled.div`
    display: flex;
    justify-content: flex-start;
    align-items: center;
    font-size: 10px;
    width: 45%;

    @media only screen and (min-width: 480px) {
        height: 34px;
        font-size: 12px;
    }

    @media only screen and (min-width: 740px) {
        width: 30%;
        height: 46px;
        font-size: 14px;
    }

    @media only screen and (min-width: 1024px) {
        width: 20%;
        height: 60px;
        font-size: 16px;
    }
`

export const ColumnAddress = styled.div`
    display: none;
    justify-content: flex-start;
    align-items: center;
    font-size: 10px;
    color: red;
    font-weight: 600;
    cursor: pointer;

    @media only screen and (min-width: 740px) {
        display: flex;
        width: 30%;
        height: 46px;
        font-size: 14px;
    }

    @media only screen and (min-width: 1024px) {
        width: 20%;
        height: 60px;
        font-size: 16px;
    }
`

export const ColumnNoc = styled.div`
    display: none;
    justify-content: flex-start;
    align-items: center;
    font-size: 10px;

    @media only screen and (min-width: 1024px) {
        display: flex;
        width: 20%;
        height: 60px;
        font-size: 16px;
    }
`

export const ColumnQty = styled.div`
    display: flex;
    justify-content: flex-end;
    align-items: center;
    font-size: 10px;
    width: 10%;
    padding-right: 10px;

    @media only screen and (min-width: 480px) {
        height: 34px;
        font-size: 12px;
    }

    @media only screen and (min-width: 740px) {
        height: 46px;
        font-size: 14px;
    }

    @media only screen and (min-width: 1024px) {
        height: 60px;
        font-size: 16px;
    }
`

export const ColumnPeriod = styled.div`
    display: none;
    justify-content: flex-end;
    align-items: center;
    font-size: 10px;
    width: 10%;
    padding-right: 10px;

    @media only screen and (min-width: 1024px) {
        display: flex;
        height: 60px;
        font-size: 16px;
    }
`
