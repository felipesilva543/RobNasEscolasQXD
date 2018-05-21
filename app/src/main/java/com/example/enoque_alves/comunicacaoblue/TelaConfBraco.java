package com.example.enoque_alves.comunicacaoblue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class TelaConfBraco extends AppCompatActivity {
    private Button b_play, b_config;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_conf_braco);

        b_play = (Button) findViewById(R.id.confBracoPlay);
        b_config = (Button) findViewById(R.id.confBracoServos);
    }
}
