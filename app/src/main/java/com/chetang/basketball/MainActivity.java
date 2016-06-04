package com.chetang.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TextView teamAscoreTxt, teamBscoreTxt;
    Button teamA3pts_btn, teamA2pts_btn, teamAfreethrow_btn, teamB3pts_btn, teamB2pts_btn, teamBfreethrow_btn, resetscore_btn;
    int TeamAscore = 0, TeamBscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        teamAscoreTxt = (TextView) findViewById(R.id.teamAscoreTxt);
        teamBscoreTxt = (TextView) findViewById(R.id.teamBscoreTxt);

        teamA3pts_btn      = (Button) findViewById(R.id.teamApts3_btn);
        teamA2pts_btn      = (Button) findViewById(R.id.teamApts2_btn);
        teamAfreethrow_btn = (Button) findViewById(R.id.teamAfreethrow_btn);
        teamB3pts_btn      = (Button) findViewById(R.id.teamBpts3_btn);
        teamB2pts_btn      = (Button) findViewById(R.id.teamBpts2_btn);
        teamBfreethrow_btn = (Button) findViewById(R.id.teamBfreethrow_btn);
        resetscore_btn     = (Button) findViewById(R.id.reset_btn);

        teamA3pts_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TeamAscore = TeamAscore + 3;
                teamAscoreTxt.setText(""+TeamAscore);
            }
        });

        teamA2pts_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TeamAscore = TeamAscore + 2;
                teamAscoreTxt.setText(""+TeamAscore);
            }
        });

        teamAfreethrow_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TeamAscore = TeamAscore + 1;
                teamAscoreTxt.setText(""+TeamAscore);
            }
        });

        teamB3pts_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TeamBscore = TeamBscore + 3;
                teamBscoreTxt.setText(""+TeamBscore);
            }
        });

        teamB2pts_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TeamBscore = TeamBscore + 2;
                teamBscoreTxt.setText(""+TeamBscore);
            }
        });

        teamBfreethrow_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TeamBscore = TeamBscore + 1;
                teamBscoreTxt.setText(""+TeamBscore);
            }
        });

        resetscore_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TeamAscore = 0;
                teamAscoreTxt.setText(""+TeamAscore);
                TeamBscore = 0;
                teamBscoreTxt.setText(""+TeamBscore);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("teamAscore", TeamAscore);
        outState.putInt("teamBscore", TeamBscore);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        int teamA = savedInstanceState.getInt("teamAscore");
        TeamAscore = teamA;
        teamAscoreTxt.setText(""+TeamAscore);
        int teamB = savedInstanceState.getInt("teamBscore");
        TeamBscore = teamB;
        teamBscoreTxt.setText(""+TeamBscore);
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.search:
                Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_SHORT).show();
                break;
            
            case R.id.delete:
                Toast.makeText(MainActivity.this, "Delete", Toast.LENGTH_SHORT).show();
                break;
            
            case R.id.settings:
                Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                break;
            
            case R.id.contact_us:
                Toast.makeText(MainActivity.this, "Contact Us", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
