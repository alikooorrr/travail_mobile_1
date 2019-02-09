package ca.ulaval.ima.tp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {


    private WebView web;
    Profil profil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String UrlToLoad = "https://www.manutd.com/";
        profil = new Profil("Diagne", "Alia","1996-09-25", "1112256029");




        final Button button = (Button)findViewById(R.id.btnSiteWeb);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
                {
                    Uri uri = Uri.parse(UrlToLoad);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
            }
        });
    }

    public void newActivity(View view){
        Intent intent = new Intent(this,ActivityBtnUlaval.class);
        startActivity(intent);
    }

    public void newActivityProfile(View view){

        Intent i = new Intent(this,Activity4.class);
        i.putExtra("Prenom",profil.getPrenom());
        i.putExtra("DDN",profil.getDdn());
        i.putExtra("IDUL",profil.getIdul());
        i.putExtra("Nom",profil.getNom());

        startActivity(i);
    }
    public void webViewActivity(View view) {
        Intent i = new Intent(this,WebviewActivity.class);
        startActivity(i);

    }

}
