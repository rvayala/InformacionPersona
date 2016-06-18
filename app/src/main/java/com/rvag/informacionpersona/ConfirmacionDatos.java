package com.rvag.informacionpersona;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import com.rvag.informacionpersona.Objects.Persona;

import java.text.Format;
import java.text.SimpleDateFormat;

public class ConfirmacionDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_datos);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");

        Bundle extras = getIntent().getExtras();
        Persona p = (Persona) extras.getSerializable(getString(R.string.paramPersona));
        /*String nombre = extras.getString(getString(R.string.paramNombre));
        String fechaNacimiento = extras.getString(getString((R.string.paramDia))) + '/' + extras.getString(getString((R.string.paramMes))) + '/' + extras.getString(getString((R.string.paramAnio)));
        String telefono = extras.getString(getString(R.string.paramTelefono));
        String correo = extras.getString(getString(R.string.paramCorreo));
        String Descripcion = extras.getString(getString(R.string.paramDescripcion));*/

        TextView lblResultadoNombre = (TextView) findViewById(R.id.lblResultadoNombre);
        TextView lblFechaNacimiento = (TextView) findViewById(R.id.lblResultadoFechaNacimiento);
        TextView lblResultadoTelefono = (TextView) findViewById(R.id.lblResultadoTelefono);
        TextView lblResultadoCorreo = (TextView) findViewById(R.id.lblResultadoCorreo);
        TextView lblResultadoDescripcion = (TextView) findViewById(R.id.lblResultadoDescripcion);

        lblResultadoNombre.setText(p.getNombre());
        lblFechaNacimiento.setText(formatter.format(p.getFechaNacimiento()));
        lblResultadoTelefono.setText(p.getTelefono());
        lblResultadoCorreo.setText(p.getCorreo());
        lblResultadoDescripcion.setText(p.getDescripcion());
    }

    public void CorregirDatos(View v)
    {
        this.finish();
    }
}
