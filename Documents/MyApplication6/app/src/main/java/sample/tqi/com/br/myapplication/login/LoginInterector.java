package sample.tqi.com.br.myapplication.login;

/**
 * Created by katia.goncalves on 29/11/2017.
 */

public interface LoginInterector {

    interface  onLoginFinishListener{

        void onUserNameError();
        void onPasswordError();
        void onSuccess();
        void onFailure( String message );

    }

    void login( String username, String password, onLoginFinishListener listener );
    }

