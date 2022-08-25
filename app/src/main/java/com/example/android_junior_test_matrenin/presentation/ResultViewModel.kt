package com.example.android_junior_test_matrenin.presentation

import androidx.lifecycle.ViewModel
import com.example.android_junior_test_matrenin.domain.usecase.BestScoreUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ResultViewModel @Inject constructor(private val bestScoreUseCase: BestScoreUseCase) :
    ViewModel() {

    fun getBestScore(): Int =
        bestScoreUseCase.getBestScore()
}