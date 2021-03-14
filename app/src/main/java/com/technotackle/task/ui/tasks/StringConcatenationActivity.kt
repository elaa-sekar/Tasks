package com.technotackle.task.ui.tasks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.technotackle.task.databinding.ActivityStringConcatenationActivityBinding

class StringConcatenationActivity : AppCompatActivity() {

    lateinit var binding: ActivityStringConcatenationActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStringConcatenationActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initOnClickListeners()
    }

    private fun initOnClickListeners() {
        binding.apply {
            btnGetResult.setOnClickListener {
                etInput1.text.toString().let { input1 ->
                    etInput2.text.toString().let { input2 ->
                        setResult(input1, input2)
                    }
                }
            }
        }
    }

    private fun setResult(input1: String, input2: String) {
        binding.resultOutput.text = getResult(input1, input2)
    }

    private fun getResult(input1: String, input2: String): String {
        var output = ""
        val maxSize = input1.length.coerceAtLeast(input2.length)
        for (index in 0 until maxSize) {
            output += "${
                if (index < input1.length) input1[index] else ""
            }${
                if (index < input2.length) input2[index] else ""
            }"
        }
        return output
    }
}