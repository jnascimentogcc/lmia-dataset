import React from 'react'
import { useDispatch } from 'react-redux';
import { setNOC } from '../action/noc-action';
import { TreeLevelFour } from '../styled/tree-styled';

const TreeLeaf = (props) => {

  const dispatch = useDispatch()

  const handleNOC = () => {
    dispatch(setNOC({
      id: props.id,
      title: props.title
    }))
  }

  return (
    <>
      <TreeLevelFour onClick={handleNOC}>{`[${props.code}] ${props.title}`}</TreeLevelFour>
    </>
  )
}
export default TreeLeaf;