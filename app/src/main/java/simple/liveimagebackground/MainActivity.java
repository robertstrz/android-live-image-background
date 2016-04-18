package simple.liveimagebackground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import simple.liveimagelibrary.LiveBackgroundImageView;


public class MainActivity extends AppCompatActivity {

    LiveBackgroundImageView mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        mImage = (LiveBackgroundImageView) findViewById(R.id.image);
    }

    @Override
    protected void onDestroy() {
        mImage.stopGyroscope();
        super.onDestroy();
    }
}
