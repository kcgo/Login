package sample.tqi.com.br.myapplication.login;

/**
 * Created by katia.goncalves on 29/11/2017.
 */

public interface LoginView {
    void showProgress();
    void hideProgress();
    void setUserNameError();
    void setPasswordError();
    void navigateTomMain();
    void showAlert( String message );
}
