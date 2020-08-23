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
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_machine.view.*
import pl.jaworskimateusz.machineservice.R
import pl.jaworskimateusz.machineservice.data.entity.Machine

class MachineRecyclerViewAdapter(val context: Context, private val onMachineListener: OnMachineListener) :  ListAdapter<Machine, MachineRecyclerViewAdapter.MachineViewHolder>(MachineDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MachineViewHolder {
        return MachineViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_machine, parent, false), onMachineListener)
    }

    override fun onBindViewHolder(holder: MachineViewHolder, position: Int) {
        val item = getItem(position)
        holder.name.text = item.name

        if (!item.image.isNullOrEmpty()) {
            Picasso.get().load(item.image).placeholder(R.drawable.ic_empty_image).into(holder.image)
        }

    }

    inner class MachineViewHolder(private val view: View, private val onMachineListener: OnMachineListener) : RecyclerView.ViewHolder(view), View.OnClickListener {
        val name: TextView = view.tw_name
        val image: ImageView = view.iw_image

        init {
            view.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            onMachineListener.onMachineClick(adapterPosition)
        }
    }

    interface OnMachineListener {
        fun onMachineClick(position: Int)
    }

}

private class MachineDiffCallback : DiffUtil.ItemCallback<Machine>() {

    override fun areItemsTheSame(oldItem: Machine, newItem: Machine): Boolean {
        return oldItem.machineId == newItem.machineId
    }

    override fun areContentsTheSame(oldItem: Machine, newItem: Machine): Boolean {
        return oldItem == newItem
    }
}