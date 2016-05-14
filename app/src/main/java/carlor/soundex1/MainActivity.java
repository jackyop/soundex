package carlor.soundex1;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.button) Button b1;
    @Bind(R.id.button2) Button b2;
    @Bind(R.id.button3) Button b3;
    @Bind(R.id.button4) Button b4;
    @Bind(R.id.button5) Button b5;
    @Bind(R.id.button6) Button b6;
    MediaPlayer s1,s2,s3,s4,s5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        s5 = MediaPlayer.create(this,R.raw.background);
        s5.start();
        s5.setLooping(true);
        b6.setVisibility(View.INVISIBLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
    protected void  onResume(){
        super.onResume();
        s1 = MediaPlayer.create(this,R.raw.shotgun);
        s2 = MediaPlayer.create(this,R.raw.whip);
        s3 = MediaPlayer.create(this,R.raw.dog);
        s4 = MediaPlayer.create(this,R.raw.duck);
    }
    @OnClick(R.id.button)
    public void sound1() {
        // TODO submit data to server...
        s1.start();
    }
    @OnClick(R.id.button2)
    public void sound2() {
        // TODO submit data to server...
        s2.start();
    }
    @OnClick(R.id.button3)
    public void sound3() {
        // TODO submit data to server...
        s3.start();
    }
    @OnClick(R.id.button4)
    public void sound4() {
     // TODO submit data to server...
        s4.start();
    }
    @OnClick(R.id.button5)
    public void sound5() {
        // TODO submit data to server...
        s5.pause();
        b6.setVisibility(View.VISIBLE);
    }
    @OnClick(R.id.button6)
    public void sound6() {
        // TODO submit data to server...
        s5.start();
        b6.setVisibility(View.INVISIBLE);
    }
    protected void onPause(){
        super.onPause();
        s1.release();
        s2.release();
        s3.release();
        s4.release();
        s5.release();
    }
}
