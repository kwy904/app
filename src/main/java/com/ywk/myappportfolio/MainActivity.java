package com.ywk.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button[] buttons = new Button[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
    }


    private void setupView(){
buttons[0] = (Button) findViewById(R.id.btn_spotity_streamer);
buttons[1] = (Button) findViewById(R.id.btn_scores_app);
buttons[2] = (Button) findViewById(R.id.btn_library_app);
buttons[3] = (Button) findViewById(R.id.btn_build_it_bigger);
buttons[4] = (Button) findViewById(R.id.btn_bacon_reader);
buttons[5] = (Button) findViewById(R.id.btn_capstone);

        for (int i=0;i<buttons.length;i++){
            buttons[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        String toast = "";
        switch (view.getId()){
            case R.id.btn_spotity_streamer:
                toast = getString(R.string.spotify_streamer);
                break;
            case R.id.btn_scores_app:
                toast = getString(R.string.scores_app);
                break;
            case R.id.btn_library_app:
                toast = getString(R.string.library_app);
                break;
            case R.id.btn_build_it_bigger:
                toast = getString(R.string.build_it_bigger);
                break;
            case R.id.btn_bacon_reader:
                toast = getString(R.string.bacon_reader);
                break;
            case R.id.btn_capstone:
                toast = getString(R.string.capstone);
                break;
        }

        Toast.makeText(this,"This button will launche my"+toast,Toast.LENGTH_LONG).show();
    }
}
