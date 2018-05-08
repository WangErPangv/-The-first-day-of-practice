package wby.laowang.loginxmt.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import wby.laowang.loginxmt.R;
import wby.laowang.loginxmt.model.LoginBean;
import wby.laowang.loginxmt.model.ModelFusion;
import wby.laowang.loginxmt.model.RegisterBean;
import wby.laowang.loginxmt.presenter.PresenterFusion;

public class MainActivity extends AppCompatActivity implements IMainView {

    private EditText edtel;
    private EditText edpass;
    private PresenterFusion presenterFusion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }



    private void initViews() {
        edtel = findViewById(R.id.edtel);
        edpass = findViewById(R.id.edpass);
    }

    public void login(View view) {
        presenterFusion = new PresenterFusion();
        presenterFusion.ShowLogintoView(new ModelFusion(),this);
    }

    public void zhuce(View view) {

        startActivity(new Intent(MainActivity.this,RegisterActivity.class));
    }

    @Override
    public void ShowLogin(LoginBean loginBean) {
        Toast.makeText(MainActivity.this,loginBean.getMsg(),Toast.LENGTH_SHORT).show();
        startActivity(new Intent(MainActivity.this,ShoppActivity.class));
    }

    @Override
    public void ShowlError(LoginBean loginBean) {
        Toast.makeText(MainActivity.this,loginBean.getMsg(),Toast.LENGTH_SHORT).show();
    }


    @Override
    public String mobile() {
        return edtel.getText().toString();
    }

    @Override
    public String pass() {
        return edpass.getText().toString();
    }
}
