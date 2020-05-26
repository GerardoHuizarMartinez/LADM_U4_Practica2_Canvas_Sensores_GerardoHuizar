package com.example.ladm_u4_practica2_canvassensores_gerardohuizar

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(),SensorEventListener {

    //lateinit var lienzo : Lienzo
    lateinit var sensorManager : SensorManager
    var lienzo  : Lienzo ?= null
    var posx = 0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lienzo = Lienzo(this)
        setContentView(lienzo!!)
        setTitle("Crash fakesillo")

        //Asignacion del objeto generico a un objeto especifico
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_GAME)
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY), SensorManager.SENSOR_DELAY_GAME)


        HiloAnimacion(this).start()
    }//End of onCreate

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
    }

    override fun onSensorChanged(event: SensorEvent) {
        if(event.sensor.type == Sensor.TYPE_ACCELEROMETER){
            posx = event.values[0]

        }

        //PROXIMIDAD
        if(event.sensor.type == Sensor.TYPE_PROXIMITY) {
            lienzo?.comSenso = (event.values[0] >= 1f)
        }//if

        lienzo?.invalidate()
    }


}//End class
