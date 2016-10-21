package edu.tecii.android.conv_dinero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText TxtNum;
private TextView B100,B50,B20,M5,M2,M1,M50,M20,M10;
    private Button conv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TxtNum=(EditText)findViewById(R.id.txtC);
        B100=(TextView) findViewById(R.id.Tv100);
        B50=(TextView) findViewById(R.id.Tv50);
        B20=(TextView) findViewById(R.id.Tv20);
        M5=(TextView) findViewById(R.id.Tvm5);
        M2=(TextView) findViewById(R.id.Tvm2);
        M1=(TextView) findViewById(R.id.Tvm1);
        M50=(TextView) findViewById(R.id.Tvm50);
        M20=(TextView) findViewById(R.id.Tvm20);
        M10=(TextView) findViewById(R.id.Tvm10);
        conv=(Button)findViewById(R.id.button);
        conv.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
            int ent,deci;
            int bi100,bi50,bi20,mo5,mo2,mo1,mo50,mo20,mo10;
            String cant=TxtNum.getText().toString();
            double cantd=Double.parseDouble(cant);
            ent=(int)(cantd);

                bi100=ent/100;
                ent=ent%100;
                bi50=ent/50;
                ent=ent%50;
                bi20=ent/20;
                ent=ent%20;
                mo5=ent/5;
                ent=ent%5;
                mo2=ent/2;
                ent=ent%2;
                mo1=ent;

                //deci=(int)(1000*(cantd+0.5));
                deci=(int)(cantd*1000);
                mo50=deci/500; //monedas de 50
                deci=deci%500;
                mo20=deci/200; //monedas de 50
                deci=deci%200;
                mo10=deci/100;

                String r100,r50,r20,r5,r2,r1,re50,re20,re10 = "";
                r100="Hay " + bi100 + " billetes de 100 pesos";
                r50="Hay " + bi50 + " billetes de 50 pesos";
                r20="Hay " + bi20 + " billetes de 20 pesos";
                r5="Hay " + mo5 + " modedas de 5 pesos";
                r2="Hay " + mo2 + " modedas de 2 pesos";
                r1="Hay " + mo1 + " modedas de 1 peso";
                re50="Hay " + mo50 + " modedas de 50 centavos";
                re20="Hay " + mo20 + " modedas de 20 centavos";
                re10="Hay " + mo10 + " modedas de 10 centavos";

                B100.setText(r100);
                B50.setText(r50);
                B20.setText(r20);
                M5.setText(r5);
                M2.setText(r2);
                M1.setText(r1);
                M50.setText(re50);
                M20.setText(re20);
                M10.setText(re10);

            }
        });
    }
}
