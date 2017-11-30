package sample.tqi.com.br.myapplication.login;

/**
 * Created by katia.goncalves on 29/11/2017.
 */

public class LoginPresenterImpl implements LoginPresenter, LoginInterector.onLoginFinishListener {

    LoginView mLoginView;
    LoginInterector mLoginInteractor;

    public LoginPresenterImpl(LoginView mLoginView){
        this.mLoginView = mLoginView;
        mLoginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void validateCred( String username, String password ) {
        if(mLoginView !=null){
            mLoginView.showProgress();

        }
        mLoginInteractor.login(username,password,this);

    }

    @Override
    public void onDestroy() {
        if (mLoginView != null){
            mLoginView = null;
        }


    }

    @Override
    public void onUserNameError() {
        if (mLoginView != null) {
            mLoginView.hideProgress();
            mLoginView.setUserNameError();
        }

    }

    @Override
    public void onPasswordError() {
        if (mLoginView != null) {
            mLoginView.hideProgress();
            mLoginView.setPasswordError();
        }

    }

    @Override
    public void onSuccess() {
        if (mLoginView != null) {
            mLoginView.hideProgress();
            mLoginView.navigateTomMain();
        }

    }

    @Override
    public void onFailure( String message ) {
        if (mLoginView != null) {
            mLoginView.hideProgress();
            mLoginView.showAlert(message);

        }

    }
}
