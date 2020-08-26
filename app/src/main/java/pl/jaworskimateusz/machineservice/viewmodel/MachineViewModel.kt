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
import pl.jaworskimateusz.machineservice.data.entity.Issue
import pl.jaworskimateusz.machineservice.data.entity.Machine
import pl.jaworskimateusz.machineservice.data.repository.MachineRepository

class MachineViewModel internal constructor(
        val machineRepository: MachineRepository
) : ViewModel() {

    private val machinesMutableLiveData = MutableLiveData<MachinesSearchingParams>()
    private val issueMutableLiveData = MutableLiveData<IssuesSearchingParams>()

    private val machineList: LiveData<List<Machine>> = Transformations.switchMap(
            machinesMutableLiveData,
            ::getMachinesByName
    )

    private val issueList: LiveData<List<Issue>> = Transformations.switchMap(
            issueMutableLiveData,
            ::getIssuesByKeywords
    )

    private fun getMachinesByName(params: MachinesSearchingParams) = machineRepository.getMachinesByNameLiveData(
            params.name
    )

    private fun getIssuesByKeywords(params: IssuesSearchingParams) = machineRepository.getIssuesByKeywordsLiveData(
            params.keywords,
            params.machineId
    )

    fun getMachinesByName(name: String) = apply {
        machinesMutableLiveData.value = MachinesSearchingParams(name)
    }

    fun getIssuesByKeywords(keywords: String, machineId: Long) = apply {
        issueMutableLiveData.value = IssuesSearchingParams(keywords, machineId)
    }


    fun getMachines() = machineList

    fun getIssues() = issueList

    data class MachinesSearchingParams(val name: String)

    data class IssuesSearchingParams(val keywords: String, val machineId: Long)

}