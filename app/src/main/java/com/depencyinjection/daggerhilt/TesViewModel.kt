package com.depencyinjection.daggerhilt

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class TesViewModel @Inject constructor(
    @Named("String1") testString1: String
): ViewModel() {
     init {
         Log.d("Tag","Test String from ViewModel+$testString1")
     }
}