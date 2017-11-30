package sample.tqi.com.br.myapplication.login;

/**
 * Created by katia.goncalves on 29/11/2017.
 */

public interface LoginPresenter {
    void validateCred( String username, String password );
    void onDestroy();
}
