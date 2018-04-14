package in.samset.androidflavorsample;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivityFlavor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flavor_main);

        TextView textView = (TextView) findViewById(R.id.tv);
        textView.setText("Hello Statging App !");

        if (BuildConfig.FLAVOR.equalsIgnoreCase("staging")){
            Log.e("TAG"," Flavor is staging");
        }else {
            Log.e("TAG"," Flavor is prod");
        }
    }
}
