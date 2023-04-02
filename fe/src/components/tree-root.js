import React, { useState } from 'react'
import { useEffect } from 'react';
import { getTreeTrunk } from '../service/tree-noc-service';
import { TreeLevelOne } from '../styled/tree-styled';
import TreeTrunk from './tree-trunk';

const TreeRoot = (props) => {

  const [listNOC, setListNOC] = useState([])
  const [idNOC, setIdNOC] = useState('')
  const [open, setOpen] = useState(false)

  useEffect(() => {
    if (idNOC !== '') {
      getTreeTrunk(idNOC)
        .then((reponse) => {
          setListNOC(reponse.occupations)
        })
    }
  }, [idNOC])

  const handleTree = () => {
    if (!open) {
      setIdNOC(props.id)
    } else {
      setIdNOC('')
      setListNOC([])
    }
    setOpen(!open)
  }

  return (
    <>
      <TreeLevelOne onClick={handleTree}>{`${open ? '-' : '+'} [${props.code}] ${props.title}`}</TreeLevelOne>
      {
        listNOC.map((item, i) => {
          return <TreeTrunk  key={i} id={item.id} code={item.code} title={item.title} />
        })
      }
    </>
  )
}
export default TreeRoot;