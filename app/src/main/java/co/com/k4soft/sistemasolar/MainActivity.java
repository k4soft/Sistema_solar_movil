package co.com.k4soft.sistemasolar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import co.com.k4soft.sistemasolar.adapter.PlanetaAdapter;
import co.com.k4soft.sistemasolar.entity.Planeta;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.listViewPlanetas)
    public ListView listViewPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        loadInfo();
    }

    private void loadInfo() {
        List<Planeta> listaPlanetas = new ArrayList<>();
        listaPlanetas.add(new Planeta(R.drawable.tierra, "Tierra", "La Tierra (del latín Terra,17\u200B deidad romana equivalente a Gea, diosa griega de la feminidad y la fecundidad) es un planeta del sistema solar que gira alrededor de su estrella —el Sol— en la tercera órbita más interna"));
        listaPlanetas.add(new Planeta(R.drawable.marte, "Marte", "Marte es el cuarto planeta en orden de distancia al Sol y el segundo más pequeño del sistema solar, después de Mercurio."));
        listaPlanetas.add(new Planeta(R.drawable.jupiter, "Marte", "Júpiter es el quinto planeta del sistema solar. Forma parte de los denominados planetas exteriores o gaseosos. Recibe su nombre del dios romano Júpiter (Zeus en la mitología griega)."));
        PlanetaAdapter planetaAdapter = new PlanetaAdapter(this, listaPlanetas);
        listViewPlanetas.setAdapter(planetaAdapter);
    }
}
