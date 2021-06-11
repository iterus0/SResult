package com.rasalexman.sresultexample

import com.rasalexman.sresultexample.databinding.FragmentMainBinding
import com.rasalexman.sresultpresentation.databinding.BaseBindingFragment

class MainFragment : BaseBindingFragment<FragmentMainBinding, MainViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_main

    override val toolbarTitleResId: Int
        get() = R.string.title_main

}