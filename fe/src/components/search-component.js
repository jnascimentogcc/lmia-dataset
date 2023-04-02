import React, { useState } from 'react'
import { useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { popLMIA } from '../action/lmia-action';
import { openTreeNOC } from '../action/tree-noc-action';
import { getLMIA } from '../service/lmia-service';
import { getCity } from '../service/province-service';
import { ButtonSearch, Divider, DividerRow, InfoDiv, InputDiv, InputSearch, SearchButtonDiv, SearchFrame, SelectSearch } from '../styled/search-styled';
import TreeNOC from './tree-noc';

const Search = () => {

  const dispatch = useDispatch()

  const provinces = useSelector(state => state.popProvince)
  const openTree = useSelector(state => state.openTreeNOC)
  const noc = useSelector(state => state.setNOC)

  const [province, setProvince] = useState('')
  const [city, setCity] = useState('')
  const [cities, setCities] = useState([])

  useEffect(() => {
    if (provinces[0]) {
      setProvince(provinces[0].id)
    }
  }, [provinces])

  useEffect(() => {
    if (province !== '') {
      getCity(province)
        .then((response) => {
          response.cities.unshift({
            'id': '',
            'name': '(All cities)'
          })
          setCities(response.cities)
        })
    }
  }, [province])

  useEffect(() => {
    if (cities[0]) {
      setCity(cities[0].id)
    }
  }, [cities])

  const handleSelectProvince = (evt) => {
    setProvince(evt.target.value)
  }

  const handleSelectCity = (evt) => {
    setCity(evt.target.value)
  }

  const toogleOpen = () => {
    dispatch(openTreeNOC(!openTree))
  }

  const handleSearch = () => {
    getLMIA(province, city, noc.id)
      .then((response) => {
        dispatch(popLMIA(response.lmias))
      })
  }

  return (
    <SearchFrame>
      <TreeNOC />
      <Divider style={{ display: (openTree ? 'flex' : 'none') }}>
        <DividerRow />
      </Divider>
      <InputDiv style={{ display: (openTree ? 'flex' : 'none') }}>
        <InputSearch value={noc.title} disabled />
      </InputDiv>
      <InputDiv style={{ display: (openTree ? 'flex' : 'none') }}>
        <SelectSearch onChange={handleSelectProvince}>
          {
            provinces.map((item, i) => {
              return <option key={i} value={item.id}>{item.name}</option>
            })
          }
        </SelectSearch>
      </InputDiv>
      <InputDiv style={{ display: (openTree ? 'flex' : 'none') }}>
        <SelectSearch onChange={handleSelectCity}>
          {
            cities.map((item, i) => {
              return <option key={i} value={item.id}>{item.name}</option>
            })
          }
        </SelectSearch>
      </InputDiv>
      <SearchButtonDiv>
        <ButtonSearch style={{ display: (openTree ? 'none' : 'flex') }} onClick={toogleOpen}>Open Search Form</ButtonSearch>
        <ButtonSearch style={{ display: (openTree ? 'flex' : 'none') }} onClick={handleSearch}>Search LMIA</ButtonSearch>
        <ButtonSearch style={{ display: (openTree ? 'flex' : 'none') }} onClick={toogleOpen}>Close Search</ButtonSearch>
      </SearchButtonDiv>
      <InfoDiv style={{ display: (openTree ? 'flex' : 'none') }}>
        * The source for all information in this report is Employment and Social Development Canada's (ESDC) LMIA System
      </InfoDiv>
      <InfoDiv style={{ display: (openTree ? 'flex' : 'none') }}>
        * All information is manually entered in system. As such, accuracy of the information is subject to potential data entry error and inconsistent spelling
      </InfoDiv>
    </SearchFrame>
  )
}
export default Search;