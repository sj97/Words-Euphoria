package googlecom.codetrek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Help extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }

    public void see_example(View view) {
        Intent in= new Intent(this,See_example.class);
        startActivity(in);
    }

    public void continue_game(View view) {
        Intent in= new Intent(this,NewActivity.class);
        startActivity(in);
    }
}
