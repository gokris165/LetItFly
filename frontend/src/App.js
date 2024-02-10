import {
  RouterProvider,
  createBrowserRouter,
  createRoutesFromElements,
  Route,
} from "react-router-dom";
import Login from "./pages/Login";
import Register from "./pages/Register";
import CustomerHome from "./pages/CustomerHome";
import CustomerSettings from "./pages/CustomerSettings";
import CustomerRide from "./pages/CustomerRide";
import DriverHome from "./pages/DriverHome";
import DriverSettings from "./pages/DriverSettings";
import DriverRide from "./pages/DriverRide";
import NotFound from "./pages/NotFound";

function App() {
  const pathname = window.location.pathname;
  if (!pathname.includes("register")) {
    localStorage.removeItem("oldData");
  }

  const router = createBrowserRouter(
    createRoutesFromElements(
      <Route path="/">
        <Route index element={<Login />} />
        <Route path="register" element={<Register />} />
        <Route path="customer">
          <Route index element={<CustomerHome />} />
          <Route path="settings" element={<CustomerSettings />} />
          <Route path="ride" element={<CustomerRide />} />
        </Route>
        <Route path="driver">
          <Route index element={<DriverHome />} />
          <Route path="settings" element={<DriverSettings />} />
          <Route path="ride" element={<DriverRide />} />
        </Route>
        <Route path="*" element={<NotFound />} />
      </Route>
    )
  );
  return (
    <div>
      <RouterProvider router={router}></RouterProvider>
    </div>
  );
}

export default App;
