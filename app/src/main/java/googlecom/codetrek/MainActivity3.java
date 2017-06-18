package googlecom.codetrek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void forward3(View view) {
        Intent in= new Intent(this,MainActivity4.class);
        startActivity(in);
    }
    public void forward4(View view) {
        Intent in= new Intent(this,MainActivity5.class);
        startActivity(in);
    }
}
