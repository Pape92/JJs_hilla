import {LoginForm} from "@hilla/react-components/LoginForm.js";

export function LoginView() {

  return(
    <div className="flex items-center justify-center h-full">
      <LoginForm action="login" noForgotPassword />
    </div>
  )
}
