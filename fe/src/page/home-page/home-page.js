import { useEffect } from 'react';
import { useDispatch } from 'react-redux';
import { popProvince } from '../../action/province-action';
import Logo from '../../components/logo-component';
import Search from '../../components/search-component';
import Table from '../../components/table-component';
import { getProvince } from '../../service/province-service';
import { SelectLanguage } from '../../styled/search-styled';
import { Container, ContainerPage, FooterContact, FooterDiv, FooterLanguage } from '../../styled/section-styled';

const HomePage = () => {

  const dispatch = useDispatch()

  useEffect(() => {
    getProvince()
      .then((response) => {
        dispatch(popProvince(response.provinces))
      })
  }, [])

  const handleSelectLanguage = (evt) => {
    console.log(evt.target.value);
  }

  return (
    <>
      <Container>
        <ContainerPage>
          <Logo />
          <Search />
          <Table />
          <FooterDiv>
            <FooterContact>contact@actadi.com</FooterContact>
            <FooterLanguage style={{ display: 'none' }}>
              <SelectLanguage onChange={handleSelectLanguage}>
                <option value={'EN'}>English</option>
                <option value={'FR'}>French</option>
              </SelectLanguage>
            </FooterLanguage>
          </FooterDiv>
        </ContainerPage>
      </Container>
    </>
  )
}
export default HomePage;