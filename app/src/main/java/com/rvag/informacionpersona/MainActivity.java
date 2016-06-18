package com.rvag.informacionpersona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import com.rvag.informacionpersona.Objects.Persona;

import java.util.Date;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irSiguiente(View v)
    {
        int mDia, mMes, mAnio;
        GregorianCalendar gc = new GregorianCalendar();
        Persona p = new Persona();

        EditText edtNombre = (EditText)findViewById(R.id.edtNombre);
        p.setNombre(edtNombre.getText().toString());

        DatePicker dpFechaNacimiento = (DatePicker)findViewById(R.id.dpFechaNacimiento);
        mDia = dpFechaNacimiento.getDayOfMonth();
        mMes = dpFechaNacimiento.getMonth();
        mAnio = dpFechaNacimiento.getYear();
        gc.set(mAnio,mMes,mDia);
        p.setFechaNacimiento(gc.getTime());

        EditText edtTelefono = (EditText)findViewById(R.id.edtTelefono);
        p.setTelefono(edtTelefono.getText().toString());

        EditText edtCorreo = (EditText)findViewById(R.id.edtCorreo);
        p.setCorreo(edtCorreo.getText().toString());

        EditText edtDescripcion = (EditText)findViewById(R.id.edtDescripcion);
        p.setDescripcion(edtDescripcion.getText().toString());

        //LLamando a la pantalla de confirmación de datos
        Intent i = new Intent(this,ConfirmacionDatos.class);
        i.putExtra(getString(R.string.paramPersona),p);
        startActivity(i);

        /*
        EditText edtNombre = (EditText)findViewById(R.id.edtNombre);
        String nombre = edtNombre.getText().toString();

        DatePicker dpFechaNacimiento = (DatePicker)findViewById(R.id.dpFechaNacimiento);
        mDia = dpFechaNacimiento.getDayOfMonth();
        mMes = dpFechaNacimiento.getMonth();
        mAnio = dpFechaNacimiento.getYear();

        EditText edtTelefono = (EditText)findViewById(R.id.edtTelefono);
        String telefono = edtTelefono.getText().toString();

        EditText edtCorreo = (EditText)findViewById(R.id.edtCorreo);
        String correo = edtCorreo.getText().toString();

        EditText edtDescripcion = (EditText)findViewById(R.id.edtDescripcion);
        String descripcion = edtDescripcion.getText().toString();

        //LLamando a la pantalla de confirmación de datos
        Intent i = new Intent(this,ConfirmacionDatos.class);
        i.putExtra(getString(R.string.paramNombre),nombre);
        i.putExtra(getString(R.string.paramTelefono),telefono);
        i.putExtra(getString(R.string.paramCorreo),correo);
        i.putExtra(getString(R.string.paramDescripcion),descripcion);
        i.putExtra(getString(R.string.paramDia),String.valueOf(mDia));
        i.putExtra(getString(R.string.paramMes),String.valueOf(mMes + 1));
        i.putExtra(getString(R.string.paramAnio),String.valueOf(mAnio));
        startActivity(i); */
    }
}
