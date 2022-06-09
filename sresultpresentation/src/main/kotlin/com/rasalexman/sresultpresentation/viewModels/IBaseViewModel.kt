package com.rasalexman.sresultpresentation.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.rasalexman.sresult.data.dto.ISEvent
import com.rasalexman.sresult.data.dto.SResult

interface IBaseViewModel : IEventableViewModel {
    val selectedPage: MutableLiveData<Int>
    val eventLiveData: MutableLiveData<com.rasalexman.sresult.data.dto.ISEvent>
    val navigationLiveData: MutableLiveData<com.rasalexman.sresult.data.dto.SResult.NavigateResult>
    val anyLiveData: LiveData<*>?
    val resultLiveData: LiveData<*>?
    val supportLiveData: MutableLiveData<com.rasalexman.sresult.data.dto.SResult<Any>>

    val toolbarTitle: MutableLiveData<String>?
    val toolbarSubTitle: MutableLiveData<String>?
    val toolbarMenu: MutableLiveData<Int>?

    val liveDataToObserve: MutableList<LiveData<*>>
}