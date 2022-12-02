package br.com.etecia.listafilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listaFilmes;
    //Criar a base de dados para os filmes--> vetores
    String titulo []={"Avatar","Como eu era antes de você","Os croods","Invasão Zumbi","Wakanda Forever"};
    String desc []={"A paraplegic Marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home. When his brother is killed in a robbery, paraplegic Marine Jake Sully decides to take his place in a mission on the distant world of Pandora.",
            "Will (Sam Claflin) é um jovem rico e bem-sucedido, até sofrer um grave acidente que o deixa preso a uma cadeira de rodas. Profundamente depressivo, sua família contrata Louisa (Emilia Clarke) para fazer companhia a ele","After their cave is destroyed, a caveman family must trek through an unfamiliar fantastical world with the help of an inventive boy. \"The Croods\" are an eccentric family of cavemen, who survive the harsh terrain by living accordingly to a strict set of rules.","Enquanto o país é assolado por uma epidemia de zumbis, pai e filha partem em uma jornada de trem angustiante tentando chegar à única cidade que ainda não foi afetada.",
            "Wakanda Forever"
    };


    String acesso[]={"4.5","5.0","3.5","2.5","5.0"};
    int filmes[]={R.drawable.avatar,R.drawable.antes,R.drawable.croods,R.drawable.invazao,R.drawable.wakanda};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaFilmes = findViewById(R.id.idlistaFilmes);
        MyAdapter adapter = new MyAdapter();

        listaFilmes.setAdapter(adapter);
    }

    //criando uma Inner class
    public class MyAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return filmes.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            //Variáveis do modelo
            ImageView imagemFilme;
            TextView tituloFilme, descFilme, acessoFilme;

            //Adaptador ligando ao modelo
            View v = getLayoutInflater().inflate(R.layout.modelo_filmes, null);

            // APresentar as variaveis do java para o modelo xml
            imagemFilme = v.findViewById(R.id.idimageFilmes);
            tituloFilme = v.findViewById(R.id.idTituloFilme);
            descFilme =v.findViewById((R.id.idDescFilme));
            acessoFilme = v.findViewById((R.id.idAcessoFilmes));

            //Inserindo os valores nas variaveis java
            tituloFilme.setText(titulo[i]);
            descFilme.setText((desc[i]));
            acessoFilme.setText(acesso[i]);
            imagemFilme.setImageResource(filmes[i]);

            return v;
        }
    }
}