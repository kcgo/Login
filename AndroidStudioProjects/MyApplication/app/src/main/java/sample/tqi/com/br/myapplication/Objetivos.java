package sample.tqi.com.br.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Objetivos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_objetivos);
        RecyclerView recyclerView = findViewById (R.id.recycler);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled ( true );
        actionBar.setDisplayHomeAsUpEnabled(true);



        List<String> listAux = new ArrayList<>();

        listAux.add ("1.Aprender Melhor Android");
        listAux.add ("2.Aprender Melhor Android");
        listAux.add ("3.Aprender Melhor Android");
        listAux.add ("4.Aprender Melhor Android");



        AdapterObjetivos adapterObjetivos = new AdapterObjetivos (listAux, this);

        recyclerView.setAdapter (adapterObjetivos);

        RecyclerView.LayoutManager layout = new LinearLayoutManager (this,
                LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layout);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //Write your logic here
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}