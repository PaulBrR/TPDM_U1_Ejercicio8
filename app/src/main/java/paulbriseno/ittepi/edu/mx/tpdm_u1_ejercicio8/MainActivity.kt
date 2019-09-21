package paulbriseno.ittepi.edu.mx.tpdm_u1_ejercicio8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var campoCadena :EditText?=null
    var botonACt :Button?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        campoCadena=findViewById(R.id.campoCade)

        botonACt=findViewById(R.id.botonAct)

        botonACt?.setOnClickListener {
            var datos=campoCadena?.text.toString()


            var abrirMostrar = Intent(this,Main2Activity::class.java)
            abrirMostrar.putExtra("datos",datos)
            startActivity(abrirMostrar)

        }
    }
}
