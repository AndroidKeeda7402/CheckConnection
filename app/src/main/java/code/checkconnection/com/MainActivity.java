package code.checkconnection.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConnectionDetector cd;
    Boolean isInternetPresent = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cd = new ConnectionDetector(MainActivity.this);
        isInternetPresent = cd.isConnectingToInternet();

        if (isInternetPresent) {
            Toast.makeText(this, "connected", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Not connected", Toast.LENGTH_SHORT).show();
        }
    }
}
