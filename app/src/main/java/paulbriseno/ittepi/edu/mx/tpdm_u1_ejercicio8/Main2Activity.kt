package paulbriseno.ittepi.edu.mx.tpdm_u1_ejercicio8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class Main2Activity : AppCompatActivity() {
    var poner :EditText?=null
    var label: TextView?=null
    var mostrar: Button?=null
    var aux =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        poner= findViewById(R.id.posicion)
        label=findViewById(R.id.resultados)
        mostrar=findViewById(R.id.botonMos)

        mostrar?.setOnClickListener {
            aux=poner?.text.toString().toInt()

            var cadena =intent.extras?.getString("datos")
            var subcadena = cadena?.split(",")

            if(aux <0 || aux >= subcadena!!.size){
                var alerta = AlertDialog.Builder(this)
                alerta.setTitle("Resultado").setMessage("No existe esa posicion").setPositiveButton("Aceptar"){dialogInterface, i ->  }.show()
                return@setOnClickListener
            }else {
                label?.setText("Posicion: " + aux + "\n Esta el elemento: " + subcadena!![aux])
            }
            poner?.setText("")
            }

        
    }
}
