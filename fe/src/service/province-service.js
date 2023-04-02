export async function getProvince() {

  const response = await fetch(`${process.env.REACT_APP_BE_URL}/sgc/api/v1/province/list`, {
    method: 'GET',
    headers: {
      'Content-Type': 'application/json',
      'X-LD-TIMEZONE': Intl.DateTimeFormat().resolvedOptions().timeZone
    }
  })

  return await response.json()
}

export async function getCity(idProvince) {

  const response = await fetch(`${process.env.REACT_APP_BE_URL}/sgc/api/v1/city/${idProvince}`, {
    method: 'GET',
    headers: {
      'Content-Type': 'application/json',
      'X-LD-TIMEZONE': Intl.DateTimeFormat().resolvedOptions().timeZone
    }
  })

  return await response.json()
}