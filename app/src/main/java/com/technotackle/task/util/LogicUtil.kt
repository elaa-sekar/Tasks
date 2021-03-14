package com.technotackle.task.util

object LogicUtil {

    fun getMaxValue(inputs: Array<Int>): Int {
        var maxValue = inputs[0]
        for (number in inputs) {
            maxValue = if (number > maxValue) number else maxValue
        }
        return maxValue
    }

    fun getMinValue(inputs: Array<Int>): Int {
        var minValue = inputs[0]
        for (number in inputs) {
            minValue = if (number < minValue) number else minValue
        }
        return minValue
    }

    fun getOutput1(input: String) : String {
        var output = ""
        for((index, char) in input.withIndex()){
            if(index % 2 == 0){
                output += char
            }
        }
        return output
    }

    fun getOutput2(input: String) : String {
        var output = ""
        for((index, char) in input.withIndex()){
            if(index % 2 == 1){
                output += char
            }
        }
        return output
    }

    fun getResult(input1: String, input2: String): String {
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