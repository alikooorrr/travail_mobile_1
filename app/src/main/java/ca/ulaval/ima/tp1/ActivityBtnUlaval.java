package ca.ulaval.ima.tp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class ActivityBtnUlaval extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitty_btn_ulaval);
    }

    public void closeActivity(View view){
        this.finish();
    }

}
