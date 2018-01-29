package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        display();
    }

    public void incrementTeamScores(View view) {
        int id = view.getId();

        if (id == R.id.btn_teamA_point3) {
            scoreTeamA = scoreTeamA + 3;

        } else if (id == R.id.btn_teamA_point2) {
            scoreTeamA = scoreTeamA + 2;

        } else if (id == R.id.btn_teamA_free) {
            scoreTeamA = scoreTeamA + 1;

        } else if (id == R.id.btn_teamB_point3) {
            scoreTeamB = scoreTeamB + 3;

        } else if (id == R.id.btn_teamB_point2) {
            scoreTeamB = scoreTeamB + 2;

        } else if (id == R.id.btn_teamB_free) {
            scoreTeamB = scoreTeamB + 1;

        }else {
            scoreTeamA = 0;
            scoreTeamB = 0;
        }
        display();
    }

    private void display() {
        TextView scoreTeamA = findViewById(R.id.tv_score_teamA);
        TextView scoreTeamB = findViewById(R.id.tv_score_teamB);

        scoreTeamA.setText("" + this.scoreTeamA);
        scoreTeamB.setText("" + this.scoreTeamB);
    }
}
