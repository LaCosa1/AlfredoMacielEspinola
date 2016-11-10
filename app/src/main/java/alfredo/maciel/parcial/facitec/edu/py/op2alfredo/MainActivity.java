package alfredo.maciel.parcial.facitec.edu.py.op2alfredo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Console;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    TextView Nombre;
    TextView Descripc;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= (ListView) findViewById(R.id.listView);
        Nombre= (TextView) findViewById(R.id.textViewNombre);
        Descripc= (TextView) findViewById(R.id.textViewDescripcion);
        imageView= (ImageView) findViewById(R.id.imageViewAvatar);


        final RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint("http://servidor-monkydevs.rhcloud.com").build();
        InterfaceModelo servicio = restAdapter.create(InterfaceModelo.class);
        servicio.ObtenerModelo(new Callback<ClaseModelo>() {
            @Override
            public void success(ClaseModelo claseModelo, Response response) {
                Nombre.setText(claseModelo.getUsername());
                Descripc.setText(claseModelo.getText());
                String mesage= "Lista recibida";
                Toast.makeText(getApplicationContext(), mesage, Toast.LENGTH_SHORT).show();


            }

            @Override
            public void failure(RetrofitError retrofitError) {

            }
        });



    }}

