package cu.activitytest;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et = (EditText)findViewById(R.id.myedit);

        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // 버튼이 눌렸을때 해야 할 일.
                Intent i = new Intent();

                ComponentName cname = new ComponentName("cu.activitytest","cu.activitytest.SecondActivity");

                i.setComponent(cname);
                EditText et = (EditText)findViewById(R.id.myedit);
                String msg = et.getText().toString();
                i.putExtra("DATA",msg);

                startActivity(i);
            }
        });
    }
}
