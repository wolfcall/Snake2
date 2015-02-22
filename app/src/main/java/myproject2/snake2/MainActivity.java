package myproject2.snake2;

import android.content.Intent;
import android.os.Debug;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button game = (Button) findViewById(R.id.btnStart);
        final Button high = (Button) findViewById(R.id.btnHighScore);
        final Button exit = (Button) findViewById(R.id.btnExit);

        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadGame(v);
            }
        });

        high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadHigh(v);
            }
        });

        exit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                exit(v);
            }
        });
    }


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

    public void loadGame(View v){
        Intent inten = new Intent(this, GameActivity.class);
        startActivity(inten);
    }

    public void loadHigh(View v){
        Intent inten = new Intent(this, HighScore.class);
        startActivity(inten);
    }

    public void exit(View v){
        System.runFinalization();
        finish();
    }
}
