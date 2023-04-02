import React, { useState } from 'react'
import { useEffect } from 'react';
import { getTreeBranch } from '../service/tree-noc-service';
import { TreeLevelTwo } from '../styled/tree-styled';
import TreeBranch from './tree-branch';

const TreeTrunk = (props) => {

  const [listNOC, setListNOC] = useState([])
  const [idNOC, setIdNOC] = useState('')
  const [open, setOpen] = useState(false)

  useEffect(() => {
    if (idNOC !== '') {
      getTreeBranch(idNOC)
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
      <TreeLevelTwo onClick={handleTree}>{`${open ? '-' : '+'} [${props.code}] ${props.title}`}</TreeLevelTwo>
      {
        listNOC.map((item, i) => {
          return <TreeBranch  key={i} id={item.id} code={item.code} title={item.title} />
        })
      }
    </>
  )
}
export default TreeTrunk;