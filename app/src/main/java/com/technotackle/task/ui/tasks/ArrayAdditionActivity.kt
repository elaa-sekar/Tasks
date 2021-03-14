package com.technotackle.task.ui.tasks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.technotackle.task.databinding.ActivityArrayAdditionBinding
import com.technotackle.task.util.LogicUtil

class ArrayAdditionActivity : AppCompatActivity() {

    lateinit var binding: ActivityArrayAdditionBinding
    private val numbersList1 = arrayOf(10, 15, 545, 20, 16, 70, 100, 90, 66, 36)
    private val numbersList2 = arrayOf(11, 51, 456, 28, 61, 86, 426, 30, 44, 63)

    companion object {
        const val MAX_TO_MIN = 1
        const val MIN_TO_MAX = 2
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArrayAdditionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showInputs()
        initOnClickListeners()
    }

    private fun showInputs() {
        binding.apply {
            inputNumbersList1.text = getInput1Values()
            inputNumbersList2.text = getInput2Values()
        }
    }

    private fun getInput1Values(): String {
        var input1 = ""
        for ((index, number) in numbersList1.withIndex()) {
            input1 += "$number${
                if (index == numbersList1.lastIndex) "." else ",  "
            }"
        }
        return input1
    }

    private fun getInput2Values(): String {
        var input2 = ""
        for ((index, number) in numbersList2.withIndex()) {
            input2 += "$number${
                if (index == numbersList1.lastIndex) "." else ",  "
            }"
        }
        return input2
    }

    private fun initOnClickListeners() {
        binding.apply {
            btnMaxToMin.setOnClickListener {
                setOutput(MAX_TO_MIN)
            }
            btnMinToMax.setOnClickListener {
                setOutput(MIN_TO_MAX)
            }
        }
    }

    private fun setOutput(type: Int) {
        binding.resultOutput.text = getOutput(type)
    }

    private fun getOutput(type: Int): String {
        val min: Int
        val max: Int
        if (type == MIN_TO_MAX) {
            min = LogicUtil.getMinValue(numbersList1)
            max = LogicUtil.getMaxValue(numbersList2)
        } else {
            max = LogicUtil.getMaxValue(numbersList1)
            min = LogicUtil.getMinValue(numbersList2)
        }
        val output = max + min
        return if (type == MIN_TO_MAX) "$min + $max = $output" else "$max + $min = $output"
    }



}