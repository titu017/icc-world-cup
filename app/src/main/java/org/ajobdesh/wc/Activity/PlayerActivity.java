package org.ajobdesh.wc.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.ajobdesh.wc.R;

public class PlayerActivity extends AppCompatActivity {
    TextView
            player1_serial,
            player1_firstName,
            player1_lastName,
            player1_position,

            player2_serial,
            player2_firstName,
            player2_lastName,
            player2_position,

            player3_serial,
            player3_firstName,
            player3_lastName,
            player3_position,

            player4_serial,
            player4_firstName,
            player4_lastName,
            player4_position,

            player5_serial,
            player5_firstName,
            player5_lastName,
            player5_position,

            player6_serial,
            player6_firstName,
            player6_lastName,
            player6_position,

            player7_serial,
            player7_firstName,
            player7_lastName,
            player7_position,

            player8_serial,
            player8_firstName,
            player8_lastName,
            player8_position,

            player9_serial,
            player9_firstName,
            player9_lastName,
            player9_position,

            player10_serial,
            player10_firstName,
            player10_lastName,
            player10_position,

            player11_serial,
            player11_firstName,
            player11_lastName,
            player11_position,

            player12_serial,
            player12_firstName,
            player12_lastName,
            player12_position,

            player13_serial,
            player13_firstName,
            player13_lastName,
            player13_position,

            player14_serial,
            player14_firstName,
            player14_lastName,
            player14_position,

            player15_serial,
            player15_firstName,
            player15_lastName,
            player15_position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

//        initialize view
        player1_serial = findViewById(R.id.player1_serialTv);
        player1_firstName = findViewById(R.id.player1_firstNameTv);
        player1_lastName = findViewById(R.id.player1_lastNameTv);
        player1_position = findViewById(R.id.player1_position);

        player2_serial = findViewById(R.id.player2_serialTv);
        player2_firstName = findViewById(R.id.player2_firstNameTv);
        player2_lastName = findViewById(R.id.player2_lastNameTv);
        player2_position = findViewById(R.id.player2_position);

        player3_serial = findViewById(R.id.player3_serialTv);
        player3_firstName = findViewById(R.id.player3_firstNameTv);
        player3_lastName = findViewById(R.id.player3_lastNameTv);
        player3_position = findViewById(R.id.player3_position);

        player4_serial = findViewById(R.id.player4_serialTv);
        player4_firstName = findViewById(R.id.player4_firstNameTv);
        player4_lastName = findViewById(R.id.player4_lastNameTv);
        player4_position = findViewById(R.id.player4_position);

        player5_serial = findViewById(R.id.player5_serialTv);
        player5_firstName = findViewById(R.id.player5_firstNameTv);
        player5_lastName = findViewById(R.id.player5_lastNameTv);
        player5_position = findViewById(R.id.player5_position);

        player6_serial = findViewById(R.id.player6_serialTv);
        player6_firstName = findViewById(R.id.player6_firstNameTv);
        player6_lastName = findViewById(R.id.player6_lastNameTv);
        player6_position = findViewById(R.id.player6_position);

        player7_serial = findViewById(R.id.player7_serialTv);
        player7_firstName = findViewById(R.id.player7_firstNameTv);
        player7_lastName = findViewById(R.id.player7_lastNameTv);
        player7_position = findViewById(R.id.player7_position);

        player8_serial = findViewById(R.id.player8_serialTv);
        player8_firstName = findViewById(R.id.player8_firstNameTv);
        player8_lastName = findViewById(R.id.player8_lastNameTv);
        player8_position = findViewById(R.id.player8_position);

        player9_serial = findViewById(R.id.player9_serialTv);
        player9_firstName = findViewById(R.id.player9_firstNameTv);
        player9_lastName = findViewById(R.id.player9_lastNameTv);
        player9_position = findViewById(R.id.player9_position);

        player10_serial = findViewById(R.id.player10_serialTv);
        player10_firstName = findViewById(R.id.player10_firstNameTv);
        player10_lastName = findViewById(R.id.player10_lastNameTv);
        player10_position = findViewById(R.id.player10_position);

        player11_serial = findViewById(R.id.player11_serialTv);
        player11_firstName = findViewById(R.id.player11_firstNameTv);
        player11_lastName = findViewById(R.id.player11_lastNameTv);
        player11_position = findViewById(R.id.player11_position);

        player12_serial = findViewById(R.id.player12_serialTv);
        player12_firstName = findViewById(R.id.player12_firstNameTv);
        player12_lastName = findViewById(R.id.player12_lastNameTv);
        player12_position = findViewById(R.id.player12_position);

        player13_serial = findViewById(R.id.player13_serialTv);
        player13_firstName = findViewById(R.id.player13_firstNameTv);
        player13_lastName = findViewById(R.id.player13_lastNameTv);
        player13_position = findViewById(R.id.player13_position);

        player14_serial = findViewById(R.id.player14_serialTv);
        player14_firstName = findViewById(R.id.player14_firstNameTv);
        player14_lastName = findViewById(R.id.player14_lastNameTv);
        player14_position = findViewById(R.id.player14_position);

        player15_serial = findViewById(R.id.player15_serialTv);
        player15_firstName = findViewById(R.id.player15_firstNameTv);
        player15_lastName = findViewById(R.id.player15_lastNameTv);
        player15_position = findViewById(R.id.player15_position);

//        get Content

        Intent intent = this.getIntent();

        String p1_serial = intent.getExtras().getString("PLAYER1_SERIAL_KEY");
        String p1_fName = intent.getExtras().getString("PLAYER1_FIRST_NAME_KEY");
        String p1_lName = intent.getExtras().getString("PLAYER1_LAST_NAME_KEY");
        String p1_pos = intent.getExtras().getString("PLAYER1_POSITION_KEY");

        String p2_serial = intent.getExtras().getString("PLAYER2_SERIAL_KEY");
        String p2_fName = intent.getExtras().getString("PLAYER2_FIRST_NAME_KEY");
        String p2_lName = intent.getExtras().getString("PLAYER2_LAST_NAME_KEY");
        String p2_pos = intent.getExtras().getString("PLAYER2_POSITION_KEY");

        String p3_serial = intent.getExtras().getString("PLAYER3_SERIAL_KEY");
        String p3_fName = intent.getExtras().getString("PLAYER3_FIRST_NAME_KEY");
        String p3_lName = intent.getExtras().getString("PLAYER3_LAST_NAME_KEY");
        String p3_pos = intent.getExtras().getString("PLAYER3_POSITION_KEY");

        String p4_serial = intent.getExtras().getString("PLAYER4_SERIAL_KEY");
        String p4_fName = intent.getExtras().getString("PLAYER4_FIRST_NAME_KEY");
        String p4_lName = intent.getExtras().getString("PLAYER4_LAST_NAME_KEY");
        String p4_pos = intent.getExtras().getString("PLAYER4_POSITION_KEY");

        String p5_serial = intent.getExtras().getString("PLAYER5_SERIAL_KEY");
        String p5_fName = intent.getExtras().getString("PLAYER5_FIRST_NAME_KEY");
        String p5_lName = intent.getExtras().getString("PLAYER5_LAST_NAME_KEY");
        String p5_pos = intent.getExtras().getString("PLAYER5_POSITION_KEY");

        String p6_serial = intent.getExtras().getString("PLAYER6_SERIAL_KEY");
        String p6_fName = intent.getExtras().getString("PLAYER6_FIRST_NAME_KEY");
        String p6_lName = intent.getExtras().getString("PLAYER6_LAST_NAME_KEY");
        String p6_pos = intent.getExtras().getString("PLAYER6_POSITION_KEY");

        String p7_serial = intent.getExtras().getString("PLAYER7_SERIAL_KEY");
        String p7_fName = intent.getExtras().getString("PLAYER7_FIRST_NAME_KEY");
        String p7_lName = intent.getExtras().getString("PLAYER7_LAST_NAME_KEY");
        String p7_pos = intent.getExtras().getString("PLAYER7_POSITION_KEY");

        String p8_serial = intent.getExtras().getString("PLAYER8_SERIAL_KEY");
        String p8_fName = intent.getExtras().getString("PLAYER8_FIRST_NAME_KEY");
        String p8_lName = intent.getExtras().getString("PLAYER8_LAST_NAME_KEY");
        String p8_pos = intent.getExtras().getString("PLAYER8_POSITION_KEY");

        String p9_serial = intent.getExtras().getString("PLAYER9_SERIAL_KEY");
        String p9_fName = intent.getExtras().getString("PLAYER9_FIRST_NAME_KEY");
        String p9_lName = intent.getExtras().getString("PLAYER9_LAST_NAME_KEY");
        String p9_pos = intent.getExtras().getString("PLAYER9_POSITION_KEY");

        String p10_serial = intent.getExtras().getString("PLAYER10_SERIAL_KEY");
        String p10_fName = intent.getExtras().getString("PLAYER10_FIRST_NAME_KEY");
        String p10_lName = intent.getExtras().getString("PLAYER10_LAST_NAME_KEY");
        String p10_pos = intent.getExtras().getString("PLAYER10_POSITION_KEY");

        String p11_serial = intent.getExtras().getString("PLAYER11_SERIAL_KEY");
        String p11_fName = intent.getExtras().getString("PLAYER11_FIRST_NAME_KEY");
        String p11_lName = intent.getExtras().getString("PLAYER11_LAST_NAME_KEY");
        String p11_pos = intent.getExtras().getString("PLAYER11_POSITION_KEY");

        String p12_serial = intent.getExtras().getString("PLAYER12_SERIAL_KEY");
        String p12_fName = intent.getExtras().getString("PLAYER12_FIRST_NAME_KEY");
        String p12_lName = intent.getExtras().getString("PLAYER12_LAST_NAME_KEY");
        String p12_pos = intent.getExtras().getString("PLAYER12_POSITION_KEY");

        String p13_serial = intent.getExtras().getString("PLAYER13_SERIAL_KEY");
        String p13_fName = intent.getExtras().getString("PLAYER13_FIRST_NAME_KEY");
        String p13_lName = intent.getExtras().getString("PLAYER13_LAST_NAME_KEY");
        String p13_pos = intent.getExtras().getString("PLAYER13_POSITION_KEY");

        String p14_serial = intent.getExtras().getString("PLAYER14_SERIAL_KEY");
        String p14_fName = intent.getExtras().getString("PLAYER14_FIRST_NAME_KEY");
        String p14_lName = intent.getExtras().getString("PLAYER14_LAST_NAME_KEY");
        String p14_pos = intent.getExtras().getString("PLAYER14_POSITION_KEY");

        String p15_serial = intent.getExtras().getString("PLAYER15_SERIAL_KEY");
        String p15_fName = intent.getExtras().getString("PLAYER15_FIRST_NAME_KEY");
        String p15_lName = intent.getExtras().getString("PLAYER15_LAST_NAME_KEY");
        String p15_pos = intent.getExtras().getString("PLAYER15_POSITION_KEY");

//        Bind Data
        player1_serial.setText(p1_serial);
        player1_firstName.setText(p1_fName);
        player1_lastName.setText(p1_lName);
        player1_position.setText(p1_pos);

        player2_serial.setText(p2_serial);
        player2_firstName.setText(p2_fName);
        player2_lastName.setText(p2_lName);
        player2_position.setText(p2_pos);

        player3_serial.setText(p3_serial);
        player3_firstName.setText(p3_fName);
        player3_lastName.setText(p3_lName);
        player3_position.setText(p3_pos);

        player4_serial.setText(p4_serial);
        player4_firstName.setText(p4_fName);
        player4_lastName.setText(p4_lName);
        player4_position.setText(p4_pos);

        player5_serial.setText(p5_serial);
        player5_firstName.setText(p5_fName);
        player5_lastName.setText(p5_lName);
        player5_position.setText(p5_pos);

        player6_serial.setText(p6_serial);
        player6_firstName.setText(p6_fName);
        player6_lastName.setText(p6_lName);
        player6_position.setText(p6_pos);

        player7_serial.setText(p7_serial);
        player7_firstName.setText(p7_fName);
        player7_lastName.setText(p7_lName);
        player7_position.setText(p7_pos);

        player8_serial.setText(p8_serial);
        player8_firstName.setText(p8_fName);
        player8_lastName.setText(p8_lName);
        player8_position.setText(p8_pos);

        player9_serial.setText(p9_serial);
        player9_firstName.setText(p9_fName);
        player9_lastName.setText(p9_lName);
        player9_position.setText(p9_pos);

        player10_serial.setText(p10_serial);
        player10_firstName.setText(p10_fName);
        player10_lastName.setText(p10_lName);
        player10_position.setText(p10_pos);

        player11_serial.setText(p11_serial);
        player11_firstName.setText(p11_fName);
        player11_lastName.setText(p11_lName);
        player11_position.setText(p11_pos);

        player12_serial.setText(p12_serial);
        player12_firstName.setText(p12_fName);
        player12_lastName.setText(p12_lName);
        player12_position.setText(p12_pos);

        player13_serial.setText(p13_serial);
        player13_firstName.setText(p13_fName);
        player13_lastName.setText(p13_lName);
        player13_position.setText(p13_pos);

        player14_serial.setText(p14_serial);
        player14_firstName.setText(p14_fName);
        player14_lastName.setText(p14_lName);
        player14_position.setText(p14_pos);

        player15_serial.setText(p15_serial);
        player15_firstName.setText(p15_fName);
        player15_lastName.setText(p15_lName);
        player15_position.setText(p15_pos);



    }
}
