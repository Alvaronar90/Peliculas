package com.example.estacionvl_tc_014.estrenos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.estacionvl_tc_014.estrenos.adapters.PeliculaAdapter;
import com.example.estacionvl_tc_014.estrenos.models.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView list;

   PeliculaAdapter adapter;
    List<Pelicula> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);

        data = new ArrayList<>();
        adapter = new PeliculaAdapter(this, data);
        list.setAdapter(adapter);

        list.setOnItemClickListener(this);

        cargarPeliculas();
    }


    public void cargarPeliculas(){

        Pelicula  p = new Pelicula();
        p.setCalificacion(3.5f);
        p.setDuracion("160");
        p.setTitulo("DeadPool");
        p.setUrl("http://elnorte-news.com/wp-content/uploads/2015/08/deadpool_icon___png_by_axeswy-d6alhm4.png");

        Pelicula p1 = new Pelicula();
        p1.setCalificacion(3.0f);
        p1.setDuracion("120");
        p1.setTitulo("Batman v Superman");
        p1.setUrl("http://www.telegraph.co.uk/content/dam/film/Batmanvsuperman/batmanvsuperman-xlarge.jpg");

        Pelicula p2 = new Pelicula();
        p2.setCalificacion(4.0f);
        p2.setDuracion("150");
        p2.setTitulo("Avengers");
        p2.setUrl("https://i.ytimg.com/vi/48fKIXlxaXk/maxresdefault.jpg");

        data.add(p);
        data.add(p1);
        data.add(p2);

        adapter.notifyDataSetChanged();



    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent intent = new Intent(this, segundaPantallaActivity.class);
        intent.putExtra("nombre", data.get(position).getTitulo());
        startActivity(intent);

    }
}
