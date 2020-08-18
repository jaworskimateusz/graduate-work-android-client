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
package pl.jaworskimateusz.machineservice.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import pl.jaworskimateusz.machineservice.data.entity.Task
import pl.jaworskimateusz.machineservice.data.repository.TaskRepository
import java.util.*

class TaskViewModel internal constructor(
        val taskRepository: TaskRepository
) : ViewModel() {

    private val mutableLiveData = MutableLiveData<SearchingParams>()

    private val taskList: LiveData<List<Task>> = Transformations.switchMap(
            mutableLiveData,
            ::getTasksByDates
    )

    private fun getTasksByDates(params: SearchingParams) = taskRepository.getTasksByDatesLiveData(
            params.dateFrom,
            params.dateTo,
            params.solved
    )

    fun getTasksByDates(
            dateFrom: Date,
            dateTo: Date,
            solved: Int
    ) = apply {
        mutableLiveData.value = SearchingParams(dateFrom, dateTo, solved)
    }

    fun getTasks() = taskList

    data class SearchingParams(
            var dateFrom: Date,
            var dateTo: Date,
            var solved: Int
    )
}