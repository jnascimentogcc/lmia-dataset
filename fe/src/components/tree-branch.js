import React, { useEffect, useState } from 'react'
import { getTreeLeaf } from '../service/tree-noc-service';
import { TreeLevelThree } from '../styled/tree-styled';
import TreeLeaf from './tree-leaf';

const TreeBranch = (props) => {

  const [listNOC, setListNOC] = useState([])
  const [idNOC, setIdNOC] = useState('')
  const [open, setOpen] = useState(false)

  useEffect(() => {
    if (idNOC !== '') {
      getTreeLeaf(idNOC)
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
      <TreeLevelThree onClick={handleTree}>{`${open ? '-' : '+'} [${props.code}] ${props.title}`}</TreeLevelThree>
      {
        listNOC.map((item, i) => {
          return <TreeLeaf  key={i} id={item.id} code={item.code} title={item.title} />
        })
      }
    </>
  )
}
export default TreeBranch;