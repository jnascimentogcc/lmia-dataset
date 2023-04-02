export async function getLMIA(idProvince, idCity, idNOC) {

    const response = await fetch(`${process.env.REACT_APP_BE_URL}/lmia/api/v1/search`, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
        'X-LD-TIMEZONE': Intl.DateTimeFormat().resolvedOptions().timeZone
      },
      body: JSON.stringify({
        idProvince: idProvince,
        idCity: idCity,
        idNOC: idNOC
      })
    })
    
    return await response.json()
  }