package com.technotackle.task.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.technotackle.task.databinding.ActivityMainBinding
import com.technotackle.task.ui.tasks.ArrayAdditionActivity
import com.technotackle.task.ui.tasks.StringConcatenationActivity
import com.technotackle.task.ui.tasks.StringSplitActivity

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    companion object {
        const val TASK_1 = 1
        const val TASK_2 = 2
        const val TASK_3 = 3
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initOnClickListeners()
    }

    private fun initOnClickListeners() {
        binding.apply {
            btnTask1.setOnClickListener {
                startTaskActivity(TASK_1)
            }
            btnTask2.setOnClickListener {
                startTaskActivity(TASK_2)
            }
            btnTask3.setOnClickListener {
                startTaskActivity(TASK_3)
            }
        }
    }

    private fun startTaskActivity(taskId: Int) {
        startActivity(
            Intent(
                this,
                when (taskId) {
                    TASK_1 -> StringSplitActivity::class.java
                    TASK_2 -> StringConcatenationActivity::class.java
                    else -> ArrayAdditionActivity::class.java
                }
            )
        )
    }
}