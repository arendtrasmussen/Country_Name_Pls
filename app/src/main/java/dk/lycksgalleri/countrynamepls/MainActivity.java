package dk.lycksgalleri.countrynamepls;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TableLayout;


public class MainActivity extends Activity {
    TableLayout buttonOptions;
    ImageView flagView;
    int optionButtons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        optionButtons = 4;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOptions =
                (TableLayout) findViewById(R.id.buttonTableLayout);

        flagView = (ImageView) findViewById(R.id.flagView);



    }

    public void createOptionButtons(){

    }

}
