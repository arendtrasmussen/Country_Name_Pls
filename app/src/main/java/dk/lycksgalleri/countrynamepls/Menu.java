package dk.lycksgalleri.countrynamepls;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.TextView;
/**
 * Created by maria on 16/06/15.
 */
public class Menu extends Activity {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);

            final TextView tv = (TextView) findViewById(R.id.textView);

            // Define a generic listener for all three RadioButtons in the RadioGroup
            final OnClickListener radioListener = new OnClickListener() {
                @Override
                public void onClick(View v) {
                    RadioButton rb = (RadioButton) v;
                    tv.setText(rb.getText() + " chosen");
                }
            };

            final RadioButton Theme1 = (RadioButton) findViewById(R.id.choice1);
            // Called when RadioButton choice1 is clicked
            Theme1.setOnClickListener(radioListener);

            final RadioButton Theme2 = (RadioButton) findViewById(R.id.choice2);
            // Called when RadioButton choice2 is clicked
            Theme2.setOnClickListener(radioListener);

            final RadioButton Theme3 = (RadioButton) findViewById(R.id.choice3);
            // Called when RadioButton choice3 is clicked
            Theme3.setOnClickListener(radioListener);

            final RadioButton Theme4 = (RadioButton) findViewById(R.id.choice4);
            // Called when RadioButton choice3 is clicked
            Theme4.setOnClickListener(radioListener);
        }
    }
