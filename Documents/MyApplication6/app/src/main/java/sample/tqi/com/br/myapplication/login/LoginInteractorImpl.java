package sample.tqi.com.br.myapplication.login;

import android.text.TextUtils;

/**
 * Created by katia.goncalves on 30/11/2017.
 */

class LoginInteractorImpl implements LoginInterector {
    @Override
    public void login( String username, String password, onLoginFinishListener listener ) {
        if (TextUtils.isEmpty(username)) {
            listener.onUserNameError();
        } else if (TextUtils.isEmpty(password)) {
            listener.onPasswordError();
        } else if (username.equals("admin") && password.equals("12345")) {
            listener.onSuccess();
        } else {
            listener.onFailure("Invalid Credentials ");
        }
    }
}
