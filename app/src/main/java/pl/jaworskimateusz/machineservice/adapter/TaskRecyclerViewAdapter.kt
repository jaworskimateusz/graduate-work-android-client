/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pl.jaworskimateusz.machineservice.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_task.view.*
import pl.jaworskimateusz.machineservice.R
import pl.jaworskimateusz.machineservice.data.entity.Task
import pl.jaworskimateusz.machineservice.utilities.DateUtils

class TaskRecyclerViewAdapter(val context: Context) :  ListAdapter<Task, TaskRecyclerViewAdapter.TaskViewHolder>(TaskDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return TaskViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_task, parent, false))
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val item = getItem(position)
        holder.title.text = item.title
        holder.date.text = DateUtils.dateToString(item.date)
        val imageView =  holder.itemView.findViewById<ImageView>(R.id.iw_solved)
        setSolved(imageView, item.solved)
        //TODO onClickListener
    }

    inner class TaskViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.tw_title
        val date: TextView = view.tw_date
        val solved: ImageView = view.iw_solved
        val taskDetails: ImageButton = view.ib_task_details
        val mView: View = view
    }

    private fun setSolved(imageView: ImageView, solved: Int) {
        imageView.setImageDrawable(
                if (solved == 1)
                    ContextCompat.getDrawable(context, R.drawable.ic_task_solved)
                else
                    ContextCompat.getDrawable(context, R.drawable.ic_task_not_solved)
        )
    }


}

private class TaskDiffCallback : DiffUtil.ItemCallback<Task>() {

    override fun areItemsTheSame(oldItem: Task, newItem: Task): Boolean {
        return oldItem.taskId == newItem.taskId
    }

    override fun areContentsTheSame(oldItem: Task, newItem: Task): Boolean {
        return oldItem == newItem
    }
}