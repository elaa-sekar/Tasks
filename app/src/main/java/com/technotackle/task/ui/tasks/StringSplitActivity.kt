package com.technotackle.task.ui.tasks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.technotackle.task.databinding.ActivityStringSplitBinding

class StringSplitActivity : AppCompatActivity() {

    lateinit var binding: ActivityStringSplitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStringSplitBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickListener()
    }

    private fun initClickListener() {
        binding.apply {
            btnGetResult.setOnClickListener {
                etInput.text.toString().let {
                    setOutput1(it)
                    setOutput2(it)
                }
            }
        }
    }

    private fun setOutput1(input: String) {
        binding.resultOutput1.text = getOutput1(input)
    }

    private fun setOutput2(input: String) {
        binding.resultOutput2.text = getOutput2(input)
    }

    private fun getOutput1(input: String) : String {
        var output = ""
        for((index, char) in input.withIndex()){
            if(index % 2 == 0){
                output += char
            }
        }
        return output
    }

    private fun getOutput2(input: String) : String {
        var output = ""
        for((index, char) in input.withIndex()){
            if(index % 2 == 1){
                output += char
            }
        }
        return output
    }

}