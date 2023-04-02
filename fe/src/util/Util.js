export function isEmpty(obj) {
  for (var key in obj) {
    if (obj.hasOwnProperty(key))
      return false;
  }
  return true;
}

export function fixNullUndefined(attribute) {
  return (attribute === null || attribute === undefined ? '' : attribute)
}
