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
import kotlinx.android.synthetic.main.activity_issues.view.*
import kotlinx.android.synthetic.main.item_issue.view.*
import kotlinx.android.synthetic.main.item_machine.view.*
import pl.jaworskimateusz.machineservice.R
import pl.jaworskimateusz.machineservice.data.entity.Issue
import pl.jaworskimateusz.machineservice.data.entity.Machine

class IssueRecyclerViewAdapter(val context: Context, private val onIssueListener: OnIssueListener) :  ListAdapter<Issue, IssueRecyclerViewAdapter.IssueViewHolder>(IssueDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IssueViewHolder {
        return IssueViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_issue, parent, false), onIssueListener)
    }

    override fun onBindViewHolder(holder: IssueViewHolder, position: Int) {
        val item = getItem(position)
        holder.keywords.text = item.keywords
    }

    inner class IssueViewHolder(private val view: View, private val onIssueListener: OnIssueListener) : RecyclerView.ViewHolder(view), View.OnClickListener {
        val keywords: TextView = view.tw_keywords

        init {
            view.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            onIssueListener.onIssueClick(adapterPosition)
        }
    }

    interface OnIssueListener {
        fun onIssueClick(position: Int)
    }
}

private class IssueDiffCallback : DiffUtil.ItemCallback<Issue>() {

    override fun areItemsTheSame(oldItem: Issue, newItem: Issue): Boolean {
        return oldItem.issueId == newItem.issueId
    }

    override fun areContentsTheSame(oldItem: Issue, newItem: Issue): Boolean {
        return oldItem == newItem
    }
}