package googlecom.codetrek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }

    public void forward2(View view) {
        Intent in= new Intent(this,MainActivity3.class);
        startActivity(in);
    }

    public void help(View view) {
        Intent in=new Intent(this,Help.class);
        startActivity(in);
    }
    public void exit(View view) {
        finish();
    }

}
