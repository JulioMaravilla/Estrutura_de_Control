package com.example.estruturadecontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

data class Cursos(val nombre: String, val url:String)
class MainActivity : AppCompatActivity() {

    val react = Cursos("React", "react")
    val kot = Cursos("Kotlin", "kotlin")
    var cursoActual = react.copy()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById(R.id.button) as Button
        boton.setOnClickListener {
                view -> switchCurso(cursoActual)
        }

    }

    fun switchCurso(curso:Cursos)
    {
        cursoActual = curso.copy()
        when (curso.url)
        {
            "react" -> cursoActual = kot.copy()
            "kotlin" -> cursoActual= react.copy()
            else -> print("esto no se ve")
        }
        verPantalla("Curso de ${cursoActual.nombre} en platzi.com/ ${cursoActual.url}")

    }

    fun verPantalla(s: String) {
        val txt = findViewById(R.id.texto) as TextView
        txt.setText(s)
    }
    fun cursos(): String = ""
}


