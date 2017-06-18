package googlecom.codetrek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //code for automatic forwarding to next activity start from here.
        Handler handle=new Handler();
        handle.postDelayed(new Runnable()
        {
            public void run()
            {
                Intent in= new Intent(MainActivity.this,NewActivity.class);
                MainActivity.this.startActivity(in);
                MainActivity.this.finish();
            }
        },5000);

      }
//
//    public void forward(View view) {
//        Intent in= new Intent(this,NewActivity.class);
//        startActivity(in);
//    }
}
