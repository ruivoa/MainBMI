package ca.yorku.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void buttonClicked(View v) {
        EditText weightView = (EditText) findViewById(R.id.weightBox);
        String weight = weightView.getText().toString();
        EditText heightView = (EditText) findViewById(R.id.heightBox);
        String height = heightView.getText().toString();

        double wD = BMIModel.toDouble(weight);
        double hD = BMIModel.toDouble(height);
        double bmiD = BMIModel.getBMI(wD,hD);
        String bmiS = BMIModel.formatBMI(bmiD);
        ((TextView) findViewById(R.id.answer)).setText(bmiS);
    }
}