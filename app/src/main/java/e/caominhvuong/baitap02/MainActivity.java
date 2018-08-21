package e.caominhvuong.baitap02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Button btn1;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.ConvertToCelsius);
        btn1=(Button) findViewById(R.id.ConvertToFahrenheit);
        btn2=(Button) findViewById(R.id.Clear);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edita=(EditText)findViewById(R.id.nhapFahrenheit);
                int a=Integer.parseInt(edita.getText().toString()+"");

                EditText editb=(EditText)findViewById(R.id.nhapCelsius);
                int b=Integer.parseInt(editb.getText().toString()+"");

                int Tich=a*b;

             //   TextView tv=(TextView) findViewById(R.id.Ketqua);

             //   tv.setText(Tich+"");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edita=(EditText)findViewById(R.id.nhapFahrenheit);
                int a=Integer.parseInt(edita.getText().toString()+"");

                EditText editb=(EditText)findViewById(R.id.nhapCelsius);
                int b=Integer.parseInt(editb.getText().toString()+"");

                int Hieu=a-b;

            //    TextView tv=(TextView) findViewById(R.id.Ketqua);

             //   tv.setText(Hieu+"");
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edita=(EditText)findViewById(R.id.nhapFahrenheit);
                int a=Integer.parseInt(edita.getText().toString()+"");

                EditText editb=(EditText)findViewById(R.id.nhapCelsius);
                int b=Integer.parseInt(editb.getText().toString()+"");

                int tong=a+b;

              //  TextView tv=(TextView) findViewById(R.id.Ketqua);

              //  tv.setText(tong+"");
            }
        });
    }
}
