package kr.ac.kopo.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main); //xml에 작성된 뷰를 화면에 띄우는 메서드라고 생각하면 된다. 가장 위에 있어줘야 한다.
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
        Button btn1 = (Button) findViewById(R.id.btn1);
        TextView text1 = (TextView) findViewById(R.id.text1);
        EditText editText = (EditText) findViewById(R.id.NameTextText);




        //리스너 설정 -> 클릭했을 때 호출되는 일이 일어난다.



        btn1.setOnClickListener(new View.OnClickListener() {
            int TextMsg = 0;
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "버튼을 클릭하셨습니다.", Toast.LENGTH_SHORT);
                toast.show();
                if(TextMsg ==0){
                    text1.setText(editText.getText().toString());
                    TextMsg = 1;
                }
                if(TextMsg == 1 || editText.getFreezesText()) {
                    text1.setText("None");
                    TextMsg = 0;
                }

            }
        });






    }
}