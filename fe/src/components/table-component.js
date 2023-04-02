import React from 'react'
import { useSelector } from 'react-redux';
import { ColumnAddress, ColumnEmployer, ColumnNoc, ColumnPeriod, ColumnProvince, ColumnQty, HeaderAddress, HeaderEmployer, HeaderNoc, HeaderPeriod, HeaderProvince, HeaderQty, TableFooter, TableFrame, TableHeader, TableRowEven, TableRowOdd } from '../styled/table-styled';

const Table = () => {

  const lmias = useSelector(state => state.popLMIA)

  const handleOpenMap = (address) => {
    window.open(`https://www.google.com/maps/place/${address},+Canad%C3%A1`, '_blank');
  }

  return (
    <TableFrame>
      <TableHeader>
        <HeaderProvince>Province</HeaderProvince>
        <HeaderEmployer>Employer</HeaderEmployer>
        <HeaderAddress>Address</HeaderAddress>
        <HeaderNoc>Occupation</HeaderNoc>
        <HeaderQty>Qty</HeaderQty>
        <HeaderPeriod>Year</HeaderPeriod>
      </TableHeader>
      {
        lmias.map((item, i) => {
          if (i % 2 === 0) {
            return (
              <TableRowOdd key={i}>
                <ColumnProvince>{item.province}</ColumnProvince>
                <ColumnEmployer>{item.employer}</ColumnEmployer>
                <ColumnAddress onClick={() => handleOpenMap(item.address)}>{item.address}</ColumnAddress>
                <ColumnNoc>{item.occupation}</ColumnNoc>
                <ColumnQty>{item.qtyApproved}</ColumnQty>
                <ColumnPeriod>{item.year}Q{item.quarter}</ColumnPeriod>
              </TableRowOdd>
            )
          } else {
            return (
              <TableRowEven key={i}>
                <ColumnProvince>{item.province}</ColumnProvince>
                <ColumnEmployer>{item.employer}</ColumnEmployer>
                <ColumnAddress onClick={() => handleOpenMap(item.address)}>{item.address}</ColumnAddress>
                <ColumnNoc>{item.occupation}</ColumnNoc>
                <ColumnQty>{item.qtyApproved}</ColumnQty>
                <ColumnPeriod>{item.year}Q{item.quarter}</ColumnPeriod>
              </TableRowEven>
            )
          }
        })
      }
      <TableFooter />
    </TableFrame>
  )
}
export default Table;
