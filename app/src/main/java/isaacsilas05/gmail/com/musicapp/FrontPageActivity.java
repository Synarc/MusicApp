package isaacsilas05.gmail.com.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrontPageActivity extends AppCompatActivity {

    private Button signInButton, download;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        signInButton = findViewById(R.id.sign_in_frontPage);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontPageActivity.this, UploadMusicActivity.class);
                startActivity(intent);
            }
        });

        download = findViewById(R.id.demoDownload);

        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FrontPageActivity.this,ViewDownloadedMusicActivity.class);
                startActivity(intent);
            }
        });


    }
}
