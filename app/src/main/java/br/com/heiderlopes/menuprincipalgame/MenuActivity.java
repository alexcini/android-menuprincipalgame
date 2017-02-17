package br.com.heiderlopes.menuprincipalgame;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    private TextView tvTituloHeader, tvFooter;

    private Button btPlay, btSair;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Referencia nosso objeto com o layout
        btPlay = (Button) findViewById(R.id.btPlay);
        btSair = (Button) findViewById(R.id.btSair);

        tvTituloHeader = (TextView) findViewById(R.id.tvTituloHeader);
        tvFooter = (TextView) findViewById(R.id.tvFooter);

        //Cria a instancia da fonte que será utilizada
        Typeface fonte = Typeface.createFromAsset(getAssets(), "fonts/angrybirds.ttf");

        //Aplica a fonte nos botoes do game
        btPlay.setTypeface(fonte);
        btSair.setTypeface(fonte);

        tvTituloHeader.setTypeface(fonte);
        tvFooter.setTypeface(fonte);

    }

    public void play(View v) {
        //Exibirá uma mensagem para usuario informando que o jogo ainda está sendo construido
        Toast.makeText(this, "O jogo ainda está sendo construido", Toast.LENGTH_SHORT).show();
    }

    public void sair(View v) {
        //finaliza a activity atual
        finish();
    }
}
