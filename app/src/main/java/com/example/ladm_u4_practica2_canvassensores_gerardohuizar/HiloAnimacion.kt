package com.example.ladm_u4_practica2_canvassensores_gerardohuizar

class HiloAnimacion (p:MainActivity):Thread(){
    var puntero = p

    override fun run() {
        super.run()

        while(true){
            sleep(10)
            puntero.runOnUiThread {
                puntero.lienzo!!.animarCirculo()
            }
        }
    }
}