package ca.ulaval.ima.tp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {
    private String prenom;
    private String nom;
    private String ddn;
    private String idul;

    private TextView monPrenom;
    private TextView monNom;
    private TextView monDdn;
    private TextView monIdul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        prenom = getIntent().getStringExtra("Prenom");
        nom = getIntent().getStringExtra("Nom");
        ddn = getIntent().getStringExtra("DDN");
        idul = getIntent().getStringExtra("IDUL");


        monPrenom = (TextView)findViewById(R.id.txtMonPrenom);
        monNom = (TextView)findViewById(R.id.txtMonNom);
        monDdn = (TextView)findViewById(R.id.txtDateNaissance);
        monIdul = (TextView)findViewById(R.id.txtMonIdul);

        monPrenom.setText(prenom);
        monNom.setText(nom);
        monDdn.setText(ddn);
        monIdul.setText(idul);
    }


}
