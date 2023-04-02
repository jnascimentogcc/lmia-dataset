import styled from "styled-components";

export const LogoImage = styled.img`
  height: 48px;

  @media only screen and (min-width: 480px) {
      height: 64px;
  }

  @media only screen and (min-width: 740px) {
      height: 88px;
  }

  @media only screen and (min-width: 1024px) {
      height: 102px;
  }
`

export const LogoText = styled.span`
  margin-top: 10px;
  font-weight: 600;
  font-size: 14px;

  @media only screen and (min-width: 480px) {
      font-size: 16px;
  }

  @media only screen and (min-width: 740px) {
      font-size: 20px;
  }

  @media only screen and (min-width: 1024px) {
      font-size: 22px;
  }
`

export const LogoDiv = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: flex-start;
  align-items: center;
  width: 100%;
  padding-bottom: 10px;
  box-shadow: rgba(0, 0, 0, 0.16) 0 4px 2px -2px;
`