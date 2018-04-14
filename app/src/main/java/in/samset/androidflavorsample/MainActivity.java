package in.samset.androidflavorsample;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import static in.samset.androidflavorsample.BaseRequest.BASEURL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("TAG", " Selected Base url "+BASEURL);

        if (BuildConfig.FLAVOR.equalsIgnoreCase("staging")){
            Log.e("TAG"," Flavor is staging");
        }else {
            Log.e("TAG"," Flavor is prod");
        }
    }
}
