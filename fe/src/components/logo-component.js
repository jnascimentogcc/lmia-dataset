import React from 'react'
import { LogoDiv, LogoImage, LogoText } from '../styled/logo-styled';

const Logo = () => {
  return (
    <LogoDiv>
      <LogoImage src='/img/mapple-leaf.png' alt='LMIA :: Dataset' />
      <LogoText>LMIA :: Dataset</LogoText>
    </LogoDiv>
  )
}
export default Logo;