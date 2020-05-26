package com.example.ladm_u4_practica2_canvassensores_gerardohuizar

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.view.MotionEvent

class FiguraGeometrica () {
    var x = 0f
    var y = 0f
    var tipo = 1 //1 circulo 2 rectangulo
    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var incX = 5

    var imgMuestra : Bitmap ?= null


    constructor(x:Int, y:Int, radio:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
        //dando valor a ancho y alto para tratar circulo como cuadrado

        ancho = this.radio*2
        alto = ancho
    }


    //Constructor para hacer que reciba un BitMap
    constructor( bitmap:Bitmap,x: Int, y:Int):this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        imgMuestra = bitmap
        ancho = imgMuestra!!.width.toFloat()
        alto = imgMuestra!!.height.toFloat()
        tipo =3
    }

    constructor(x:Int, y:Int, ancho:Int, alto:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.ancho = ancho.toFloat()
        this.alto = alto.toFloat()
        tipo = 2
    }

    fun pintar(c: Canvas, p: Paint){
        when(tipo){
            1->{
                c.drawCircle(x+radio,y+radio,radio,p)
            }
            2->{
                c.drawRect(x,y,x+ancho,y+alto,p)
            }

            3->{
                c.drawBitmap(imgMuestra!!,x,y,p)

            }
        }
    }


    fun rebote(ancho:Float) {

        x += ancho

    }



}//End of class Figura Geometrica