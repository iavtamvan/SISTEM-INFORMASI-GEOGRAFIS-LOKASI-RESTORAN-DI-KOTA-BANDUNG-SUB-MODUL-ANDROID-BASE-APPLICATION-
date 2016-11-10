package apps.com.kusnadi.myrestaurantmapproxy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/**
 * Created by Kusnadi on 11/5/2016.
 */

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        //melakukan enable tombol back pada menu setting
        Toolbar tl;
        tl = (Toolbar) findViewById(R.id.toolbar);
        tl.setTitle("Menu Setting");
        setSupportActionBar(tl);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == android.R.id.home){
            finish();
        }
        return true;
    }
}