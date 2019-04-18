package org.ajobdesh.wc.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.ajobdesh.wc.R;

public class PlayerActivity extends AppCompatActivity {
    TextView player1_serial, player1_firstName, player1_lastName, player1_position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

//        initialize view
        player1_serial = findViewById(R.id.player1_serialTv);
        player1_firstName = findViewById(R.id.player1_firstNameTv);
        player1_lastName = findViewById(R.id.player1_lastNameTv);
        player1_position = findViewById(R.id.player1_position);

//        get Content

        Intent intent = this.getIntent();

        String p1_serial = intent.getExtras().getString("PLAYER1_SERIAL_KEY");
        String p1_fName = intent.getExtras().getString("PLAYER1_FIRST_NAME_KEY");
        String p1_lName = intent.getExtras().getString("PLAYER1_LAST_NAME_KEY");
        String p1_pos = intent.getExtras().getString("PLAYER1_POSITION_KEY");

//        Bind Data
        player1_serial.setText(p1_serial);
        player1_firstName.setText(p1_fName);
        player1_lastName.setText(p1_lName);
        player1_position.setText(p1_pos);

    }
}
