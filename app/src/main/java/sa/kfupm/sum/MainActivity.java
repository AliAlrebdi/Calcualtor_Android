package sa.kfupm.sum;

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

    public void calculate(View view) {

        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);

        TextView textView = findViewById(R.id.textView);

        int num1 = Integer.parseInt(editText1.getText().toString());
        int num2 = Integer.parseInt(editText2.getText().toString());

        textView.setText("Sum = " + (num1 + num2));

    }
}