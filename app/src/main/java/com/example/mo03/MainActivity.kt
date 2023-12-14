package com.example.mo03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1: EditText = findViewById(R.id.num1)
        val mark: TextView = findViewById(R.id.mark)
        val num2: EditText = findViewById(R.id.num2)
        val answer: TextView = findViewById(R.id.answer)
        val plus: Button = findViewById(R.id.plus)
        val minus: Button = findViewById(R.id.minus)
        val multiply: Button = findViewById(R.id.multiply)
        val divider: Button = findViewById(R.id.divider)
        val modulo: Button = findViewById(R.id.modulo)
        val clear: Button = findViewById(R.id.clear)

        plus.setOnClickListener {
            if (num1.text.toString() == "" || num2.text.toString() == "") {
                Toast.makeText(this, "Please input num1 and num2!!", Toast.LENGTH_SHORT).show()
            } else {
                var a = num1.text.toString().toInt() + num2.text.toString().toInt()
                mark.setText("+")
                answer.setText(a.toString())
            }
        }
        minus.setOnClickListener {
            if (num1.text.toString() == "" || num2.text.toString() == "") {
                Toast.makeText(this, "Please input num1 and num2!!", Toast.LENGTH_SHORT).show()
            } else {
                var a = num1.text.toString().toInt() - num2.text.toString().toInt()
                mark.setText("-")
                answer.setText(a.toString())
            }
        }
            multiply.setOnClickListener {
                if (num1.text.toString() == "" || num2.text.toString() == "") {
                    Toast.makeText(this, "Please input num1 and num2!!", Toast.LENGTH_SHORT).show()
                } else {
                    var a = num1.text.toString().toInt() * num2.text.toString().toInt()
                    mark.setText("x")
                    answer.setText(a.toString())
                }
            }
            divider.setOnClickListener {
                if (num1.text.toString() == "" || num2.text.toString() == "") {
                    Toast.makeText(this, "Please input num1 and num2!!", Toast.LENGTH_SHORT).show()
                } else {
                    var a = num1.text.toString().toDouble() / num2.text.toString().toDouble()
                    mark.setText("/")
                    answer.setText(a.toString())
                }
            }
            modulo.setOnClickListener {
                if (num1.text.toString() == "" || num2.text.toString() == "") {
                    Toast.makeText(this, "Please input num1 and num2!!", Toast.LENGTH_SHORT).show()
                } else {
                    var a = num1.text.toString().toDouble() % num2.text.toString().toDouble()
                    mark.setText("%")
                    answer.setText(a.toString())
                }
            }
            clear.setOnClickListener {
                num1.setText("")
                mark.setText("")
                num2.setText("")
                answer.setText("")
            }
        }
    }