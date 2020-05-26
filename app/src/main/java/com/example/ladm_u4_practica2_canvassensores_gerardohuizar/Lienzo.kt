package com.example.ladm_u4_practica2_canvassensores_gerardohuizar

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.media.MediaPlayer
import android.view.MotionEvent
import android.view.View

class Lienzo(p:MainActivity) : View(p) {
    // se requiere p para que view sepa cual activity va a trabajar
    /*var cx = 150f
    var cy = 150f
    var tx = 733f
    var ty = 818f*/
    var incX = 0f
    var puntero = p
    var comSenso = true
    var montana1 = FiguraGeometrica(-300, 900, 350)
    var montana2 = FiguraGeometrica(800, 900, 350)
    var copa = FiguraGeometrica(570, 1020, 170)
    var tronco = FiguraGeometrica(700, 1300, 80, 200)
    var sueloCafe = FiguraGeometrica(-600, 1150, 1200)
    var sol = FiguraGeometrica(800, 100, 150)
    //var punteroFiguraGeometrica: FiguraGeometrica? = null

    //La variable contendra la imagen
    var icono =FiguraGeometrica(BitmapFactory.decodeResource(resources,R.drawable.crbandi), 100,1500)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        if(comSenso){
            canvas.drawColor(Color.rgb(116, 228, 225))


            //Dibujando montana1
            paint.style = Paint.Style.FILL
            paint.color = Color.GREEN
            montana1.pintar(canvas, paint)
            paint.style = Paint.Style.STROKE
            paint.color = Color.BLUE
            montana1.pintar(canvas, paint)

            //Dibujando montana2
            paint.style = Paint.Style.FILL
            paint.color = Color.GREEN
            montana2.pintar(canvas, paint)
            paint.style = Paint.Style.STROKE
            paint.color = Color.BLACK
            montana2.pintar(canvas, paint)


            //Dibujando Suelo
            paint.style = Paint.Style.FILL
            paint.color = Color.rgb(242, 197, 84  )
            sueloCafe.pintar(canvas, paint)
            paint.style = Paint.Style.STROKE
            paint.color = Color.BLACK
            paint.strokeWidth = 2f
            sueloCafe.pintar(canvas, paint)


            //Dibujando 2do ciculo
            paint.style = Paint.Style.FILL
            paint.color = Color.YELLOW
            sol.pintar(canvas, paint)
            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            paint.strokeWidth = 5f
            sol.pintar(canvas, paint)

            //tronco
            paint.style = Paint.Style.FILL
            paint.color = Color.rgb(202, 142, 3)
            tronco.pintar(canvas, paint)
            paint.style = Paint.Style.STROKE
            paint.color = Color.BLACK
            tronco.pintar(canvas, paint)


            //Dibujando copa
            paint.style = Paint.Style.FILL
            paint.color = Color.GREEN
            copa.pintar(canvas, paint)
            paint.style = Paint.Style.STROKE
            paint.color = Color.BLACK
            copa.pintar(canvas, paint)


            //canvas.drawBitmap(icono,200f,325f,paint)


            icono.pintar(canvas,paint)
        }else{

            canvas.drawColor(Color.rgb(26,72,82))
            var luna = FiguraGeometrica(750, 100, 175)

            //Dibujando montana1
            paint.style = Paint.Style.FILL
            paint.color = Color.rgb(66, 147, 44 )
            montana1.pintar(canvas, paint)
            paint.style = Paint.Style.STROKE
            paint.color = Color.BLACK
            montana1.pintar(canvas, paint)

            //Dibujando montana2
            paint.style = Paint.Style.FILL
            paint.color = Color.rgb(66, 147, 44 )
            montana2.pintar(canvas, paint)
            paint.style = Paint.Style.STROKE
            paint.color = Color.BLACK
            montana2.pintar(canvas, paint)


            //Dibujando Suelo
            paint.style = Paint.Style.FILL
            paint.color = Color.rgb(158, 141, 15 )
            sueloCafe.pintar(canvas, paint)
            paint.style = Paint.Style.STROKE
            paint.color = Color.BLACK
            paint.strokeWidth = 2f
            sueloCafe.pintar(canvas, paint)


            //Dibujando 2do ciculo
            paint.style = Paint.Style.FILL
            paint.color = Color.rgb(211, 210, 210)
            luna.pintar(canvas, paint)
            paint.style = Paint.Style.STROKE
            paint.color = Color.BLACK
            paint.strokeWidth = 2f
            luna.pintar(canvas, paint)

            //tronco
            paint.style = Paint.Style.FILL
            paint.color = Color.rgb(175, 123, 3 )
            tronco.pintar(canvas, paint)
            paint.style = Paint.Style.STROKE
            paint.color = Color.BLACK
            tronco.pintar(canvas, paint)


            //Dibujando copa
            paint.style = Paint.Style.FILL
            paint.color = Color.rgb(66, 147, 44 )
            copa.pintar(canvas, paint)
            paint.style = Paint.Style.STROKE
            paint.color = Color.BLACK
            copa.pintar(canvas, paint)

            var estre1 = FiguraGeometrica(150, 100, 10)
            var estre2 = FiguraGeometrica(800,600, 15)
            var estre3 = FiguraGeometrica(300, 250, 25)
            var estre4 = FiguraGeometrica(500, 500, 35)
            var estre5 = FiguraGeometrica(100, 350, 25)


            paint.style = Paint.Style.FILL
            paint.color = Color.rgb(250, 250, 249 )
            estre1.pintar(canvas, paint)
            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            estre1.pintar(canvas, paint)

            paint.style = Paint.Style.FILL
            paint.color = Color.rgb(250, 250, 249  )
            estre2.pintar(canvas, paint)
            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            estre2.pintar(canvas, paint)

            paint.style = Paint.Style.FILL
            paint.color = Color.rgb(250, 250, 249  )
            estre3.pintar(canvas, paint)
            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            estre3.pintar(canvas, paint)

            paint.style = Paint.Style.FILL
            paint.color = Color.rgb(250, 250, 249 )
            estre4.pintar(canvas, paint)
            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            estre4.pintar(canvas, paint)

            paint.style = Paint.Style.FILL
            paint.color = Color.rgb(250, 250, 249  )
            estre5.pintar(canvas, paint)
            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            estre5.pintar(canvas, paint)

            //canvas.drawBitmap(icono,200f,325f,paint)


            icono.pintar(canvas,paint)

        }//else


    }//On draw


    fun animarCirculo() {
        icono.rebote((puntero.posx)*-1)

        invalidate()
    }

}