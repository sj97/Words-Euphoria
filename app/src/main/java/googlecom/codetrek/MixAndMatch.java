package googlecom.codetrek;

        import android.app.Activity;
        import android.content.Intent;
        import android.graphics.Bitmap;
        import android.graphics.drawable.BitmapDrawable;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.TextView;

        import java.io.IOException;
        import java.io.InputStream;
        import java.util.Random;

public class MixAndMatch extends AppCompatActivity {



    int picimage[]={R.drawable.mix11,R.drawable.mix21,R.drawable.mix31,R.drawable.mix41,R.drawable.mix51,R.drawable.mix61,R.drawable.mix71,R.drawable.mix81,R.drawable.mix91,R.drawable.mix101, R.drawable.mix111};
    int picimage2[]={R.drawable.mix12,R.drawable.mix22,R.drawable.mix32,R.drawable.mix42,R.drawable.mix52,R.drawable.mix62,R.drawable.mix72,R.drawable.mix82,R.drawable.mix92,R.drawable.mix102,R.drawable.mix112};//,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};
    //Button submit,next;
    TextView score,status;
    EditText guessWord;
    ImageView pic1,pic2;
    SimpleWords word;
    Boolean bool;
    int tscore=0,j=0;
    int next1[]=new int[11];


    Random random=new Random();

    int picvalue1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mix_and_match);
        next1[0]=0;

        try
        {
            InputStream dictionarywords=getAssets().open("words1.txt");
            word=new SimpleWords(dictionarywords);


        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        score=(TextView)findViewById(R.id.score);
        status=(TextView)findViewById(R.id.status);
        guessWord=(EditText)findViewById(R.id.guessWord);

        pic1 = (ImageView) findViewById(R.id.pic1);
        pic2 = (ImageView) findViewById(R.id.pic2);
    }



//    public void next(View view) {
//        //enter index here
//
//        ((BitmapDrawable)getResources().getDrawable(picimage[picvalue1])).getBitmap().recycle();
//        ((BitmapDrawable)getResources().getDrawable(picimage2[picvalue1])).getBitmap().recycle();
//
//        status.setText("");
//        guessWord.setText("");
//
//        picvalue1 = random.nextInt(11) ;
//        boolean check=check();
//        if(check==false)
//            next(null);
//        else {
//
//
//            //picvalue2 = random.nextInt(5) + 1;
//
//            pic1.setImageResource(picimage[picvalue1]);// on next() randomly a no. is selected and 2 images are set
//            pic2.setImageResource(picimage2[picvalue1]);
//        }
//
//
//    }

    int flag=0;
    public void submit1(View view) {
            String answer = guessWord.getText().toString().trim();
            bool = word.isWord(answer, picvalue1);

            boolean check = check();
            if (bool == true) {

                if(picvalue1==0&&flag==0)
                {
                    status.setText("EXCELLENT !!!!!");
                    tscore++;
                    score.setText("Score : "+String.valueOf(tscore));
                    flag=1;
                }

                else if (check == false) {
                    guessWord.setText("");
                    status.setText("");
                }
                else {
                    status.setText("EXCELLENT !!!!!");
                    tscore++;
                    score.setText("Score : "+String.valueOf(tscore));
                    next1[++j] = picvalue1;
                }
            }
            else
                status.setText("Try Again !!!!");

        }

    public boolean check()
    {
        int i=0;
        for( i=0;i<next1.length;++i)
        {
            if(picvalue1==next1[i]) {
                return false;
            }
        }
        return true;
    }
    public void onBackPressed()
    {
        Intent intent=new Intent(this,NewActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("EXIT", true);
        startActivity(intent);

    }

    public void next1(View view) {
        ((BitmapDrawable)getResources().getDrawable(picimage[picvalue1])).getBitmap().recycle();
        ((BitmapDrawable)getResources().getDrawable(picimage2[picvalue1])).getBitmap().recycle();

        status.setText("");
        guessWord.setText("");

        picvalue1 = random.nextInt(11) ;
        boolean check=check();
        if(check==false)
            next1(null);
        else {


            //picvalue2 = random.nextInt(5) + 1;

            pic1.setImageResource(picimage[picvalue1]);// on next() randomly a no. is selected and 2 images are set
            pic2.setImageResource(picimage2[picvalue1]);
        }
    }
}
