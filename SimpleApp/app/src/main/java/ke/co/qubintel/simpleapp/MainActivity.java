package ke.co.qubintel.simpleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitInfo(View view) {

        TextView messageTextView = (TextView) findViewById(R.id.messageBox);

        messageTextView.setText("Thanks, info submitted successfully.");

    }
}
