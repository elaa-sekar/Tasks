package com.technotackle.task.ui.tasks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.technotackle.task.databinding.ActivityStringSplitBinding
import com.technotackle.task.util.LogicUtil

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
        binding.resultOutput1.text = LogicUtil.getOutput1(input)
    }

    private fun setOutput2(input: String) {
        binding.resultOutput2.text = LogicUtil.getOutput2(input)
    }





}