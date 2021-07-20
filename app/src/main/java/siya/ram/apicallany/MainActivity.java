package siya.ram.apicallany;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ram.hanumanjetpacklibrery.ApicallAny;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        withoutparams();
        withparams();

    }



    public void withoutparams(){
        String url="http://rt.com/api/my.php";
        ApicallAny.ApicallVolleywithoutParams(MainActivity.this,url, new ApicallAny.VolleyCallback() {
            @Override
            public void onSuccess(String result) {

                //  do stuff here

            }

            @Override
            public void onError(String result) {
                //  do stuff here
            }
        });

    }



    public void withparams(){
        Map params = new HashMap<>();

        params.put("param1","val");
        params.put("param2","valx");

        String url="http://rt.com/api/my.php";
        ApicallAny.ApicallVolleywithParams(MainActivity.this, url,params, new ApicallAny.VolleyCallback() {
            @Override
            public void onSuccess(String result) {

                //  do stuff here

            }

            @Override
            public void onError(String result) {
                //  do stuff here
            }
        });


    }
}