import { Fragment, useEffect } from "react";
import { useNavigate } from "react-router-dom";

const App = () => {

  const navigate = useNavigate()

  useEffect(() => {
    navigate('/')
  })

  return (
    <Fragment>
      Loading...
    </Fragment>
  );
}

export default App;