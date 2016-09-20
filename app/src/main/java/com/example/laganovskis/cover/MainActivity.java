package com.example.laganovskis.cover;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button firstChoice = (Button) findViewById(R.id.firstChoice);
    Button secondChoice = (Button) findViewById(R.id.secondChoice);
    Button thirdChoice = (Button) findViewById(R.id.thirdChoice);
    Button fourthChoice = (Button) findViewById(R.id.fourthChoice);

    Albums album;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        album = new Albums("Nevermind","https://upload.wikimedia.org/wikipedia/en/b/b7/NirvanaNevermindalbumcover.jpg");
//        firstChoice.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Toast.makeText(MainActivity.this,"first button clicked",Toast.LENGTH_LONG).show();
//            }
//
//        });


//        View.OnClickListener onClickListener = new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                switch (view.getId())
//                {
//                    case R.id.firstChoice:
//                        Toast.makeText(MainActivity.this,"first button is clicked",Toast.LENGTH_LONG).show();
//                        break;
//                    case R.id.secondChoice:
//                        break;
//                    case R.id.thirdChoice:
//                        break;
//                        default:
//                }
//            }
//        };

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });







    }


//    public void setChoices() {
//        String albumNames[] = {"Nevermind", "In Utero", "Sremmlife 2", "Ready to die", "Bad", "Invincible"};
//
//        Button firstChoice = (Button) findViewById(R.id.firstChoice);
//        Button secondChoice = (Button) findViewById(R.id.secondChoice);
//        Button thirdChoice = (Button) findViewById(R.id.thirdChoice);
//        Button fourthChoice = (Button) findViewById(R.id.fourthChoice);
//
//
//        firstChoice.setText(albumNames[0]);
//        secondChoice.setText(albumNames[1]);
//        thirdChoice.setText(albumNames[2]);
//        fourthChoice.setText(albumNames[3]);
//    }

//    public void checkCorrect(Button button, ImageView imageView)
//    {
//        if(button.getText() == imageView.toString())
//        {
//            Toast.makeText(this,"This is correct!",Toast.LENGTH_SHORT).show();
//        }
//        else{
//            Toast.makeText(this,"Try again!",Toast.LENGTH_SHORT).show();
//        }
//    }

//    public void onClickChoice(View view)
//    {
//        ImageView imageView = (ImageView) findViewById(R.id.cover);
//
//        imageView.setImageResource(R.drawable.nevermind);
//        setChoices();
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
