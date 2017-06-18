package googlecom.codetrek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

    }

    public void easygame(View view) {

            Intent intent= new Intent(this, MixAndMatch.class);
            startActivity(intent);

        }
}
