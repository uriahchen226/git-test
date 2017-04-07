package com.example.tp1606005.app002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class App002 extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_title;
    private Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app002);

        initial_ui();
    }

    private void initial_ui(){

        tv_title = (TextView)findViewById(R.id.tv_title);
        btnOK = (Button)findViewById(R.id.btnOK);
        btnOK.setOnClickListener(this);
    }

    /*
    private View.OnClickListener btnOKOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view){
            tv_title.setText("Hi, This is App002.");
        }
    };
    */

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnOK){
            tv_title.setText("Hi, This is App002.");
        }
    }
}
