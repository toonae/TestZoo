package sdu.cs58.supanida.testzoo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton imgh, imge, imgl, imggo, imgcall;
    MediaPlayer mediaPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgh = findViewById(R.id.imgh);
        imge = findViewById(R.id.imge);
        imgl = findViewById(R.id.imgl);
        imggo = findViewById(R.id.imggo);
        imgcall = findViewById(R.id.imgcall);
        }


    public void clickSound(View view) {
        if (mediaPlayer != null) {//ตรวจสอบว่า obj.mediaPlayer เล่นอยู่หรือเปล่า
            mediaPlayer.stop();//ถ้ามีให้หยุดเล่น
            mediaPlayer.release();//คืน resource ที่ mediaPlayer เดิมใฟ้กับระบบ
        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.horse);
        mediaPlayer.start();
    }

    public  void clickButton(View view){
        if (mediaPlayer != null) {//ตรวจสอบว่า obj.mediaPlayer เล่นอยู่หรือเปล่า
            mediaPlayer.stop();//ถ้ามีให้หยุดเล่น
            mediaPlayer.release();//คืน resource ที่ mediaPlayer เดิมใฟ้กับระบบ
        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.elephant);
        mediaPlayer.start();
    }

    public void clickbtnSound(View view){
        if (mediaPlayer != null) {//ตรวจสอบว่า obj.mediaPlayer เล่นอยู่หรือเปล่า
            mediaPlayer.stop();//ถ้ามีให้หยุดเล่น
            mediaPlayer.release();//คืน resource ที่ mediaPlayer เดิมใฟ้กับระบบ
        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.lion);
        mediaPlayer.start();
    }




    public void clickMobile(View view) {
        Intent mobileInent = new Intent(Intent.ACTION_DIAL);
        mobileInent.setData(Uri.parse("tel:084-867-5482"));
        startActivity(mobileInent);
    }

    public void clickMap(View view) {
        String lat = "13.216298";
        String lng = "101.056642";
        String label = "สวนสัตว์เปิดเขาเขียว";

        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:"+lat+","+lng+"("+label+")");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        startActivity(mapIntent);
        }



    }

