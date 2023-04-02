export async function getTreeRoot() {

  const response = await fetch(`${process.env.REACT_APP_BE_URL}/noc/api/v1/list/root`, {
    method: 'GET',
    headers: {
      'Content-Type': 'application/json',
      'X-LD-TIMEZONE': Intl.DateTimeFormat().resolvedOptions().timeZone
    }
  })

  return await response.json()
}

export async function getTreeTrunk(idNOC) {

  const response = await fetch(`${process.env.REACT_APP_BE_URL}/noc/api/v1/list/trunk/${idNOC}`, {
    method: 'GET',
    headers: {
      'Content-Type': 'application/json',
      'X-LD-TIMEZONE': Intl.DateTimeFormat().resolvedOptions().timeZone
    }
  })

  return await response.json()
}

export async function getTreeBranch(idNOC) {

  const response = await fetch(`${process.env.REACT_APP_BE_URL}/noc/api/v1/list/branch/${idNOC}`, {
    method: 'GET',
    headers: {
      'Content-Type': 'application/json',
      'X-LD-TIMEZONE': Intl.DateTimeFormat().resolvedOptions().timeZone
    }
  })

  return await response.json()
}

export async function getTreeLeaf(idNOC) {

  const response = await fetch(`${process.env.REACT_APP_BE_URL}/noc/api/v1/list/leaf/${idNOC}`, {
    method: 'GET',
    headers: {
      'Content-Type': 'application/json',
      'X-LD-TIMEZONE': Intl.DateTimeFormat().resolvedOptions().timeZone
    }
  })

  return await response.json()
}
