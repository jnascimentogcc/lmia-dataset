import React, { useEffect, useState } from 'react'
import { useSelector } from 'react-redux';
import { getTreeRoot } from '../service/tree-noc-service';
import { TreeLevelDiv } from '../styled/tree-styled';
import TreeRoot from './tree-root';

const TreeNOC = () => {

  const openTreeNOC = useSelector(state => state.openTreeNOC)

  const [listNOC, setListNOC] = useState([])

  useEffect(() => {
    getTreeRoot()
      .then((reponse) => {
        setListNOC(reponse.occupations)
      })
  }, [])

  return (
    <TreeLevelDiv style={{ display: (openTreeNOC ? 'flex' : 'none') }}>
      {
        listNOC.map((item, i) => {
          return <TreeRoot key={i} id={item.id} code={item.code} title={item.title} />
        })
      }
    </TreeLevelDiv>

  )
}
export default TreeNOC;