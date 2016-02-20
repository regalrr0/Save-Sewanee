package theregaltreatment.savesewanee;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.plus.Plus;
import android.content.Intent;

import java.util.Observable;


public class home extends login implements View.OnClickListener {

    TextView email;
    Intent test;
    boolean isOn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findViewById(R.id.sign_out_button).setOnClickListener(this);
        String Email = googleConnection.getAccountName();
        email = (TextView) findViewById(R.id.email);
        email.setText(Email);
        /*login state = getApplicationContext();
        setContentView(R.layout.activity_home);
        String currentAccount1 = Plus.AccountApi.getAccountName(state.mGoogleApiClient);
        ((TextView) findViewById(R.id.email)).setText(currentAccount1);*/
    }


    private void onSignOutClicked() {
      finish();
}

    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.sign_out_button:
                onSignOutClicked();
                break;
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}