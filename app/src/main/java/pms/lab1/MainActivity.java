package pms.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import pms.lab1.text.TextFunction;

public class MainActivity extends AppCompatActivity {
    //TODO add new method

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayText();

        for (int count = 0; count < 10; count++) {
            Log.d("MainActivity", " count =" + count);
        }
    }

    private void displayText() {
        TextFunction tf = new TextFunction();
        TextView nt = findViewById(R.id.newtest);
        nt.setText(tf.getValue());
    }
}