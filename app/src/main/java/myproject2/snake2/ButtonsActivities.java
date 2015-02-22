package myproject2.snake2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Georges on 2/21/2015.
 */
public class ButtonsActivities extends Activity{

    protected void onCreate(Bundle button){
        super.onCreate(button);

        setContentView(R.layout.activity_main);

        final Button game = (Button) findViewById(R.id.btnStart);
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.w("Status", "game button clicked");
            }
        });
    }
}
