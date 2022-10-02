package kz.sfizfaka.a29_startactivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ResultActivity extends AppCompatActivity  {
    EditText et_message;
    Button btn_sent_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        et_message = findViewById(R.id.et_message);
        btn_sent_result = findViewById(R.id.btn2);

        btn_sent_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.putExtra("Result", et_message.getText().toString());
                setResult(78, intent);
                finish();
            }
        });

    }

}
