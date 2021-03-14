package com.technotackle.task.ui.tasks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.technotackle.task.databinding.ActivityStringConcatenationActivityBinding
import com.technotackle.task.util.LogicUtil

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
        binding.resultOutput.text = LogicUtil.getResult(input1, input2)
    }


}