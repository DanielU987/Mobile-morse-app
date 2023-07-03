package com.example.morze

import android.content.Context
import android.hardware.camera2.CameraAccessException
import android.hardware.camera2.CameraManager
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.text.Editable
import android.text.InputFilter
import android.text.InputFilter.AllCaps
import android.text.TextWatcher
import android.text.method.ScrollingMovementMethod
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val morze = findViewById<TextView>(R.id.morze)
        val vod = findViewById<EditText>(R.id.vod)
        val exit = findViewById<Button>(R.id.exit)
        val play = findViewById<Button>(R.id.play)
        val stop = findViewById<Button>(R.id.stop)
        val delete = findViewById<Button>(R.id.delete)
        val switch1 = findViewById<Switch>(R.id.switch1)
        val switch4 = findViewById<Switch>(R.id.switch4)
        val radio8 = findViewById<RadioButton>(R.id.radioButton8)
        val radio9 = findViewById<RadioButton>(R.id.radioButton9)
        val radio10 = findViewById<RadioButton>(R.id.radioButton10)
        morze.setMovementMethod(ScrollingMovementMethod())
        vod.setFilters(arrayOf<InputFilter>(AllCaps()))
        //val name: String = vod.getText().toString()

        exit.setOnClickListener {
            finishAffinity()
        }


        if (vod != null) {
            if (vod.text != null) {
                vod.addTextChangedListener(object : TextWatcher {

                    override fun afterTextChanged(s: Editable) {}


                    override fun beforeTextChanged(
                        s: CharSequence, start: Int,
                        count: Int, after: Int
                    ) {
                    }

                    override fun onTextChanged(
                        s: CharSequence, start: Int,
                        before: Int, count: Int
                    ) {

                        val word = s.toString().toCharArray().map { it.toString() }.toTypedArray()
                        val listok: MutableList<String> = ArrayList()
                        val j = word.size
                            var i = 0
                            while (i < j) {
                                when (word[i]) {
                                    " " -> {
                                        listok.add(" ")
                                        //morze.text = "·−"
                                        i++
                                    }
                                    "A" -> {
                                        listok.add("·− ")
                                        //morze.text = "·−"
                                        i++
                                    }
                                    "B" -> {
                                        listok.add("−··· ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "C" -> {
                                        listok.add("−·−· ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "D" -> {
                                        listok.add("−·· ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "E" -> {
                                        listok.add("· ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "F" -> {
                                        listok.add("··−· ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "G" -> {
                                        listok.add("−−· ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "H" -> {
                                        listok.add("···· ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "I" -> {
                                        listok.add("·· ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "J" -> {
                                        listok.add("·−−− ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "K" -> {
                                        listok.add("−·− ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "L" -> {
                                        listok.add("·−·· ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "M" -> {
                                        listok.add("−− ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "N" -> {
                                        listok.add("−· ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "O" -> {
                                        listok.add("−−− ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "P" -> {
                                        listok.add("·−−· ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "Q" -> {
                                        listok.add("−−·− ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "R" -> {
                                        listok.add("·−· ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "S" -> {
                                        listok.add("··· ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "T" -> {
                                        listok.add("− ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "U" -> {
                                        listok.add("··− ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "V" -> {
                                        listok.add("···− ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "W" -> {
                                        listok.add("·−− ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "X" -> {
                                        listok.add("−··− ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "Y" -> {
                                        listok.add("−·−− ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "Z" -> {
                                        listok.add("−−·· ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "1" -> {
                                        listok.add("·−−−− ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "2" -> {
                                        listok.add("··−−− ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "3" -> {
                                        listok.add("···−− ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "4" -> {
                                        listok.add("····− ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "5" -> {
                                        listok.add("····· ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "6" -> {
                                        listok.add("−···· ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "7" -> {
                                        listok.add("−−··· ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "8" -> {
                                        listok.add("−−−·· ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "9" -> {
                                        listok.add("−−−−· ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                    "0" -> {
                                        listok.add("−−−−− ")
                                        //morze.text = "·−·−"
                                        i++
                                    }
                                }
                            }

                        morze.text = listok.joinToString(
                            prefix = "",
                            separator = "",
                            postfix = "",
                            truncated = "",

                            )

                        val vivod = Array(morze.text.length) { morze.text[it].toString() }
                        //val vivod = morze.text.split("")
                        print(vivod)
                    }
                    //}
                })
            }
        }

        delete.setOnClickListener {
            morze.text = ""
            vod.text.clear()
        }
        fun showlight() {
            try {
                val camManager = getSystemService(Context.CAMERA_SERVICE) as CameraManager
                val cameraId: String?
                cameraId = camManager.getCameraIdList()[0]
                camManager.setTorchMode(cameraId, true)
            } catch (e: CameraAccessException) {
                e.printStackTrace()
            }
        }

        fun offlight() {
            try {
                val camManager1 = getSystemService(Context.CAMERA_SERVICE) as CameraManager
                val cameraId1: String?
                cameraId1 = camManager1.getCameraIdList()[0]
                camManager1.setTorchMode(cameraId1, false)
            } catch (e: CameraAccessException) {
                e.printStackTrace()
            }
        }

        fun vibro(sneg: Long) {
            val v = getSystemService(VIBRATOR_SERVICE) as Vibrator
            v.vibrate(VibrationEffect.createOneShot(sneg, VibrationEffect.DEFAULT_AMPLITUDE))
        }

        fun readmorze() {
            val vivod = Array(morze.text.length) { morze.text[it].toString() }
            print(vivod)
            var skorostpalki = 0
            var skorosttochki = 0
            var delay = 0
            if (radio8.isChecked) {
                skorostpalki = 920
                skorosttochki = 480
                delay = 480
            }
            if (radio9.isChecked) {
                skorostpalki = 480
                skorosttochki = 240
                delay = 240
            }
            if (radio10.isChecked) {
                skorostpalki = 240
                skorosttochki = 120
                delay = 120
            }
            val k = vivod.size
            var z = 0
            while (z < k) {
                try {
                    when (vivod[z]) {
                        "−" -> {
                            if (switch4.isChecked) {
                                showlight()
                            }
                            if (switch1.isChecked) {
                                vibro(skorostpalki.toLong())
                            }
                            Thread.sleep(skorostpalki.toLong())
                            offlight()
                            Thread.sleep(delay.toLong())
                            z++
                        }
                        "·" -> {
                            if (switch4.isChecked) {
                                showlight()
                            }
                            if (switch1.isChecked) {
                                vibro(skorosttochki.toLong())
                            }
                            Thread.sleep(skorosttochki.toLong())
                            offlight()
                            Thread.sleep(delay.toLong())
                            z++
                        } // 
                        " " -> {
                            Thread.sleep(delay.toLong())
                            z++
                        }
                        " " ->{
                            Thread.sleep(skorostpalki.toLong()-delay.toLong())
                            z++
                        }
                    }
                } catch (e: InterruptedException) {
                    offlight()
                    vibro(1)
                    break
                }
            }
        }
        switch4.setOnClickListener {
            if (switch1.isChecked == false && switch4.isChecked == false) {
                switch1.isChecked = true;
            }
        }
        switch1.setOnClickListener {
            if (switch1.isChecked == false && switch4.isChecked == false) {
                switch4.isChecked = true;
            }
        }

        var bober: Thread? = null
        stop.setOnClickListener {
            bober?.interrupt()
        }

        play.setOnClickListener {
            bober?.interrupt()
            bober = thread() {
                readmorze()
            }
        }
    }
}







